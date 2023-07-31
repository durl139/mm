package co.jp.smart_business.common.enums;

/**
 * アップロード区分
 * @author guanjj
 *
 */
public enum Channel {
    /** Girl upload */
    GIRL_UPLOAD("1"),
    /** user upload */
    USER_UPLOAD("2"),
    /** user upload */
    MESSAGE_UPLOAD("3"),
    /** user upload */
    SYSTEM_UPLOAD("4");

    private final String code;
    
    /**
     * @param code
     */
    private Channel(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
