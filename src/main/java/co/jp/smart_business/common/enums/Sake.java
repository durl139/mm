package co.jp.smart_business.common.enums;

/**
 * お酒
 * @author guanjj
 *
 */

public enum Sake {
    /** 非表示 */
    HIDDEN("0"),
    /** 飲まない */
    DO_NOT_DRINK("1"),
    /** 飲む */
    DRINK("2"),
    /** 時々飲む */
    SOMETIMES_DRINK("3");
    
    private final String code;
    
    /**
     * @param code
     */
    private Sake(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
