package com.lmz.selenilum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
public class YoudaoSubmit {
    public  static  void main(String[]args){
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.youdao.com");
    driver.findElement(By.id("translateContent")).sendKeys("submit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
      driver.findElement(By.name("q")).submit();
    }

}

//submit()方法用于提交表单。例如，在搜索框输入关键字之后的“回车”操作，就可以通过submit()方法模拟。
//上面的例子，我们通过定位有道搜索框并通过submit()提交搜索框的内容，同样达到单击“搜索”按钮的效
//果。有时候submit()可以与click()方法互换来使用，submit()同样可以提交一个按钮，但submit()的应用范围远不
//及click()广泛。

