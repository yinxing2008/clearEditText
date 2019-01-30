package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.InputType;

/**
 * 银行卡号格式化器
 */

public class BankCardFormatter extends BaseInputTextFormatter {
    @Override
    protected boolean isSpace(int length) {
        return length % 5 == 0;
    }

    @Override
    public InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter.LengthFilter(29)};
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
