package co.jp.smart_business.common.enums;

/**
 * 預金種類
 * @author guanjj
 *
 */
public enum depositType {
    /** 非表示 */
    HIDDEN("0"),
    /** 普通 */
    USUALLY("1"),
    /** 当座 */
    CURRENT("2"),
    /** 定期 */
    REGULAR("3"),
    /** その他 */
    OTHERS("4");
    
    private final String code;
    
    /**
     * @param code
     */
    private depositType(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
