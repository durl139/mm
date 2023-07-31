package co.jp.smart_business.common.validation.constraints;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.jp.smart_business.common.validation.validator.NumericSymbolValidator;
import co.jp.smart_business.common.validation.constraints.NumericSymbol.List;

/**
 * 数字記号チェックアノテーション
 * @author wangqt
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(List.class)
@Documented
@Constraint(validatedBy = NumericSymbolValidator.class)
public @interface NumericSymbol {

    String message() default "{co.jp.smart_business.common.validation.constraints.NumberSymbol.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    @interface List {

        NumericSymbol[] value();
    }
}
