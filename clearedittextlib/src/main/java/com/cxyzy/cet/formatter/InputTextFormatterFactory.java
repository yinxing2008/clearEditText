package com.cxyzy.cet.formatter;

import android.text.InputFilter;
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
        } else if (inputType == Constants.TYPE_PASSWORD) {
            return new PasswordFormatter();
        } else if (inputType == Constants.TYPE_NUMBER) {
            return new NumberFormatter();
        }else {
            return new CommonFormatter();
        }
    }

    public static void format(int inputType, EditText editText, TextWatcher watcher, int start, int before, int count) {
        getFormatter(inputType).format(editText, watcher, start, before, count);
    }

    public static InputFilter[] getInputFilter(int inputType) {
        return getFormatter(inputType).getInputFilter();
    }

    public static int getTextInputType(int inputType) {
        return getFormatter(inputType).getTextInputType();
    }

    public static String getAllowableCharacters(int inputType) {
        return getFormatter(inputType).getAllowableCharacters();
    }
}
