package com.cxyzy.cet.formatter;

import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;

public interface InputTextFormatter {
    void format(EditText editText, TextWatcher watcher, int start, int before, int count);

    String getAllowableCharacters();
}
