package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.AlphaNumericSymbol;

/**
 * 英数字記号チェック
 * @author wangqt
 */
public class AlphaNumericSymbolValidator implements ConstraintValidator<AlphaNumericSymbol, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isAlphaNumericSymbol(value);
    }

}
