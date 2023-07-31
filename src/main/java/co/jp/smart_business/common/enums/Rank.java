package co.jp.smart_business.common.enums;

/**
 * クラス
 * @author guanjj
 *
 */

public enum Rank {
    /** プレミアム */
    PREMIUM("1"),
    /** VIP */
    VIP("2"),
    /** ロイヤルVIP */
    ROYAL_VIP("3"),
    /** RED VIP */
    RED_VIP("4");
    
    private final String code;
    
    /**
     * @param code
     */
    private Rank(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
