package co.jp.smart_business.common.enums;

/**
 * 曜日
 * @author guanjj
 *
 */
public enum WeekEn {
    /** 日曜日 */
    SUNDAY("Sunday"),
    /** 月曜日 */
    MONDAY("Monday"),
    /** 火曜日 */
    TUESDAY("Tuesday"),
    /** 水曜日 */
    WEDNESDAY("Wednesday"),
    /** 木曜日 */
    THURSDAY("Thursday"),
    /** 金曜日 */
    FRIDAY("Friday"),
    /** 土曜日 */
    SATURDAY("Saturday");
    
    private final String code;
    
    /**
     * @param code
     */
    private WeekEn(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
