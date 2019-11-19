package com.lmz.javabase;

public class DoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用do while计算M+...+N:
        do {
            sum += m;
            m++;
        }
        while (m <= n );
        System.out.println(sum);

    }

}
