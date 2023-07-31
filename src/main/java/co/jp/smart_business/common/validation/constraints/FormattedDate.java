package co.jp.smart_business.common.validation.constraints;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.jp.smart_business.common.validation.validator.FormattedDateValidator;
import co.jp.smart_business.common.validation.constraints.FormattedDate.List;

/**
 * 英字チェックアノテーション
 * @author wangqt
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(List.class)
@Documented
@Constraint(validatedBy = FormattedDateValidator.class)
public @interface FormattedDate {

    String message() default "{co.jp.smart_business.common.validation.constraints.FormattedDate.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
    
    /** format */
    String format();

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    @interface List {

        FormattedDate[] value();
    }
}
