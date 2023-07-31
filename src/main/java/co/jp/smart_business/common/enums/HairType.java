package co.jp.smart_business.common.enums;

/**
 * 髪型
 * @author guanjj
 *
 */

public enum HairType {
    /** 非表示 */
    HIDDEN("0"),
    /** ショート */
    SHORT("1"),
    /** ミディアム */
    MEDIUM("2"),
    /** ロング */
    LONG("3");
    
    private final String code;
    
    /**
     * @param code
     */
    private HairType(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
