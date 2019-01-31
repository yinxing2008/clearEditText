package com.cxyzy.cet.formatter;

import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.cxyzy.cet.Constants;

public abstract class BaseInputTextFormatter implements InputTextFormatter {
    protected final int DEFAULT_MAX_LEN = 50;
    protected int[] splitLenArr = new int[]{3, 4, 4};
    protected int[] splitPosArr;
    protected String textFormat;

    public BaseInputTextFormatter() {
        splitPosArr = getSplitPosArr();
    }

    protected int[] getSplitPosArr() {
        int[] arr = new int[splitLenArr.length - 1];
        arr[0] = splitLenArr[0] + 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + splitLenArr[i + 1] + 1;
        }
        return arr;
    }


    @Override
    public void format(EditText editText, TextWatcher watcher, int start, int before, int count) {
        Editable s = editText.getText();
        if (s == null) {
            return;
        }

        //判断是否是在中间输入，需要重新计算
        boolean isMiddle = (start + count) < (s.length());
        //在末尾输入时，是否需要加入空格
        boolean isNeedSpace = false;
        if (!isMiddle && isSpace(s.length())) {
            isNeedSpace = true;
        }
        if (isMiddle || isNeedSpace || count > 1) {
            String newStr = s.toString();
            newStr = newStr.replace(" ", "");
            StringBuilder sb = new StringBuilder();
            int spaceCount = 0;
            for (int i = 0; i < newStr.length(); i++) {
                sb.append(newStr.substring(i, i + 1));
                //如果当前输入的字符下一位为空格(i+1+1+spaceCount)，因为i是从0开始计算的，所以一开始的时候需要先加1
                if (isSpace(i + 2 + spaceCount)) {
                    sb.append(" ");
                    spaceCount += 1;
                }
            }
            editText.removeTextChangedListener(watcher);
            s.replace(0, s.length(), sb);
            //如果是在末尾的话,或者加入的字符个数大于零的话（输入或者粘贴）
            if (!isMiddle || count > 1) {
                editText.setSelection(s.length() <= DEFAULT_MAX_LEN ? s.length() : DEFAULT_MAX_LEN);
            } else {
                //如果是删除
                if (count == 0) {
                    //如果删除时，光标停留在空格的前面，光标则要往前移一位
                    if (isSpace(start - before + 1)) {
                        editText.setSelection((start - before) > 0 ? start - before : 0);
                    } else {
                        editText.setSelection((start - before + 1) > s.length() ? s.length() : (start - before + 1));
                    }
                }
                //如果是增加
                else {
                    if (isSpace(start - before + count)) {
                        editText.setSelection((start + count - before + 1) < s.length() ? (start + count - before + 1) : s.length());
                    } else {
                        editText.setSelection(start + count - before);
                    }
                }
            }
            editText.addTextChangedListener(watcher);
        }
    }

    protected boolean isSpace(int length) {
        boolean result = false;
        if (!TextUtils.isEmpty(textFormat)
                && length < textFormat.length() && length > 0
                && containsSplit(length)) {
            result = true;
        }
        return result;
    }

    private boolean containsSplit(int length) {
        return textFormat.charAt(length - 1) == Constants.SPLIT;
    }

    @Override
    public void setTextFormat(String textFormat)
    {
        this.textFormat = textFormat;
    }
}
