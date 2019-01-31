package com.cxyzy.cet.formatter;

public class CommonFormatter extends BaseInputTextFormatter {
    @Override
    protected boolean isSpace(int length) {
        return false;
    }

    @Override
    public String getAllowableCharacters() {
        return null;
    }
}
