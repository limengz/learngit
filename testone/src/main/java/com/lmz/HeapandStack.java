package com.lmz;

public class HeapandStack {

  public static void main(String[] args) {
//第一种使用new来创建的对象，它存放在堆中。每调用一次就创建一个新的对象。
    String str1 = new String("abc");
    String str2 = new String("abc");
    System.out.println(str1 == str2);
//第二种是先在栈中创建对象的引用str2，然后查找栈中有没有存放“abc”，如果没有，则将“abc”存放进栈，并将str2指向“abc”，如果已经有“abc”， 则直接将str2指向“abc”。
    String str3 = "abc";
    String str4 = "abc";
    System.out.println(str3 == str4);
    System.out.println(str1 == str3);
  }

}
