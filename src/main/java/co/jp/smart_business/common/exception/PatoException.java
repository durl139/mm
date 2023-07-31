package co.jp.smart_business.common.exception;

import co.jp.smart_business.common.message.Messages;
import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * PatoException
 * @author wangqt
 */
@Getter
public class PatoException extends RuntimeException {
    
    private HttpStatus status = HttpStatus.OK;
    
    private String code;
    
    private Object[] params;
    
    public PatoException(Messages message) {
        super("Pato Exception. Message Code = " + message.value());
        this.code = message.value();
    }
    
    public PatoException(Messages message, Object... params) {
        super("Pato Exception. Message Code = " + message.value());
        this.code = message.value();
        this.params = params;
    }
    
    public PatoException(HttpStatus status, Messages message, Object... params) {
        super("Pato Exception. Message Code = " + message.value());
        this.code = message.value();
        this.params = params;
    }
}
