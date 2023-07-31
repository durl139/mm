package co.jp.smart_business.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * Validator
 * @author wangqt
 *
 */
public class CheckUtil {
    private CheckUtil() {}
    
    public static boolean isEmail(String str) {
        return Pattern.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", str);
    }
    
    /**
     * 英字チェック
     * @param str
     * @return
     */
    public static boolean isAlpha(String str) {
        return Pattern.matches("^\\p{Alpha}*$", str);
    }
    
    /**
     * 英数字チェック
     * @param str
     * @return
     */
    public static boolean isAlphaNumeric(String str) {
        return Pattern.matches("^\\p{Alnum}*$", str);
    }
    
    /**
     * 英字記号チェック
     * @param str
     * @return
     */
    public static boolean isAlphaSymbol(String str) {
        return Pattern.matches("^[\\p{Alpha}|\\p{Punct}]*$", str);
    }
    
    /**
     * 英数字記号チェック
     * @param str
     * @return
     */
    public static boolean isAlphaNumericSymbol(String str) {
        return Pattern.matches("^[\\p{Alnum}|\\p{Punct}]*$", str);
    }
    
    /**
     * 数字チェック
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        return Pattern.matches("^\\p{Digit}*$", str);
    }
    
    /**
     * 数字記号チェック
     * @param str
     * @return
     */
    public static boolean isNumericSymbol(String str) {
        return Pattern.matches("^[\\p{Digit}|\\p{Punct}]*$", str);
    }
    
    /**
     * 記号チェック
     * @param str
     * @return
     */
    public static boolean isSymbol(String str) {
        return Pattern.matches("^[\\p{Punct}]*$", str);
    }
    
    /**
     * ひらがなチェック(半角全角スペースを含める)
     * @param str
     * @return
     */
    public static boolean isHiragana(String str) {
        return isHiragana(str, false);
    }
    
    /**
     * ひらがなチェック
     * @param str
     * @param allowSpace
     * @return
     */
    public static boolean isHiragana(String str, boolean allowSpace) {
        if (allowSpace) return Pattern.matches("^[あ-ん 　]*$", str); 
        return Pattern.matches("^[あ-ん]+", str);
    }
    
    /**
     * 全角カタカナチェック
     * @param str
     * @return
     */
    public static boolean isKatakana(String str) {
        return isKatakana(str, false);
    }
    
    /**
     * 全角カタカナチェック
     * @param str
     * @param allowSpace
     * @return
     */
    public static boolean isKatakana(String str, boolean allowSpace) {
        if (allowSpace) return Pattern.matches("^[ァ-ヶー 　]*$", str);
        return Pattern.matches("^[ァ-ヶー]*$", str);
    }
    
    /**
     * 半角文字チェック
     * @param str
     * @return
     */
    public static boolean isHankaku(String str) {
        return isHankaku(str, false);
    }
    
    /**
     * 半角文字チェック
     * @param str
     * @param allowSpace
     * @return
     */
    public static boolean isHankaku(String str, boolean allowSpace) {
        if (allowSpace) return Pattern.matches("^[\\x20-\\x7e\\uFF65-\\uFF9F 　]*$", str);
        return Pattern.matches("^[\\x20-\\x7e\\uFF65-\\uFF9F]*$", str);
    }
    
    /**
     * 全角文字チェック
     * @param str
     * @return
     */
    public static boolean isZenkaku(String str) {
        return isZenkaku(str, false);
    }
    
    /**
     * 全角文字チェック
     * @param str
     * @param allowSpace
     * @return
     */
    public static boolean isZenkaku(String str, boolean allowSpace) {
        if (allowSpace) return Pattern.matches("^([^\\x20-\\x7e\\uFF65-\\uFF9F]|[ 　])*$", str);
        return Pattern.matches("^[^\\x20-\\x7e^\\uFF65-\\uFF9F]*$", str);
    }

    /**
     * 日付チェック
     * @param str
     * @param format 例: yyyy-MM-dd HH:mm:ss.SSS
     * @return
     */
    public static boolean isFormattedDate(String str, String format) {
        DateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            sdf.parse(str);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    /**
     * UUIDチェック
     * @param uuid
     * @return
     */
    public static boolean isUUID(String uuid) {
        return Pattern.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$", uuid);
    }
}
