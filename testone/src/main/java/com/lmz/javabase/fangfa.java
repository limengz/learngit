package com.lmz.javabase;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class fangfa {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setAge(20);
        ming.setName("xioaming");
        System.out.println("名字："+ming.getName());
        System.out.println("年龄："+ming.getAge());
        //把field从public改成private，外部代码不能访问这些field，那我们定义这些field有什么用？怎么才能给它赋值？怎么才能读取它的值？
       // ming.name = "Xiao Ming"; // 对字段name赋值
      //  ming.age = 12; // 对字段age赋值

    }
}

class Person {
    private String name;
    private int age;
  //  把field从public改成private，外部代码不能访问这些field，那我们定义这些field有什么用？怎么才能给它赋值？怎么才能读取它的值
//所以我们需要使用方法（method）来让外部代码可以间接修改field


    //虽然外部代码不能直接修改private字段，但是，外部代码可以调用方法setName()和setAge()来间接修改private字段。
    // 在方法内部，我们就有机会检查参数对不对。比如，setAge()就会检查传入的参数，参数超出了范围，直接报错。这样，外部代码就没有任何机会把age设置成不合理的值。
    public String getName() {
            return this.name;
        }

        public void setName(String name) {
            if (name == null ||name=="") {
                throw new IllegalArgumentException("invalid name");
            }
            this.name = name.trim();
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            if (age < 0 || age > 100) {
                throw new IllegalArgumentException("invalid age value");
            }
            this.age = age;
    }
}
