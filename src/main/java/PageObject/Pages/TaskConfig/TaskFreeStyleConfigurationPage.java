package PageObject.Pages.TaskConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static PageObject.AplicationConfig.AppManager.getDriver;

public class TaskFreeStyleConfigurationPage extends BaseTaskConfigPage {
    private WebDriver webDriver;

    public TaskFreeStyleConfigurationPage() {
        this.webDriver = getDriver();
        PageFactory.initElements(webDriver, this);
    }

    public void defaultCongigurate(){
        descriptionTestAreal.sendKeys("This description was make with autotest's");
    }
}
