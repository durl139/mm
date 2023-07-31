package co.jp.smart_business.common.enums;

/**
 * 予約Type
 * @author wangqt
 */
public enum ReserveType {
    /** 30分後（今すぐ） */
    HALF_HOUR_LATER("1"),
    /** 60分後 */
    ONE_HOUR_LATER("2"),
    /** 90分後 */
    ONE_AND_HALF_HOUR_LATER("3"),
    /** 上記時間以外 */
    OTHER("9");
    
    private final String code;
    
    /**
     * @param code
     */
    private ReserveType(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
