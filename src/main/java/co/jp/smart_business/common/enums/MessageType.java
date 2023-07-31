package co.jp.smart_business.common.enums;

/**
 * MessageType
 * @author wangqt
 */
public enum MessageType {
    /** テキスト */
    TEXT("1"),
    /** 画像 */
    IMAGE("2"),
    /** ビデオ */
    VIDEO("3");
    
    private final String code;

    /**
     * @param code
     */
    private MessageType(String code) {
        this.code = code;
    }

    public String code() {
        return this.code;
    }
}
