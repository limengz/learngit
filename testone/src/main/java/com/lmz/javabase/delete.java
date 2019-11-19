package com.lmz.javabase;

public class delete {
    public static void main(String[] args)
    {
        StringBuffer a = new StringBuffer("Runoob");
        StringBuffer b = new StringBuffer("Google");
        //start 1 end 3
        //delete(x, y) 删除从字符串 x 的索引位置开始到 y-1 的位置，append() 函数用于连接字符串。
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }
}
