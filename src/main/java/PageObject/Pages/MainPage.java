package PageObject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static PageObject.AplicationConfig.AppManager.getDriver;

public class MainPage extends BasePage{
    private WebDriver webDriver;
    private final String pageURL = "localhost:8080";

    public MainPage() {
        this.webDriver = getDriver();
        PageFactory.initElements(webDriver, this);
        webDriver.manage().window().fullscreen();
    }

    @FindBy(xpath =  "//a[@title='Создать Item']")
    private WebElement createItemBtn;

    @FindBy(xpath = "//a[@title='Пользователи']")
    private WebElement usersBtn;

    @FindBy(xpath = "//a[@title='История сборок']")
    private WebElement buildHistoryBtn;


    public CreateNewItemPage createItem(){
        createItemBtn.click();
        return new CreateNewItemPage();
    }

    public String getPageURL() {
        return pageURL;
    }
}
