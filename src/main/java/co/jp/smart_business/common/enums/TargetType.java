package co.jp.smart_business.common.enums;

/**
 * wallet業務区分
 * @author guanjj
 *
 */
public enum TargetType {
    /** charge */
    CHARGE("1"),
    /** order */
    ORDER("2"),
    /** order */
    WITHDRAW("3"),
    /** チャージギフト */
    CHARGE_GIFT("4");
    
    private final String code;
    
    /**
     * @param code
     */
    private TargetType(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
