package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.AlphaNumeric;

/**
 * 英数字チェック
 * @author wangqt
 */
public class AlphaNumericValidator implements ConstraintValidator<AlphaNumeric, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isAlphaNumeric(value);
    }

}
