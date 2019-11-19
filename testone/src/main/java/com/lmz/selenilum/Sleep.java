package com.lmz.selenilum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep {
    //当执行到sleep()方法时会固定的休眠所设置的时长（这里以毫秒为单位）；然后再继续执行。
    //注意，这里的Thread.sleep()方法不能直接使用，必须加上异常的处理。
    //throws 关键字通常被应用在声明方法时，用来指定可能抛出的异常。

    public static void main(String[] args) throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.youdao.com");
        Thread.sleep(2000);
        driver.quit();

    }
}
