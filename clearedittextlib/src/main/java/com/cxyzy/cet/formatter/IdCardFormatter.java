package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.InputType;

/**
 * 身份证号格式化器
 */
public class IdCardFormatter extends BaseInputTextFormatter {
    @Override
    protected boolean isSpace(int length) {
        return length > 6 && (length == 7 || (length - 2) % 5 == 0);
    }

    @Override
    public InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter.LengthFilter(21)};
    }

    @Override
    public int getTextInputType() {
        return InputType.TYPE_CLASS_TEXT;
    }

    @Override
    public String getAllowableCharacters() {
        return "0123456789 xX";
    }
}
