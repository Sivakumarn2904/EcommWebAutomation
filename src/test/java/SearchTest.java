import models.Item;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LauncherPage;

import java.util.List;

public class SearchTest {
    @Test
    public void verifyIfSearchTermShowsRelevantResults() {
        //Arrange
        String searchItem = "Jeans";
        String searchKey = "Jean";
        WebDriver driver = new ChromeDriver(); //Dummy WebDriver declaration
        LauncherPage launcherPage = new LauncherPage(driver);
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(driver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();

        //Assert

        Assert.assertEquals(searchItems.size(),4);
        Assert.assertTrue(searchItems.stream().allMatch(item -> new Item().getName().contains(searchKey)));

    }
}
