package pages;

import models.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage{
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void search(String searchItem) {
        driver.findElement(By.xpath("//summary[@aria-label='Search']")).click();
        driver.findElement(By.xpath("//input[@id='Search-In-Modal']")).sendKeys(searchItem);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class='predictive-search__item-content']"))));
    }
    public List<Item> getSearchItems() {
        return new ArrayList<>();
    }
}
