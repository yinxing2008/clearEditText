package com.cxyzy.cet.formatter;

import android.text.InputFilter;

public class CommonFormatter extends BaseInputTextFormatter {
    @Override
    protected boolean isSpace(int length) {
        return false;
    }

    @Override
    public InputFilter[] getInputFilter() {
        return null;
    }

    @Override
    public String getAllowableCharacters() {
        return null;
    }
}
