package PageObject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static PageObject.AplicationConfig.AppManager.getDriver;

public class SignInPage extends BasePage{
    private WebDriver webDriver;
    public final String pageUrl = "http://localhost:8080/login?from=%2F";

    public SignInPage() {
        this.webDriver = getDriver();
        PageFactory.initElements(webDriver, this);
        webDriver.manage().window().fullscreen();
    }
    @FindBy(id = "j_username")
    private WebElement userNameFld;

    @FindBy(name = "j_password")
    private WebElement passwordFld;

    @FindBy(name = "Submit")
    private WebElement dataBtn;

    public void openSignInPage(){
        webDriver.get(pageUrl);
    }

    public MainPage signIn() {
        openSignInPage();
        userNameFld.sendKeys("akorovkin");
        passwordFld.sendKeys("111111");
        dataBtn.click();
        return new MainPage();
    }

    public String getPageURL() {
        return pageUrl;
    }
}
