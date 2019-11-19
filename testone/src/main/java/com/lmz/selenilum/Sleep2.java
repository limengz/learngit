package com.lmz.selenilum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.youdao.com");
        //try...catch 为Java 的异常处理。如上例在用到sleep()方法的地方都要加上异常处理。相比之下用throws
        //关键字的写法更为便捷。
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
