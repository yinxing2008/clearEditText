package com.cxyzy.cet.formatter;

import com.cxyzy.cet.Constants;

public class InputTextFormatterFactory {
    public static InputTextFormatter getFormatter(int showType) {
        if (showType == Constants.TYPE_PHONE) {
            return new PhoneNumberFormatter();
        } else if (showType == Constants.TYPE_ID_CARD) {
            return new IdCardFormatter();
        } else if (showType == Constants.TYPE_BANK_CARD) {
            return new BankCardFormatter();
        } else {
            return new TextFormatter();
        }
    }
}
