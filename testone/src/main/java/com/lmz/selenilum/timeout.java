package com.lmz.selenilum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class timeout {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //页面加载时间超时时间设置为100ms
        driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.MILLISECONDS);
        driver.get("https://www.baidu.com");
        //定位对象时，给2s的时间，如果2s内定位不到抛出异常
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("kw")).sendKeys("test");
        //异步脚本的超时时间设置为100ms
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.MILLISECONDS);
    }

}
//WebDriver 提供了几种方法来等待元素。
// implicitlyWait。识别对象时的超时时间。过了这个时间如果对象还没找到的话就会抛出
//NoSuchElement 异常。
// setScriptTimeout。异步脚本的超时时间。WebDriver 可以异步执行脚本，这个是设置异步执行脚
//本脚本返回结果的超时时间。  pageLoadTimeout。页面加载时的超时时间。因为 WebDriver 会等页面加载完毕再进行后面的操作，
//所以如果页面超过设置时间依然没有加载完成，那么 WebDriver 就会抛出异常。