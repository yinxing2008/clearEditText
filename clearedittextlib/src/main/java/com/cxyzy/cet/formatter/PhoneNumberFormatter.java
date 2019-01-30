package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.InputType;

/**
 * 手机号格式化器
 */

public class PhoneNumberFormatter extends BaseInputTextFormatter {

    @Override
    protected boolean isSpace(int length) {
        return length >= 4 && (length == 4 || (length + 1) % 5 == 0);
    }

    @Override
    public InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter.LengthFilter(13)};
    }

    @Override
    public int getTextInputType() {
        return InputType.TYPE_CLASS_NUMBER;
    }

    @Override
    public String getAllowableCharacters() {
        return "0123456789 ";
    }
}
