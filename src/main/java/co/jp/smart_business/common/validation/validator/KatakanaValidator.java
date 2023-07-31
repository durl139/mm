package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.Katakana;

/**
 * カタカナチェック
 * @author wangqt
 */
public class KatakanaValidator implements ConstraintValidator<Katakana, String> {
    
    private boolean allowSpace;

    @Override
    public void initialize(Katakana parameters) {
        allowSpace = parameters.allowSpace();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isKatakana(value, allowSpace);
    }

}
