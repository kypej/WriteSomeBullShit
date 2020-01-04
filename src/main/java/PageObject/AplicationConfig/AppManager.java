package PageObject.AplicationConfig;

import PageObject.AplicationConfig.WebDriver.DriverFactoryConfig;
import org.openqa.selenium.WebDriver;

public class AppManager {
    private static Browser browser = Browser.Chrome;
    private static DriverFactoryConfig driverFactoryConfig = new DriverFactoryConfig(browser);

    public static WebDriver getDriver() {
        return  driverFactoryConfig.getDriver();
    }
}
