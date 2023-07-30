package co.jp.smart_business.common.http;

import java.util.Map;

import co.jp.smart_business.common.message.Message;

/**
 * HttpResponseBuilder
 * @author wangqt
 *
 */
public class HttpResponseBuilder {

    /**
     * message
     */
    private Message message;

    /**
     * error details
     */
    private Map<String, String> details;

    /**
     * body
     */
    private Object body;

    protected HttpResponseBuilder(Message message) {
        super();
        this.message = message;
    }

    /**
     * response details
     * @param details
     * @return
     */
    public HttpResponseBuilder details(Map<String, String> details) {
        this.details = details;
        return this;
    }

    /**
     * response body
     * @param body
     * @return
     */
    public HttpResponseBuilder body(Object body) {
        this.body = body;
        return this;
    }

    /**
     * build httpResponse
     * @return
     */
    public HttpResponse build() {
        return new HttpResponse(message.getCode(), message.getMessage(), details, body);
    }

}
