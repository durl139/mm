package co.jp.smart_business.common.enums;

/**
 * 支払方法
 * @author wangqt
 */
public enum PaymentMethod {
    /** システムポイント */
    SYSTEM_POINT("1"),
    /** クレジットカード */
    CREDIT_CARD("2");
    
    private final String code;
    
    /**
     * @param code
     */
    private PaymentMethod(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
