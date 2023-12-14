package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LauncherPage {

     WebDriver driver;
    public LauncherPage(WebDriver driver){
        this.driver = driver;
    }
    public void navigateTo(String url){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }
}
