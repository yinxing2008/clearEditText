package com.cxyzy.cet.formatter;

/**
 * 身份证号格式化器
 */
public class IdCardFormatter extends BaseInputTextFormatter {
    @Override
    public String getAllowableCharacters() {
        return "0123456789 xX";
    }

    @Override
    public String getTextFormat() {
        return "######.####.####.####";
    }
}
