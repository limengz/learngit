package com.lmz.javabase;

public class While {
    public static void main(String[] args) {
        //循环语句就是让计算机根据条件做循环计算，在条件满足时继续循环，条件不满足时退出循环。
        //while循环在每次循环开始前，首先判断条件是否成立。如果计算结果为true，就把循环体内的语句执行一遍，如果计算结果为false，那就直接跳到while循环的末尾，继续往下执行。
        //注意到while循环是先判断循环条件，再循环，因此，有可能一次循环都不做。
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用while计算M+...+N:
        while (m<=n){
          sum+=m;
          m++;
        }
        System.out.println("M+...+N:"+sum);
    }
}
