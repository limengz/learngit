package com.lmz.selenilum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class video {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        Thread.sleep(4000);
        driver.get("https://videojs.com");
        Thread.sleep(4000);
        WebElement video =driver.findElement(By.xpath("//*[@id=\"preview-player_html5_api\"]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //获得视频的URL
        jse.executeScript("return arguments[0].currentSrc;",video);
        Thread.sleep(6000);
        //播放视频，播放15秒
        jse.executeScript("return arguments[0].play();",video);
        Thread.sleep(15000);
        jse.executeScript("arguments[0].pause()",video);
        driver.quit();

    }
}
