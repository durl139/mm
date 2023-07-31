package co.jp.smart_business.common.enums;

/**
 * 曜日
 * @author guanjj
 *
 */
public enum WeekCode {
    /** 日曜日 */
    SUNDAY("0"),
    /** 月曜日 */
    MONDAY("1"),
    /** 火曜日 */
    TUESDAY("2"),
    /** 水曜日 */
    WEDNESDAY("3"),
    /** 木曜日 */
    THURSDAY("4"),
    /** 金曜日 */
    FRIDAY("5"),
    /** 土曜日 */
    SATURDAY("6");
    
    private final String code;
    
    /**
     * @param code
     */
    private WeekCode(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
