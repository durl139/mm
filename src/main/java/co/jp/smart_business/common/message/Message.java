package co.jp.smart_business.common.message;

/**
 * Message
 * @author wangqt
 *
 */
public class Message {

    /** code */
    private String code;

    /** message */
    private String message;

    public Message(String code) {
        super();
        this.code = code;
    }

    public Message(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * getCode
     * @return code
     */
    public String getCode() {
        return code;
    }

    /*
     * getMessage
     * @return message
     */
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "code: " + this.code + ". message: = " + this.message;
    }
    
    

}
