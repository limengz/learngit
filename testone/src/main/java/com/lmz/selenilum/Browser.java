package com.lmz.selenilum;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static void main(String[]args){
        ////先设置访问ChromeDriver的路径
        // 将系统属性“webdriver.chrome.driver” 设置为 ChromeDriver.exe 文件的路径并实例化ChromeDriver类。
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
       System.out.println("setting browser");
        WebDriver driver = null;
        driver = new ChromeDriver();
       driver.manage().window().setSize(new Dimension(500,500));
       driver.get("https://www.linefriends.cn");
     //  driver.quit();
       }

    }
