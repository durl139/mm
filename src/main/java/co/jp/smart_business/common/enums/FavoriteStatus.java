package co.jp.smart_business.common.enums;

/**
 * 出勤状態
 * @author guanjj
 *
 */
public enum FavoriteStatus {
    /** いいねされた */
    FAVORITED("1"),
    /** 取り消しされた */
    CANCELED("2");
    
    private final String code;
    
    /**
     * @param code
     */
    private FavoriteStatus(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
