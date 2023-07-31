package co.jp.smart_business.common.validation.constraints;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.jp.smart_business.common.validation.validator.AlphaSymbolValidator;
import co.jp.smart_business.common.validation.constraints.AlphaSymbol.List;

/**
 * 英字記号チェックアノテーション
 * @author wangqt
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(List.class)
@Documented
@Constraint(validatedBy = AlphaSymbolValidator.class)
public @interface AlphaSymbol {

    String message() default "{co.jp.smart_business.common.validation.constraints.AlphaSymbol.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    @interface List {

        AlphaSymbol[] value();
    }
}
