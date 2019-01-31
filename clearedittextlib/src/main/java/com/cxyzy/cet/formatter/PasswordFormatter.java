package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.InputType;

public class PasswordFormatter extends BaseInputTextFormatter {
    @Override
    protected boolean isSpace(int length) {
        return false;
    }

    @Override
    public String getAllowableCharacters() {
        return null;
    }
}
