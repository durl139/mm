package co.jp.smart_business.common.enums;

/**
 * 曜日
 * @author guanjj
 *
 */
public enum WeekLang {
    /** 日本語 */
    JP("1"),
    /** 中国語 */
    CN("2"),
    /** 英語 */
    EN("3");
    
    private final String code;
    
    /**
     * @param code
     */
    private WeekLang(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
