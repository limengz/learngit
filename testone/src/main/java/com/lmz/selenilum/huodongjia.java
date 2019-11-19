package com.lmz.selenilum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class huodongjia {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get("http://sit-activity-web.dev.casaba.tech/#/login");
        ////try {
        //   Thread.sleep(4000);
        //   } catch (InterruptedException e) {
        //}
        //id定位
        System.out.println("bz huodongjia login");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/a")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"app\"]/section/section/div[2]/form/div[2]/div/div[1]/input")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"app\"]/section/section/div[2]/form/div[3]/div/div/input")).sendKeys("test");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"app\"]/section/section/div[2]/form/div[4]/div/button/span/span")).click();

    try {
         Thread.sleep(4000);
         } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("/html/body/div[1]/div/aside/div[2]/ul/li[1]/div/span")).click();



        //name定位
        //  driver.findElement(By.name("wd")).sendKeys("test");
        // driver.findElement(By.id("su")).click();
        //class定位
        //  driver.findElement(By.className("s_ipt")).sendKeys("java");
        // driver.findElement(By.id("su")).click();
        //  driver.findElement(By.className("bg s_btn ")).click();
        //tag 定位  HTML 的本质就是通过tag 来定义实现不同的功能，每一个元素本质上也是一个tag。因为一个tag 往往用
        //来定义一类功能，所以通过tag 识别某个元素的概率很低。例如我们打开任意一个页面，查看前端都会发现大
        //量的<div>、<input>、<a>等tag，所以很难通过标tag name 去区分不同的元素。
        //driver.findElement(By.id("kw")).sendKeys("selenium java");
        //  driver.findElement(By.tagName("input")).click();
        //driver.findElement(By.linkText("新闻")).click();
        //findElement(By.linkTame())方法通过元素标签对之间的文本信息来定位元
        //parial link 定位是对link 定位的一种补充，有些文本链接会比较长，这个时候我们可以取文本链接的一部分定位，只要这一部分信息可以唯一地标识这个链接。
        // <a class="mnav" name="tj_lang" href="#">一个很长很长的文本链接</a>
        //driver.findElement(By.partialLinkText("使用百度")).click();
// XPath 定位
//1绝对路径定位
        //findElement(By.xpath("/html/body/div/div[2]/div/div/div/from/span/input"))
        //利用元素属性定位。
        // driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("test");
////表示当前页面某个目录下，input 表示定位元素的标签名，[@id='kw'] 表示这个元素的id 属性值等于kw。
//下面通过name 和class 属性值来定位
//findElement(By.xpath("//input[@name='wd']"))
//findElement(By.xpath("//input[@class='s_ipt']"))
//findElement(By.xpath("//*[@class='bg s_btn']"))
        //如果不想指定标签名，则也可以用星号（*）代替。当然，使用XPath 不局限于id、name 和class 这三个属性值，元素的任意属性值都可以使用，只要它能唯一的标识一个元素。层级与属性结合
        //findElement(By.xpath("//input[@maxlength='100']"))
        //findElement(By.xpath("//input[@autocomplete='off']"))
        //findElement(By.xpath("//input[@type='submit']"))

        //  driver.findElement(By.xpath("//*[@id=\"form\"]/span[1]/input")).sendKeys("jjjj");

        // driver.findElement(By.className("s_ipt")).sendKeys("666");
        //class定位中含有复合类
        //  driver.findElement(By.cssSelector("bg.s_btn_wr")).click();
        //driver.findElement(By.cssSelector("bg.s_btn")).click();
        // css定位 通过class 属性定位：
        // driver.findElement(By.cssSelector(".s_ipt")).sendKeys("hello");

        //   driver.findElement(By.cssSelector(".bg s_btn")).click();

        //通过id 属性定位：
        //    driver.findElement(By.cssSelector("#kw")).sendKeys("qqq");

        //    driver.findElement(By.cssSelector("#su")).click();
        //通过标签名定位：   在CSS 语言中，用标签名定位元素不需要任何符号标识，直接使用标签名即可。但我们前面已经了解到，
        //标签名重复的概率非常大，所以通过这种方式很难找到想要元素
        //findElement(By.cssSelector("input"))
        //通过父子关系定位：    上面的写法表示有父亲元素，它的标签名为span，查找它的所有标签名叫input 的子元素。
        //  findElement(By.cssSelector("span > input"))
        //通过属性定位：  在CSS 当中也可以使用元素的任意属性，只要这些属性可以唯一标识这个元素。对于属性值来说，可加引
        //号，也可以不加，但注意和整个字符串的引号进行区分
        //findElement(By.cssSelector("input[autocomplete='off']"))
        //findElement(By.cssSelector("input[maxlength='100']"))
        //findElement(By.cssSelector("input[type='submit']"))
        //组合定位：有问题，弃之
        //  driver.findElement(By.cssSelector(".bg s_ipt_wr > input.s_ipt")).sendKeys("啦啦啦");

    }

}
