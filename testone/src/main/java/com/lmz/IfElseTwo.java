package com.lmz;

public class IfElseTwo {

    public static void main(String[]args){

        int result=81;
        if(result>=90) {
            System.out.println("优秀");
        }
        else if(result>=80){
            System.out.println("良好");
        }
        else if (result>=60){
            System.out.println("及格");
        }
        else{
            System.out.println("不及格");
        }
    }
}
