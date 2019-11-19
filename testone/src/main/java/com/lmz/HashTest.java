package com.lmz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashTest {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();

//添加字典
        hm.put("username","pasword");
        hm.put("admin","123456");
        hm.put("test","123123");
        hm.put("lalala","111111");
        ////测试 key 是否包含 username,返回值为 ture/false
        System.out.println(hm.containsKey("username"));
        System.out.println("========================");
        //获取 key 所对应的 vlaue
        System.out.println(hm.get("admin"));
        System.out.println("========================");
        //获取整个字典数据
        System.out.println(hm.entrySet());
        System.out.println("========================");
        //循环打印每一对 key=value
        //Iterator迭代器
        Iterator<?> it=hm.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("========================");
        //分别获取 key 的值，和 value 的值。
       Iterator<String> it2=hm.keySet().iterator();
       while (it2.hasNext()){
           //获得字典的 key
           String un=(String)it2.next();
           System.out.println(un);
           //获得字典的 value(节点)
           String pwd=hm.get(un);
           System.out.println(pwd);

       }
    }
}
