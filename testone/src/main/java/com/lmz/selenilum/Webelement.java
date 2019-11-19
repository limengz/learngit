package com.lmz.selenilum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
    public static void main(String[]args){
   System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("http://www.youdao.com");
   //获得有道输入框的尺寸
        WebElement size=driver.findElement(By.xpath("//*[@id=\"border\"]"));
        System.out.println(size.getSize());
        //返回有道页面底部备案信息
        WebElement text=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/p/span"));
        System.out.println(text.getText());
        //返回元素的属性值，可以是id、name、type 或元素拥有的其它任意属性
        WebElement ty=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/p/span"));
        System.out.println(ty.getAttribute("class"));
        //返回元素的结果是否可见
        WebElement display=driver.findElement(By.xpath("//*[@id=\"border\"]/input[3]"));
        System.out.println(display.isDisplayed());
    }
}
// getSize() 返回元素的尺寸。
// getText() 获取元素的文本。若元素下还有子元素，可以获取到当前元素以及子元素的文本
// getAttribute(name) 获得元素拥有的任何属性值。
// isDisplayed() 设置该元素是否用户可见。
