package com.lmz.selenilum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Upfile {
    public static void main(String[] args) throws  InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        File file=new File("D:\\oct\\testone\\src\\main\\java\\com\\lmz\\web\\upfile.html");
        String filepath=file.getAbsolutePath();
        driver.get(filepath);
        //定位上传按钮，添加本地文件
         driver.findElement(By.name("file")).sendKeys("D:\\testfileup.txt");
        Thread.sleep(5000);
    }
}
