package co.jp.smart_business.common.util;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * JwtTokenProvider
 * @author wangqt
 */
@Component
public class JwtTokenProvider {

    private static final Logger logger = LoggerFactory.getLogger(JwtTokenProvider.class);

    @Value("${security.token.secret-key}")
    private String tokenSecretKey;

    @Value("${security.token.expiration-hour}")
    private int tokenExpirationHour;

    public enum ValidationStatus {
        Valid,
        Invalid,
        Expired
    }

    /**
     * Tokenの作成
     * @param user
     * @return
     */
    public String generateToken(String username) {

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + tokenExpirationHour * 60 * 60 * 1000);

        Algorithm algorithm = Algorithm.HMAC512(tokenSecretKey);

        return JWT.create()
                .withIssuer("auth0")
                .withExpiresAt(expiryDate)
                .withSubject(username)
                .sign(algorithm);
    }

    /**
     * ユーザ名の取得処理
     * @param token
     * @return
     */
    public String getUsernameFromToken(String token) {
        Algorithm algorithm = Algorithm.HMAC512(tokenSecretKey);
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("auth0")
                .build();
        return verifier.verify(token).getSubject();
    }

    /**
     * Token認証
     * @param token
     * @return
     */
    public ValidationStatus validateToken(String token) {
        if (!StringUtils.hasLength(token)) {
            return ValidationStatus.Invalid;
        }
        
        // 有効期限チェック
        DecodedJWT jwt = JWT.decode(token);
        if (jwt.getExpiresAt().before(new Date())) {
            logger.error("Expired JWT token");
            return ValidationStatus.Expired;
        }
        
        try {
            Algorithm algorithm = Algorithm.HMAC512(tokenSecretKey);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build();
            verifier.verify(token);
            return ValidationStatus.Valid;
        } catch (JWTVerificationException e) {
            logger.error("invalid token", e);
        }
        return ValidationStatus.Invalid;
    }

}
