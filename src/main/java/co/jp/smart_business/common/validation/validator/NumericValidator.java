package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.Numeric;

/**
 * 数字チェック
 * @author wangqt
 */
public class NumericValidator implements ConstraintValidator<Numeric, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isNumeric(value);
    }

}
