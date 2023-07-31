package co.jp.smart_business.common.enums;

/**
 * 出勤状態
 * @author guanjj
 *
 */
public enum WorkStatus {
    /** 出勤しない */
    DO_NOT_WORK(""),
    /** 出勤する */
    WOR("1");
    
    private final String code;
    
    /**
     * @param code
     */
    private WorkStatus(String code) {
        this.code = code;
    }
    
    public String code() {
        return this.code;
    }
}
