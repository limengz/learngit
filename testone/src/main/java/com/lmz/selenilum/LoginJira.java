package com.lmz.selenilum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJira {
    public static void main(String[]args){
      System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
     /* driver.get("http://jira.baozun.cn/login.jsp");
      System.out.println("bz jira login");
      driver.findElement(By.id("login-form-username")).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
      driver.findElement(By.id("login-form-username")).sendKeys("jm0");
      driver.findElement(By.id("login-form-password")).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
      driver.findElement(By.id("login-form-password")).sendKeys("7#");
      driver.findElement(By.id("login-form-submit")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        driver.quit();*/
        driver.get("http://wiki.baozun.com");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
        driver.findElement(By.xpath("//*[@id=\"os_username\"]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"os_password\"]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
//      WebElement display=driver.findElement(By.xpath("//*[@id=\"sidebar-spaces\"]/div/ul/li[3]/a/span[2]"));
//      System.out.println(display.isDisplayed());

      driver.findElement(By.xpath("//*[@id=\"sidebar-spaces\"]/div/ul/li[3]/a")).click();


        //driver.quit();

       /* //登录百度
        driver.get("https://pan.baidu.com");
        //原因：进入网页时，网页可能在loading中，因此找不到元素。
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        //查看元素是否可见
        //  WebElement display=driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_4__footerULoginBtn\"]"));
        // System.out.println(display.isDisplayed());

        driver.findElement(By.id("TANGRAM__PSP_4__footerULoginBtn")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_4__userName\"]")).sendKeys("18000599226");
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_4__password\"]")).sendKeys("GJXlmz1109!");
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_4__submit\"]")).click();*/

    }
}


//clear()方法用于清除文本输入框中的内容。例如，登录框内一般默认会有“账号”“密码”等提示信息，用
//于引导用户输入正确的数据；但如果直接向输入框中输入数据，则可能会与输入框中的提示信息拼接。例如，
//本来用户输入的是“username”，但与提示信息拼接则变为“账号username”，从而造成输入信息错误。这个
//时候可以先使用clear()方法来清除输入框中的默认提示信息。
//sendKeys()方法模拟键盘向输入框里输入内容。如上面的例子中，通过这个方法向用户名和密码框中输入登
//录信息。当然，它的作用不仅于此，我们还可以用它发送键盘按键，甚至用它来模拟文件上传。
//click()方法可以用来单击一个元素，前提是它是可以被单击的对象，它与sendKeys()方法是Web 页面操作
//中最常用到的两个方法。其实click()方法不仅仅用于单击一个按钮，它还可以单击任何可以单击的文字/图片链
//接、复选框、单选框、下拉框等。

