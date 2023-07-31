package co.jp.smart_business.common.enums;

/**
 * 退会フラグ
 * @author guanjj
 *
 */

public enum ResignatFlg {
    /** 会員中 */
    JOINING(""),
    /** 退会 */
    RESIGNATION("1");
    
    private final String code;
    
    /**
     * @param code
     */
    private ResignatFlg(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
