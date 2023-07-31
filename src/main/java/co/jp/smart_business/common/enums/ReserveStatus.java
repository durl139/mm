package co.jp.smart_business.common.enums;

/**
 * 予約ステータス
 * @author wangqt
 */
public enum ReserveStatus {
    /** 处理中(手続中) */
    PROCESSING("1"),
    /** 予約成功 */
    SUCCESS("2"),
    /** 予約失敗(取り下げ) */
    FAIL("3"),
    /** 予約取消 */
    CANCEL("4"),
    /** 削除 */
    DELETE("9");
    
    private final String code;
    
    /**
     * @param code
     */
    private ReserveStatus(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
