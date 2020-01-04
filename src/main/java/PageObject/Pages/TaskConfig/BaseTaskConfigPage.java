package PageObject.Pages.TaskConfig;

import PageObject.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BaseTaskConfigPage  extends BasePage {

    @FindBy(name = "description")
    protected WebElement descriptionTestAreal;

    @FindBy(id = "yui-gen6-button")
    protected WebElement saveBtn;

    @FindBy(id = "yui-gen5-button")
    protected WebElement applyBtn;
}
