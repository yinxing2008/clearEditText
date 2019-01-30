package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.InputType;

public class PasswordFormatter extends BaseInputTextFormatter {
    @Override
    protected boolean isSpace(int length) {
        return false;
    }

    @Override
    public InputFilter[] getInputFilter() {
        return null;
    }

    /**
     * 129对应密码，同： android:inputType="textPassword"
     * @return
     */
    @Override
    public int getTextInputType() {
        return 129;
    }

    @Override
    public String getAllowableCharacters() {
        return null;
    }
}
