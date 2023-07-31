package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.Hiragana;

/**
 * ひらがなチェック
 * @author wangqt
 */
public class HiraganaValidator implements ConstraintValidator<Hiragana, String> {

    private boolean allowSpace;

    @Override
    public void initialize(Hiragana parameters) {
        allowSpace = parameters.allowSpace();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isHiragana(value, allowSpace);
    }

}
