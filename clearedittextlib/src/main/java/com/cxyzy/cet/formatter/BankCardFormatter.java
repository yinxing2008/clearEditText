package com.cxyzy.cet.formatter;

/**
 * 银行卡号格式化器
 */

public class BankCardFormatter extends BaseInputTextFormatter {
    @Override
    public String getAllowableCharacters() {
        return "0123456789 ";
    }

    @Override
    public String getTextFormat() {
        return "####.####.####.####.####.####";
    }
}
