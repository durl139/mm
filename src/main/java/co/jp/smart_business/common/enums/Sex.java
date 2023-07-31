package co.jp.smart_business.common.enums;

/**
 * SEX
 * @author guanjj
 *
 */
public enum Sex {
    /** 非表示 */
    HIDDEN("0"),
    /** 男 */
    MALE("1"),
    /** 女 */
    FEMALE("2"),
    /** 中性 */
    NEUTER("3");
    
    private final String code;
    
    /**
     * @param code
     */
    private Sex(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
