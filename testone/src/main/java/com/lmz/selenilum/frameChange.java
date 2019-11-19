package com.lmz.selenilum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class frameChange {
    public static void main(String[] args) throws InterruptedException {
        ////先设置访问ChromeDriver的路径
        // 将系统属性“webdriver.chrome.driver” 设置为 ChromeDriver.exe 文件的路径并实例化ChromeDriver类。
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        File file =new File("D:\\oct\\testone\\src\\main\\java\\com\\lmz\\web\\frame.html");
        String filepath=file.getAbsolutePath();
        driver.get(filepath);
        //切换到iframe（mane=ttt）
        // byid查不到,name可以
        // driver.switchTo().frame("ttt");
        //switchTo().frame()默认可以直接取表单的id 或name 属性。如果iframe 没有可用的id 和name 属性，
        //则可以通过下面的方式进行定位。
        WebElement xf=driver.findElement(By.xpath("//*[@id=\"=asd\"]"));
        driver.switchTo().frame(xf);
        driver.findElement(By.id("kw")).sendKeys("webdriver");
        driver.findElement(By.id("su")).click();
        //返回上一级表单
        //如果完成了在当前表单上的操作，则可以通过switchTo().defaultContent()方法跳出表单
        driver.switchTo().defaultContent();
    }
}
