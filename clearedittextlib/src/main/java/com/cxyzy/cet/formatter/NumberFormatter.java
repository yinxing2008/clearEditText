package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.InputType;

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
