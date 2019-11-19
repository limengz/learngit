package com.lmz.selenilum;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().setSize(new Dimension(700,600));
        driver.get("http://www.youdao.com");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }

        //将页面滚动条拖到底部
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(100,450);");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }
        System.out.println("end");
        driver.quit();
    }
}
