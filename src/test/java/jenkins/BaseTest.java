package jenkins;

import PageObject.Pages.*;
import PageObject.Pages.TaskConfig.TaskFreeStyleConfigurationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import static PageObject.AplicationConfig.AppManager.getDriver;

public abstract class BaseTest {
    private WebDriver webDriver = getDriver();
    protected SignInPage signInPage = new SignInPage();
    protected MainPage mainPage  = new MainPage();
    protected CreateNewItemPage createNewItemPage = new CreateNewItemPage();
    protected TaskFreeStyleConfigurationPage taskFreeStyleConfigurationPage = new TaskFreeStyleConfigurationPage();

    @AfterTest
    public void closeBrowser() {
        webDriver.quit();
    }

}
