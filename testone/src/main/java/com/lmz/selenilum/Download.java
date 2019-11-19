package com.lmz.selenilum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        //块注释Ctrl+Shift+/，行注释Ctrl+/
        //去除块注释的时候，不需要全部选中这块代码，只用光标在注释内容上按Ctrl+Shift+/即可
        //再次按Ctrl+/，可以去掉该行注释
     /*   driver.get("http://bbs.51testing.com/thread-992274-1-1.html");
        String now_handle= driver.getWindowHandle();
        System.out.println(now_handle);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"lsform\"]/div/div[2]/p[1]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        String new_handle= driver.getWindowHandle();
        System.out.println(new_handle);
        driver.switchTo().window(new_handle);*/

       // driver.get(now_handle);
        driver.get("https://graph.qq.com/oauth2.0/show?which=Login&display=pc&response_type=code&client_id=310671978&redirect_uri=http%3A%2F%2Fbbs.51testing.com%2Fconnect.php%3Fmod%3Dlogin%26op%3Dcallback%26referer%3Dforum.php%253Fmod%253Dviewthread%2526tid%253D992274%2526extra%253Dpage%25253D1%2526page%253D1&state=6f624ac662430b80f674d3dce30cc0e7&scope=get_user_info%2Cadd_share%2Cadd_t%2Cadd_pic_t%2Cget_repost_list");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        WebElement display=driver.findElement(By.xpath("//*[@id=\"switcher_plogin\"]"));
        System.out.println(display.isDisplayed());
//        driver.findElement(By.xpath("//*[@id=\"img_out_378535180\"]")).click();
    }

}
