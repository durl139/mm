package co.jp.smart_business.common.enums;

/**
 * アップロード区分
 * @author guanjj
 *
 */
public enum IsDelete {
    /** 通常 */
    NOT_DELETE(""),
    /** 削除 */
    DELETED("1");

    private final String code;
    
    /**
     * @param code
     */
    private IsDelete(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
