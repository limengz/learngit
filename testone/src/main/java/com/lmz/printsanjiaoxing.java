package com.lmz;

public class printsanjiaoxing {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
