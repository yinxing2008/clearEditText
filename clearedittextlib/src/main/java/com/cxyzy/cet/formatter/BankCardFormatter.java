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
    public String getAllowableCharacters() {
        return "0123456789 ";
    }
}
