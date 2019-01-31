package com.cxyzy.cet.formatter;

import android.text.InputFilter;

public class CommonFormatter extends BaseInputTextFormatter {
    private static CommonFormatter INSTANCE = new CommonFormatter();

    private CommonFormatter() {
    }

    public static CommonFormatter getInstance() {
        return INSTANCE;
    }

    @Override
    protected boolean isSpace(int length) {
        return false;
    }

    @Override
    public String getAllowableCharacters() {
        return null;
    }
}
