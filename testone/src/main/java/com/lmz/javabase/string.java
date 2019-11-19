package com.lmz.javabase;

public class string {
    public static void main(String[] args) {
      //  字符类型char是基本数据类型，它是character的缩写。一个char保存一个Unicode字符
         char c1 = 'A';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);
//        因为Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可：
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013
        System.out.println(n1);
        System.out.println(n2);


        // 注意是十六进制:
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013
        char c5=65;
        char c6=20013;
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        //和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符：
        String s = ""; // 空字符串，包含0个字符
        String s1 = "A"; // 包含一个字符
        String s2 = "ABC"; // 包含3个字符
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格

     //   Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型，这样极大地方便了字符串的处理。例如：
        String s4 = "Hello";
        String s5 = "world";
        String s6 = s4 + " " + s5 + "!";
        System.out.println(s);
//因为字符串使用双引号"..."表示开始和结束，那如果字符串本身恰好包含一个"字符怎么表示？例如，"abc"xyz"，编译器就无法判断中间的引号究竟是字符串的一部分还是表示字符串结束。这个时候，我们需要借助转义字符\：
        String s7 = "abc\"xyz";
        System.out.println(s7);
        //因为\是转义字符，所以，两个\\表示一个\字符：
        String s8 = "abc\\xyz";
        System.out.println(s8);
        //\" 表示字符"
        //\' 表示字符'
        //\\ 表示字符\
        //\n 表示换行符
        //\r 表示回车符
        //\t 表示Tab

        String s9 = "ABC\n\u4e2d\u6587";
        System.out.println(s9);


//如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串
        int age = 25;
        String s10 = "age is " + age;
        System.out.println(s10);
//Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变。考察以下代码：//原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。因此，字符串的不可变是指字符串内容不可变。
        String s11 = "hello";
        System.out.println(s11); // 显示 hello
        s11 = "world";
        System.out.println(s11); // 显示 world
        System.out.println("==================");
        //
        String s12 = "hello";
        String t = s12;
        s12 = "world";
        System.out.println(t); // t是"hello"还是"world"?

        //引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象。例如：
        String s13 = null; // s1是null
        String s14; // 没有赋初值值，s2也是null
        String s15 = s13; // s3也是null
        String s16 = ""; // s4指向空字符串，不是null


    }
}