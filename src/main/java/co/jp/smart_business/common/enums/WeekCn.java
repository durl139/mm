package co.jp.smart_business.common.enums;

/**
 * 曜日
 * @author guanjj
 *
 */
public enum WeekCn {
    /** 日曜日 */
    SUNDAY("日"),
    /** 月曜日 */
    MONDAY("一"),
    /** 火曜日 */
    TUESDAY("二"),
    /** 水曜日 */
    WEDNESDAY("三"),
    /** 木曜日 */
    THURSDAY("四"),
    /** 金曜日 */
    FRIDAY("五"),
    /** 土曜日 */
    SATURDAY("六");
    
    private final String code;
    
    /**
     * @param code
     */
    private WeekCn(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
