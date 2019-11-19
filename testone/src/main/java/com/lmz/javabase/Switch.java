package com.lmz.javabase;

import java.util.Random;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /**
         * switch实现石头/剪子/布并判断胜负
         */
        System.out.println("plase choice：");
        System.out.println("1:石头");
        System.out.println("2:剪刀");
        System.out.println("3:布");
        String []xz={"石头","剪刀","布"};
        //Java提供Scanner对象来方便输入，读取对应的类型可以使用：scanner.nextLine() / nextInt() / nextDouble() / ..
        int choice=0;
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();
        scanner.close();
         if (choice!=1&&choice!=2&&choice!=3){

             System.out.println("请输入1，2,3其中的一个数字");
         }
         else {
            System.out.println("您的选择是："+xz[choice-1]);
        }
           Random random=new Random();
           int num=random.nextInt(3);
           System.out.println("对方的选择是："+xz[num-1]);
           int res=choice-num;
          switch (res){
              case -2 :
                  System.out.println("你输了!");
                  break;
              case -1:
                  System.out.println("你赢了!");
                  break;
              case 0:
                  System.out.println("平局!");
                  break;
              case 1:
                  System.out.println("你输了!");
                  break;
              case 2:
                  System.out.println("你赢了!");
                  break;
               default:
                   System.out.println("Unexpected value");
          }
       }
    }

