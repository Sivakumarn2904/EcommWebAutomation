package org.testcases;

import pages.LauncherPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductSearch {
    @Test
    public void verifyIfSearchTermShowsRelevantResults() {
        String searchItem = "Jeans";
        WebDriver driver = null;
        LauncherPage launcherPage = new LauncherPage(driver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
    }
}
