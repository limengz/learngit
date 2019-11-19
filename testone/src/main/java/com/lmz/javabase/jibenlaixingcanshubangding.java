package com.lmz.javabase;

public class jibenlaixingcanshubangding {

    public static void main(String[] args) {
        //调用方把参数传递给实例方法时，调用时传递的值会按参数位置一一绑定。
        Personone p = new Personone();
       int n = 15; // n的值为15
       p.setAge(n); // 传入n的值
       System.out.println(p.getAge()); // 15
       n = 20; // n的值改为20
        System.out.println(p.getAge()); // 15还是20?
    }
}
//运行代码，从结果可知，修改外部的局部变量n，不影响实例p的age字段，原因是setAge()方法获得的参数，复制了n的值，因此，p.age和局部变量n互不影响。
//
//结论：基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响。
    class Personone {

    private int age;
    //  把field从public改成private，外部代码不能访问这些field，那我们定义这些field有什么用？怎么才能给它赋值？怎么才能读取它的值
//所以我们需要使用方法（method）来让外部代码可以间接修改field


    //虽然外部代码不能直接修改private字段，但是，外部代码可以调用方法setName()和setAge()来间接修改private字段。
    // 在方法内部，我们就有机会检查参数对不对。比如，setAge()就会检查传入的参数，参数超出了范围，直接报错。这样，外部代码就没有任何机会把age设置成不合理的值。


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

