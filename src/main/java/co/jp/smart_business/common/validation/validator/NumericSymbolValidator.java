package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.NumericSymbol;

/**
 * 数字記号チェック
 * @author wangqt
 */
public class NumericSymbolValidator implements ConstraintValidator<NumericSymbol, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isNumericSymbol(value);
    }

}
