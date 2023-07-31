package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.Symbol;

/**
 * 記号チェック
 * @author wangqt
 */
public class SymbolValidator implements ConstraintValidator<Symbol, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isSymbol(value);
    }

}
