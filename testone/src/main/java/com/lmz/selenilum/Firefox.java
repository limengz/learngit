package com.lmz.selenilum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\firefoxDriver\\geckodriver.exe");
        WebDriver driver = null;
        driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
        driver.close();
    }
}