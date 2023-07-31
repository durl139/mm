package co.jp.smart_business.common.enums;

/**
 * アップロード区分
 * @author guanjj
 *
 */
public enum IsRecycle {
    /** 通常 */
    NOT_RECYCLE(""),
    /** ゴミ箱 */
    IN_RECYCLE("1");

    private final String code;
    
    /**
     * @param code
     */
    private IsRecycle(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
