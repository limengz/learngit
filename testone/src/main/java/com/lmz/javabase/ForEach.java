package com.lmz.javabase;

public class ForEach {
    public static void main(String[] args) {

                int[] ns = { 1, 4, 9, 16, 25 };
                for (int n : ns) {
                    System.out.println(n);

                }
                //数组求和
                int sum=0;
                for (int n:ns){
                    sum+=n;
                }
                System.out.println(sum);
            }
        }
