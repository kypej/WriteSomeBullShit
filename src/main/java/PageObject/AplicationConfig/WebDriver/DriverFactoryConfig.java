package PageObject.AplicationConfig.WebDriver;

import PageObject.AplicationConfig.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactoryConfig {
    private static String bowserPath;
    private static WebDriver driver;

    public DriverFactoryConfig(Browser browser){
        setSystemProperty(browser);
        switch (browser){
            case Chrome:{
                driver = singltone(browser);
                break;
            }
            case FireFox:{
                driver = singltone(browser);
                break;
            }
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    private static void setSystemProperty(Browser browser){
        switch (System.getProperty("os.name")){
            case "Mac OS X":{
                bowserPath = "src/main/driver/driver_mac/" + browser.getDriverFileName();
                break;
            }
            case "Windows":{
                bowserPath = "src/main/driver/driver_win/" + browser.getDriverFileName();
                break;
            }
        }
    }

    private static WebDriver singltone(Browser browser){
        System.setProperty(browser.getBrowserName(), bowserPath);
        if (driver == null){
            switch (browser){
                case Chrome:{
                    driver = new ChromeDriver();
                    break;
                }
                case FireFox:{
                    driver = new FirefoxDriver();
                    break;
                }
            }
        }
        return driver;
    }
}
