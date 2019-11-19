package com.lmz.javabase;

public class For {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            System.out.println(ns[i]);
        }
//倒叙输出数组元素
        System.out.println("========================");
        System.out.println("数组长度："+ns.length);

        for(int j=ns.length-1;j>=0;j--) {
            System.out.println(ns[j]);
        }
        System.out.println("========================");
             /**圆周率π可以使用公式计算：
              *
              */
             double pi=0;
             for(int i=1;i<999999999;i=i+4){
                 int k=i+2;
                 // pi=pi+(4*(1/(double)i)-4*(1/(double)k));
                 //注意类型转换
                 pi+=4*((1.0/i)-(1.0/k));

             }
             System.out.println(pi);

        }
    }

