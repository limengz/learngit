package com.lmz.javabase;
public class Personttt {
    private String name;
    public  String getName(){
        return name;
    }
    public void setName(String name) {
      this.name= name; // 前面的this不可少，少了就变成局部变量name了
    }

    public static void main(String[] args) {
        Personttt t= new Personttt();
        String a="xiaohong";
        t.setName(a);
        System.out.println(t.getName());
        a="xiaolv"; //只是给a赋值，并没有改变t的指向
       // t.setName(a);  //重新给t赋值
        System.out.println(t.getName());

    }
}
