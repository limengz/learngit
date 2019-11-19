package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reportout {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:/D:/oct/mykakate/target/surefire-reports/feature.test.html");
        driver.navigate().refresh();
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){

        }
        driver.get("file:/D:/oct/mykakate/target/surefire-reports/feature.testoctapi.html");
    }
}
