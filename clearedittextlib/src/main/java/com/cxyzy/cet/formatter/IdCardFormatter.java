package com.cxyzy.cet.formatter;

import android.text.InputFilter;

/**
 * 身份证号格式化器
 */
public class IdCardFormatter extends BaseInputTextFormatter {

    private static IdCardFormatter INSTANCE = new IdCardFormatter();

    public static IdCardFormatter getInstance() {
        return INSTANCE;
    }

    IdCardFormatter() {
        textFormat = "######.####.####.####";
    }

    @Override
    public String getAllowableCharacters() {
        return "0123456789 xX";
    }

}
