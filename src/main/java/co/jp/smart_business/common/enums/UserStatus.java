package co.jp.smart_business.common.enums;

/**
 * 利用状態
 * @author wangqt
 *
 */
public enum UserStatus {
    /** 仮アカウント作成 */
    PESUDO("0"),
    /** 正常 */
    VALID("1"),
    /** Locked */
    LOCKED("2"),
    /** 禁用 */
    INVALID("3")
    ;
    
    private final String code;
    
    /**
     * @param code
     */
    private UserStatus(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
