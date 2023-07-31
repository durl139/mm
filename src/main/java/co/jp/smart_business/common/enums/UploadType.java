package co.jp.smart_business.common.enums;

/**
 * upload 区分
 * @author guanjj
 *
 */

public enum UploadType {
    /** 非表示 */
    FILE("1"),
    /** ショート */
    VIDEO("2");
    
    private final String code;
    
    /**
     * @param code
     */
    private UploadType(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
