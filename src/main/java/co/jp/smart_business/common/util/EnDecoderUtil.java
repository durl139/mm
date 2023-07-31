package co.jp.smart_business.common.util;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

    /**
     * 文件描述 加密解密工具类
     **/
    public class EnDecoderUtil {

        private static final String ALGORITHM_DES = "des";
        private static final String ALGORITHM_RSA = "rsa";

        private static SecureRandom secureRandom;
        private static KeyPair keyPair;

        static {
            secureRandom = new SecureRandom();
            try {
                //创建密钥对KeyPair
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM_RSA);
                //密钥长度推荐为1024位
                keyPairGenerator.initialize(1024);
                keyPair = keyPairGenerator.generateKeyPair();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }

        /**
         * 根据key生成秘钥
         *
         * @param key 给定key,要求key至少长度为8个字符
         * @return SecretKey
         */
        public static SecretKey getSecretKey(final String key) {
            try {
                DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
                SecretKeyFactory instance = SecretKeyFactory.getInstance(ALGORITHM_DES);
                SecretKey secretKey = instance.generateSecret(desKeySpec);
                return secretKey;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        /**
         * DES加密
         *
         * @param key     秘钥key
         * @param content 待加密内容
         * @return byte[]
         */
        public static byte[] DESEncrypt(final String key, final String content) {
            return processCipher(content.getBytes(), getSecretKey(key), Cipher.ENCRYPT_MODE, ALGORITHM_DES);
        }

        /**
         * DES解密
         *
         * @param key            秘钥key
         * @param encoderContent 已加密内容
         * @return byte[]
         */
        public static byte[] DESDecrypt(final String key, final byte[] encoderContent) {
            return processCipher(encoderContent, getSecretKey(key), Cipher.DECRYPT_MODE, ALGORITHM_DES);
        }

        /**
         * 加密/解密处理
         *
         * @param processData 待处理的数据
         * @param key         提供的密钥
         * @param opsMode     工作模式
         * @param algorithm   使用的算法
         * @return byte[]
         */
        private static byte[] processCipher(final byte[] processData, final Key key,
                                            final int opsMode, final String algorithm) {
            try {
                Cipher cipher = Cipher.getInstance(algorithm);
                //初始化
                cipher.init(opsMode, key, secureRandom);
                return cipher.doFinal(processData);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }


    }
