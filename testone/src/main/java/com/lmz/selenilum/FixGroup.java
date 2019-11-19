package com.lmz.selenilum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.List;

public class FixGroup {
    public static void main(String[] args) throws InterruptedException {
        ////先设置访问ChromeDriver的路径
        // 将系统属性“webdriver.chrome.driver” 设置为 ChromeDriver.exe 文件的路径并实例化ChromeDriver类。
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        File file = new File("D:\\oct\\testone\\src\\main\\java\\com\\lmz\\web\\Checkbox.html");
        String filePath = file.getAbsolutePath();
        driver.get(filePath);
        List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkbox : checkboxs){
                checkbox.click();
            Thread.sleep(1000);
            }


       // List<Webelement> allck = driver.findElement(By.xpath("//input[@type='checkbox']"));
      //  System.out.println(allck.size());
         System.out.println(checkboxs.size());
            int i=checkboxs.size()-1;
            for(i=2;i>=0;i--){
                checkboxs.get(i).click();
                Thread.sleep(1000);
            }
         //刷新页面
        driver.navigate().refresh();
         Thread.sleep(2000);
        //通过XPath 或CSS 来查找一组元素时，省去了判断步骤。因为定位方法已经做了判断，只需循环对这一组
        //元素进行勾选即可。
        driver.quit();
    }
}

