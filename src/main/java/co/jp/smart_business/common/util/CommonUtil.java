package co.jp.smart_business.common.util;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * CommonUtil
 * @author wangqt
 */
public class CommonUtil {

    /**
     * ランダム数字の生成
     * @param digitsCount
     * @return
     */
    public static String randomDigits(int digitsLength) {
        return String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, digitsLength - 1)));
    }

    /**
     * 各種番号の生成(オーダーNo等)
     * @return
     */
    public static String generateVariousNO() {
        return DateUtil.getYmdhmsDateTime(new Date()) + randomDigits(6);
    }

    /**
     * JSONへの変換
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        if (obj == null) return null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

}
