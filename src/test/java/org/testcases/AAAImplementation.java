package org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class AAAImplementation {
    @Test
    public void aaaTest() {
        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Act
        driver.get("https://web-playground.ultralesson.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//summary[@aria-label='Search']")).click();
        driver.findElement(By.xpath("//input[@id='Search-In-Modal']")).sendKeys("Jeans");
        List<WebElement> productlist = driver.findElements(By.xpath("//a[@class='predictive-search__item predictive-search__item--link link link--text']"));
        //Assert
        Assert.assertEquals(productlist.size(),4);
        driver.quit();
    }
    @Test
    public void signUpTest() {
        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Act
        driver.get("https://web-playground.ultralesson.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@class='header__icon header__icon--account link focus-inset small-hide']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Create account')]")).click();
        driver.findElement(By.xpath("//input[@id='RegisterForm-FirstName']")).sendKeys("Siva");
        driver.findElement(By.xpath("//input[@id='RegisterForm-LastName']")).sendKeys("Kumar");
        int random = new Random().nextInt(500);
        driver.findElement(By.xpath("//input[@id='RegisterForm-email']")).sendKeys("siva"+random+"@gmail.com");
        driver.findElement(By.xpath("//input[@id='RegisterForm-password']")).sendKeys("password123");
        driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
        driver.findElement(By.xpath("//a[@class='header__icon header__icon--account link focus-inset small-hide']")).click();
        String Aname = driver.findElement(By.xpath("//h2[text()='Account details']/following-sibling::p")).getText();
        //Assert
        Assert.assertTrue(Aname.contains("Siva Kumar"));
        driver.quit();
    }
    @Test
    public void loginTest(){
        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Act
        driver.get("https://web-playground.ultralesson.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@class='header__icon header__icon--account link focus-inset small-hide']")).click();
        driver.findElement(By.xpath("//input[@id='CustomerEmail']")).sendKeys("siva@gmail.com");
        driver.findElement(By.xpath("//input[@id='CustomerPassword']")).sendKeys("Sivakumar");
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        String Aname = driver.findElement(By.xpath("//h2[text()='Account details']/following-sibling::p")).getText();
        //Assert
        Assert.assertTrue(Aname.contains("Siva N"));
        driver.quit();
    }


}
