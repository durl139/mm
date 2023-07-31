package co.jp.smart_business.common.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.jp.smart_business.common.util.CheckUtil;
import co.jp.smart_business.common.validation.constraints.FormattedDate;

/**
 * 日付フォーマットチェック
 * @author wangqt
 */
public class FormattedDateValidator implements ConstraintValidator<FormattedDate, String> {
    
    private String format;

    @Override
    public void initialize(FormattedDate parameters) {
        format = parameters.format();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CheckUtil.isFormattedDate(value, format);
    }

}
