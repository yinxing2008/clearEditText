package com.cxyzy.cet.formatter;

import android.text.InputFilter;

/**
 * 手机号格式化器
 */

public class PhoneNumberFormatter extends BaseInputTextFormatter {

    private static PhoneNumberFormatter INSTANCE = new PhoneNumberFormatter();

    public static PhoneNumberFormatter getInstance() {
        return INSTANCE;
    }

    PhoneNumberFormatter()
    {
        textFormat ="###.####.####";
    }

    @Override
    public String getAllowableCharacters() {
        return "0123456789 ";
    }

    @Override
    public InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter.LengthFilter(13)};
    }
}
