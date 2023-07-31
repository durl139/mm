package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.Alpha;

/**
 * 英字チェック
 * @author wangqt
 */
public class AlphaValidator implements ConstraintValidator<Alpha, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isAlpha(value);
    }

}
