# 功能描述
带清除按钮输入框，支持输入普通文字、数字、密码；支持分段显示身份证、手机号、银行卡。
本工程是androidx版本，appcompat-v7版本见：https://github.com/cxyzy1/clearEditText_v7
![](https://github.com/cxyzy1/clearEditText/raw/master/screenshot/Screenshot.png)
# 调用方法：
1. 添加依赖包
- 项目根目录下build.gradle的allprojects->repositories下增加`maven { url 'https://jitpack.io' }`
- app工程目录下build.gradle的dependencies中增加`implementation 'com.github.cxyzy1:clearEditText:1.0.3'`
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
3.扩展属性showType可选值和含义：
text：普通文字信息(不做任何限制)
phone：手机号(11位，分隔显示样例：155 8080 7070)
bankCardNo：银行卡(每四位增加一个分隔符，如：6200 1111 0000)
IDCardNo：身份证号(样例：410022 1990 0404 6623)

4.扩展属性textFormat，样例：
1). app:textFormat="### ### ####"
   格式化后结果如：123 456 7890
2). app:textFormat="## #### ####"
   格式化后结果如：12 3456 7890

关联博客:https://www.jianshu.com/p/ea33457348ed
