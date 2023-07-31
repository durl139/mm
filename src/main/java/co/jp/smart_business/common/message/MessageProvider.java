package co.jp.smart_business.common.message;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;

/**
 * MessageProvider
 * @author wangqt
 */
public class MessageProvider extends ReloadableResourceBundleMessageSource {
    
    @Autowired
    private LocaleResolver localeResolver;
    
    /**
     * getMessage
     * @param code
     * @param args
     * @return
     */
    public Message getMessage(Messages code, Object... args) {
        String message = this.getStringMessage(code, args);
        return new Message(code.value(), message);
    }
    
    /**
     * getMessage
     * @param request
     * @param code
     * @param args
     * @return
     */
    public Message getMessage(HttpServletRequest request, Messages code, Object... args) {
        String message = this.getStringMessage(request, code, args);
        return new Message(code.value(), message);
    }
    
    /**
     * getStringMessage
     * @param code
     * @param args
     * @return
     */
    public Message getMessage(String code, Object... args) {
        String message = super.getMessage(code, args, LocaleContextHolder.getLocale());
        return new Message(code, message);
    }
    
    /**
     * getStringMessage
     * @param code
     * @param args
     * @return
     */
    public String getStringMessage(Messages code, Object... args) {
        return super.getMessage(code.value(), args, LocaleContextHolder.getLocale());
    }
    
    /**
     * getStringMessage
     * @param request
     * @param code
     * @param args
     * @return
     */
    public String getStringMessage(HttpServletRequest request, Messages code, Object... args) {
        Locale locale = localeResolver.resolveLocale(request);
        return super.getMessage(code.value(), args, locale);
    }

}
