package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.Zenkaku;

/**
 * 全角チェック
 * @author wangqt
 */
public class ZenkakuValidator implements ConstraintValidator<Zenkaku, String> {
    
    private boolean allowSpace;

    @Override
    public void initialize(Zenkaku parameters) {
        allowSpace = parameters.allowSpace();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isZenkaku(value, allowSpace);
    }

}
