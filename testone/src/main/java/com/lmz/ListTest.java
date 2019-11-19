package com.lmz;

public class ListTest {
    public static  void main(String[]args){
        //通过循环将0~4 之间的5 个数放到的数组data[]中
        int[]data=new int[5];
        for(int i=1;i<5;i++){
            data[i]=i;
            System.out.println(data[i]);
        }
        String[]str=new String[3];
        str[0]="小明";
        str[1]="小红";
        str[2]="小黄";
        for(int j=0;j<=2;j++) {
            System.out.println(str[j]);
        }
        //直接为定义的数组分配元素的方式更为简便
        String[]str2={"bananas","apples","pears","oranges"};
        for (int k=0;k<str2.length;k++){
            System.out.println(str2[k]);
        }
    }
}
