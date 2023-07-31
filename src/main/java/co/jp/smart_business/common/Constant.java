package co.jp.smart_business.common;

/**
 * Constant
 * @author wangqt
 *
 */
public class Constant {

    private Constant() {
    }

    /** 固定StoreID */
    public static String DESENCEYPT_KEY = "kYTKKkeR8KjPxj5zAAMnNxGJibc5vP6zGrOIAy9bqHNXVKzhkxSdq";

    /** Domain */
    public static String DOMAIN= "http://localhost:8080";

    /** 固定StoreID */
    public static String STORE_ID = "100";

    /** 権限: ユーザー */
    public static String ROLE_DRIVER_USER = "ROLE_DRIVER_USER";

    /** 権限: site user */
    public static String ROLE_COMP_USER = "ROLE_COMP_USER";
    
    /** 権限: system user */
    public static String ROLE_SYSTEM_USER = "ROLE_SYSTEM_USER";
    
    /** send mail title */
    public static String MAIL_SEND_MSG = "さま";
    
    /** 予備銀行ID */
    public static String BANK_ID = "100";

    /** user 作成時、mail内容に確認URL */
    public static String GIRL_USER_ADD_VERIFY_URL = "/girl/signup/verify?code=";
    
    /** 忘记密码、mail内容に確認URL */
    public static String  GIRL_FORGOT_PASSOWORD_MAIL_URL= "/girl/forgot-password/reset?code=";

    /** site user 作成時、mail内容に確認URL */
    public static String USER_ADD_VERIFY_URL = "/signup/verify?code=";
    
    /** site 忘记密码、mail内容に確認URL */
    public static String  FORGOT_PASSOWORD_MAIL_URL= "/forgot-password/reset?code=";

    /** マスクフラグ */
    public static String MASK_FLAG = "1";

    /** システムユーザ */
    public static String SYSTEM_USER = "SYSTEM";
}
