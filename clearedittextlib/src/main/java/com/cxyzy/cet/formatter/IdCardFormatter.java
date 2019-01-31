package com.cxyzy.cet.formatter;

/**
 * 身份证号格式化器
 */
public class IdCardFormatter extends BaseInputTextFormatter {

    IdCardFormatter() {
        textFormat = "######.####.####.####";
    }

    @Override
    public String getAllowableCharacters() {
        return "0123456789 xX";
    }

}
