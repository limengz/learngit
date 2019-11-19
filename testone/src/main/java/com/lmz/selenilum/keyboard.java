package com.lmz.selenilum;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com");

        WebElement input=driver.findElement(By.xpath("//*[@id=\"kw\"]"));
        input.sendKeys("selenilumm");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        }
        //删除多输入的一个m
        input.sendKeys(Keys.BACK_SPACE);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        }
        //清空
      //  input.clear();
        //输入空格+“教程”
        input.sendKeys(Keys.SPACE);
        input.sendKeys("教程");
        //CTRL+a 全选
        input.sendKeys(Keys.CONTROL,"a");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        //ctrl+x  剪切
        input.sendKeys(Keys.CONTROL,"x");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        // ctrl+v 粘贴
        input.sendKeys(Keys.CONTROL,"v");
        //键盘回车 enter
        input.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        driver.quit();
    }

}

//需要说明的是，上面的脚本没有什么实际意义，但向我们展示了模拟键盘各种按键与组合键的用法。
//import org.openqa.selenium.Keys;
//在使用键盘按键方法前需要先导入 keys 类。