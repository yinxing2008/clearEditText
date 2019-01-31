package com.cxyzy.cet.formatter;

public class CommonFormatter extends BaseInputTextFormatter {
    private static CommonFormatter INSTANCE = new CommonFormatter();

    CommonFormatter() {
    }

    public static CommonFormatter getInstance() {
        return INSTANCE;
    }

    @Override
    public String getAllowableCharacters() {
        return null;
    }
}
