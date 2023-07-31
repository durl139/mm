package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.Hankaku;

/**
 * 半角チェック
 * @author wangqt
 */
public class HankakuValidator implements ConstraintValidator<Hankaku, String> {
    
    private boolean allowSpace;
    
    @Override
    public void initialize(Hankaku parameters) {
        allowSpace = parameters.allowSpace();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isHankaku(value, allowSpace);
    }

}
