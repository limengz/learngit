package com.lmz.selenilum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//导入提供鼠标操作的ActionChains 类
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;
//导入提供鼠标操作的ActionChains 类
//Actions(driver)
//调用Actions()类，将浏览器驱动driver 作为参数传入。
//contexClick(xxx)
//context_click()方法用于模拟鼠标右键操作，在调用时需要指定元素定位。
//perform()
//执行所有ActionChains 中存储的行为，可以理解成是对整个操作的提交动作
//===================================================================
//Actions 类提供了鼠标操作的常用方法：
// contextClick() 右击
// clickAndHold() 鼠标点击并控制(鼠标悬停)
// doubleClick() 双击
// dragAndDrop() 拖动
// release() 释放鼠标
// perform() 执行所有Actions 中存储的行为


public class Mouse {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      Actions action =new Actions(driver);
        driver.get("https://www.baidu.com");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //鼠标悬停
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"u1\"]/a[8]"))).perform();

    }

}
