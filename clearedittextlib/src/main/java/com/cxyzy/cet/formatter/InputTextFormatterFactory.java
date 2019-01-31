package com.cxyzy.cet.formatter;

import android.text.TextWatcher;
import android.widget.EditText;

import com.cxyzy.cet.Constants;

public class InputTextFormatterFactory {
    private static InputTextFormatter getFormatter(int inputType) {
        if (inputType == Constants.TYPE_PHONE) {
            return new PhoneNumberFormatter();
        } else if (inputType == Constants.TYPE_ID_CARD) {
            return new IdCardFormatter();
        } else if (inputType == Constants.TYPE_BANK_CARD) {
            return new BankCardFormatter();
        } else {
            return new CommonFormatter();
        }
    }

    public static void format(int inputType, EditText editText, TextWatcher watcher, int start, int before, int count) {
        getFormatter(inputType).format(editText, watcher, start, before, count);
    }

    public static String getAllowableCharacters(int inputType) {
        return getFormatter(inputType).getAllowableCharacters();
    }
    public static String getTextFormat(int inputType) {
        return getFormatter(inputType).getTextFormat();
    }

}
