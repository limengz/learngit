package com.lmz.selenilum;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        //鼠标悬停【设置】
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
        //点击【搜索设置】
        driver.findElement(By.className("setpref")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
       // driver.findElement(By.className("setprefsetpref")).click();
        //搜索历史记录，选择【不显示】
        driver.findElement(By.xpath("//*[@id=\"se-setting-5\"]/label[2]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        //点击【保存设置】
        driver.findElement(By.xpath("//*[@id=\"gxszButton\"]/a[1]")).click();
        //获取警告框内容并打印
        String alert=driver.switchTo().alert().getText();
        System.out.println(alert);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        //警告框【确定】
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        driver.quit();
    }
}


        //switch_to_alert()       --定位弹出对话框
        //text()               --获取对话框文本值
        //accept()             --相当于点击“确认”
        //dismiss()             --相当于点击“取消”
        //send_keys()            --输入值（alert和confirm没有输入对话框，所以就不用能用了，只能使用在prompt里）
