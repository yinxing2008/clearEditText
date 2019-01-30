package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.InputType;

/**
 * 数字输入格式化器，支持输入数字和小数点
 */
public class NumberFormatter extends BaseInputTextFormatter {
    @Override
    protected boolean isSpace(int length) {
        return false;
    }

    @Override
    public InputFilter[] getInputFilter() {
        return null;
    }

    @Override
    public int getTextInputType() {
        return InputType.TYPE_CLASS_NUMBER;
    }

    @Override
    public String getAllowableCharacters() {
        return ".0123456789 ";
    }
}
