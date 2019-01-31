package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;

import com.cxyzy.cet.Constants;

public class InputTextFormatterFactory {
    private static InputTextFormatter getFormatter(int showType) {
        if (showType == Constants.TYPE_PHONE) {
            return PhoneNumberFormatter.getInstance();
        } else if (showType == Constants.TYPE_ID_CARD) {
            return IdCardFormatter.getInstance();
        } else if (showType == Constants.TYPE_BANK_CARD) {
            return BankCardFormatter.getInstance();
        } else {
            return CommonFormatter.getInstance();
        }
    }

    public static void format(int showType, EditText editText, TextWatcher watcher, int start, int before, int count) {
        getFormatter(showType).format(editText, watcher, start, before, count);
    }

    public static InputFilter[] getInputFilter(int showType) {
        return getFormatter(showType).getInputFilter();
    }

    public static String getAllowableCharacters(int showType) {
        return getFormatter(showType).getAllowableCharacters();
    }

    public static void setTextFormat(int showType, String textFormat) {
        getFormatter(showType).setTextFormat(textFormat);
    }

}
