package com.cxyzy.cet.formatter;

import android.text.InputFilter;

/**
 * 银行卡号格式化器
 */

public class BankCardFormatter extends BaseInputTextFormatter {

    private static BankCardFormatter INSTANCE = new BankCardFormatter();

    public static BankCardFormatter getInstance() {
        return INSTANCE;
    }

    BankCardFormatter() {
        textFormat = "####.####.####.####.####.####";
    }

    @Override
    public String getAllowableCharacters() {
        return "0123456789 ";
    }

    @Override
    public InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter.LengthFilter(29)};
    }
}
