package com.lmz;

public class Print {
    public static void main(String[] args) {
        //输出不换行
        char a='a';
        int b=1;
        System.out.print(a+",");
        System.out.println(b);
        //换行
        System.out.println("============================");
        System.out.println("END");
        //格式化输出
        //如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。
        // 格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式：
        double d=12300000;
        System.out.println(d);
        double PI=3.141592653;
        //%f格式化输出浮点数,  .2-
        System.out.printf("%.2f\n",PI);
        System.out.printf("%.4f",PI);

    }
}
