package com.cxyzy.cet.formatter;

/**
 * 手机号格式化器
 */

public class PhoneNumberFormatter extends BaseInputTextFormatter {
    @Override
    public String getAllowableCharacters() {
        return "0123456789 ";
    }

    @Override
    public String getTextFormat() {
        return "###.####.####";
    }
}
