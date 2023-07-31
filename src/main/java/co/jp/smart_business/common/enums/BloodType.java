package co.jp.smart_business.common.enums;

/**
 * 血液型
 * @author guanjj
 *
 */
public enum BloodType {
    /** 非表示 */
    HIDDEN("0"),
    /** A */
    A("1"),
    /** B */
    B("2"),
    /** O */
    O("3"),
    /** AB */
    AB("4");
    
    private final String code;
    
    /**
     * @param code
     */
    private BloodType(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
