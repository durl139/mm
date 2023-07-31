package co.jp.smart_business.common.enums;

/**
 * レベル
 * @author guanjj
 *
 */

public enum Level {
    /** 1 */
    LEVEL_01("1"),
    /** 2 */
    LEVEL_02("2"),
    /** 3 */
    LEVEL_03("3"),
    /** 4 */
    LEVEL_04("4"),
    /** 5 */
    LEVEL_05("5"),
    /** 6 */
    LEVEL_06("6"),
    /** 7 */
    LEVEL_07("7"),
    /** 8 */
    LEVEL_08("8"),
    /** 9 */
    LEVEL_09("9"),
    /** 10 */
    LEVEL_10("10");
    
    private final String code;
    
    /**
     * @param code
     */
    private Level(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
