package PageObject.Pages;

import PageObject.Pages.TaskConfig.TaskFreeStyleConfigurationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Time;

import static PageObject.AplicationConfig.AppManager.getDriver;

public class CreateNewItemPage {
    private WebDriver webDriver;

    public CreateNewItemPage() {
        this.webDriver = getDriver();
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "name")
    private WebElement itemNameFld;

    @FindBy(className = "hudson_model_FreeStyleProject")
    private WebElement createFreeStyleProjectBtn;

    @FindBy(id = "ok-button")
    private WebElement okBtn;

    public TaskFreeStyleConfigurationPage createNewFreeStyleTask(){
        Time time = new Time(System.currentTimeMillis());
        itemNameFld.sendKeys("New task by autotest" + System.currentTimeMillis());
        createFreeStyleProjectBtn.click();
        okBtn.click();
        return new TaskFreeStyleConfigurationPage();
    }
}
