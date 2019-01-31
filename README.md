# 功能描述
带清除按钮输入框，支持输入普通文字、数字、密码；支持分段显示身份证、手机号、银行卡。
![](https://github.com/cxyzy1/clearEditText/raw/master/screenshot/Screenshot.png)
# 调用方法：
1. 添加依赖包
- 项目根目录下build.gradle的allprojects->repositories下增加`maven { url 'https://jitpack.io' }`
- app工程目录下build.gradle的dependencies中增加`implementation 'com.github.cxyzy1:clearEditText:1.0.1'`
2. xml中使用样例
```
<com.cxyzy.cet.ClearEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="请输入手机号"
            android:paddingStart="15dp"
            android:paddingLeft="15dp"
            android:paddingTop="15dp"
            android:paddingEnd="15dp"
            android:paddingRight="15dp"
            android:paddingBottom="15dp"
            app:showType="phone" />
```
showType可选值和含义：
common：普通文字信息(不做任何限制)  
phone：手机号(11位，分隔显示样例：155 8080 7070)  
bank_card_no：银行卡(每四位增加一个分隔符，如：6200 1111 0000)  
id_card_no：身份证号(样例：410022 1990 0404 6623)  
password：密码  
number：数字，包含小数点(不做分段显示)   
