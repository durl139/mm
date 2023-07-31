package co.jp.smart_business.common.enums;

/**
 * 出勤状態
 * @author guanjj
 *
 */
public enum FileType {
    /** 画像 */
    IMAGE("1"),
    /** 動画 */
    VIDEO("2"),
    /** その他ファイル */
    FILE("3");

    private final String code;
    
    /**
     * @param code
     */
    private FileType(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
