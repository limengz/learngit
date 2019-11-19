package com.lmz.selenilum;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class cookieope {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.youdao.com");
        //获得cookie
        Set<Cookie> coo=driver.manage().getCookies();
        //打印cooki
        System.out.println(coo);

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        System.out.println("==========================================================================================");
        driver.get("https://www.baidu.com");
        Set<Cookie> baiducoo=driver.manage().getCookies();
        System.out.println(baiducoo);
        driver.quit();
    }
}
