package PageObject.AplicationConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver webDriver;
    private WebDriverFactory(){}

    public static WebDriver getWebDriver(){
        switch (System.getProperty("os.name")){
            case "Mac OS X":
                return singltone(Browser.Chrome);
        }
        return null;
    }

    private static WebDriver singltone(Browser browser){
        System.setProperty(browser.getBrowserName(), browser.getDriverFileName());
        if (webDriver == null){
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
}
