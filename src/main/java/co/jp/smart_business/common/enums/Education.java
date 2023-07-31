package co.jp.smart_business.common.enums;

/**
 * 学歴
 * @author guanjj
 *
 */

public enum Education {
    /** 非表示 */
    HIDDEN("0"),
    /** 短大/専門学校卒 */
    JUNIOR_COLLEGE("1"),
    /** 高校卒 */
    HIGH_SCHOOL("2"),
    /** 大学卒 */
    COLLEGE("3"),
    /** 大学院卒 */
    GRADUATE_SCHOOL("4"),
    /** 大学院卒 */
    OTHERS("5");
    
    private final String code;
    
    /**
     * @param code
     */
    private Education(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
