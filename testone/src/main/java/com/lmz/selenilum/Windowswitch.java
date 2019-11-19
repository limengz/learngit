package com.lmz.selenilum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowswitch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.baidu.com");
        //获取当前窗口的句柄
        String now_handle= driver.getWindowHandle();
        System.out.println(now_handle);
        //登录
        driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(""));

    }
}
