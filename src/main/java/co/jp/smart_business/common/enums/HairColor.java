package co.jp.smart_business.common.enums;

/**
 * 髪の色
 * @author guanjj
 *
 */

public enum HairColor {
    /** 非表示 */
    HIDDEN("0"),
    /** 黒 */
    BLACK("1"),
    /** 白 */
    WHITE("2"),
    /** 茶色 */
    BROWN("3"),
    /** カラー */
    COLOR("4");
    
    private final String code;
    
    /**
     * @param code
     */
    private HairColor(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
