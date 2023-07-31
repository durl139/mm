package co.jp.smart_business.common.enums;

/**
 * 曜日
 * @author guanjj
 *
 */
public enum WeekJp {
    /** 日曜日 */
    SUNDAY("日"),
    /** 月曜日 */
    MONDAY("月"),
    /** 火曜日 */
    TUESDAY("火"),
    /** 水曜日 */
    WEDNESDAY("水"),
    /** 木曜日 */
    THURSDAY("木"),
    /** 金曜日 */
    FRIDAY("金"),
    /** 土曜日 */
    SATURDAY("土");
    
    private final String code;
    
    /**
     * @param code
     */
    private WeekJp(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
