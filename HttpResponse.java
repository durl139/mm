package co.jp.smart_business.common.http;

import java.util.Map;

import co.jp.smart_business.common.message.Message;
import co.jp.smart_business.common.message.Messages;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * HttpResponse
 * @author wangqt
 * 
 */
@JsonInclude(Include.NON_NULL)
public class HttpResponse {

    /**
     * code
     */
    private String code;

    /**
     * message
     */
    private String message;

    /**
     * error details
     */
    private Map<String, String> details;

    /**
     * body
     */
    private Object body;

    /**
     * @param code
     * @param message
     * @param details
     * @param body
     */
    public HttpResponse(String code, String message, Map<String, String> details, Object body) {
        super();
        this.code = code;
        this.message = message;
        this.details = details;
        this.body = body;
    }

    /**
     * ok
     * @return
     */
    public static HttpResponseBuilder ok() {
        return new HttpResponseBuilder(new Message(Messages.SUCCESS));
    }

    /**
     * fail
     * @param code
     * @param message
     * @return
     */
    public static HttpResponseBuilder fail(Message message) {
        return new HttpResponseBuilder(message);
    }

    /**
     * getCode
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * getMessage
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * getDetails
     * @return details
     */
    public Map<String, String> getDetails() {
        return details;
    }

    /**
     * getBody
     * @return body
     */
    public Object getBody() {
        return body;
    }

}
