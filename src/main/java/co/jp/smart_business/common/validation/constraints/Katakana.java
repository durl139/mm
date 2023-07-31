package co.jp.smart_business.common.validation.constraints;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.jp.smart_business.common.validation.validator.KatakanaValidator;
import co.jp.smart_business.common.validation.constraints.Katakana.List;

/**
 * カタカナチェックアノテーション
 * @author wangqt
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(List.class)
@Documented
@Constraint(validatedBy = KatakanaValidator.class)
public @interface Katakana {

    String message() default "{co.jp.smart_business.common.validation.constraints.Katakana.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
    
    /**
     * 全半角空白文字許可フラグ
     * @return size the element must be higher or equal to
     */
    boolean allowSpace() default false;

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    @interface List {

        Katakana[] value();
    }
}
