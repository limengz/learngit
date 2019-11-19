package com.lmz.selenilum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserGo {
public static void main(String[]args){
    System.out.println("browser back and forword");
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    String firstUrl="http://www.baidu.com";
    //%s代表当前位置输出字符串（String）
    //\n代表一个换行
    System.out.printf("now access %s \n",firstUrl);
    //System.out.println(firstUrl );
    driver.get(firstUrl);
    String secondUrl="http://news.baidu.com";
    System.out.printf("now access %s \n",secondUrl);
    driver.get(secondUrl);
    //Driver对象的navigate方法__浏览器被操作__前进(forward)、后退(back)、刷新(refresh)、当前窗口切换到连接(to)

    System.out.printf("now back to %s",firstUrl);
    driver.navigate().back();
    //为了效果明显，添加等待时间
    try {
   Thread.sleep(1000);
  } catch (InterruptedException e) {
        }
    System.out.printf("now forward to %s",secondUrl);
   // driver.navigate().forward();
    //or
   // driver.navigate().to("http://news.baidu.com");
    //or
    driver.navigate().to(secondUrl);
    //浏览器刷新
    driver.navigate().refresh();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    driver.quit();
}
}
