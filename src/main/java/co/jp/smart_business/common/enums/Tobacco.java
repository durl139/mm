package co.jp.smart_business.common.enums;

/**
 * タバコ
 * @author guanjj
 *
 */

public enum Tobacco {
    /** 非表示 */
    HIDDEN("0"),
    /** 飲まない */
    DO_NOT_SMOKE("1"),
    /** 飲む */
    SMOKE("2"),
    /** 時々飲む */
    SOMETIMES_SMOKE("3");
    
    private final String code;
    
    /**
     * @param code
     */
    private Tobacco(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
