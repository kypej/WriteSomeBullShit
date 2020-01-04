package PageObject.AplicationConfig;

public enum Browser {
    Chrome("webdriver.chrome.driver", "chromedriver"),
    FireFox("webdriver.gecko.driver", "geckodriver");

    private String browserName;
    private String driverFileName;

    Browser(String browserName, String driverFileName) {
        this.browserName = browserName;
        this.driverFileName = driverFileName;
    }

    public String getBrowserName() {
        return browserName;
    }

    public String getDriverFileName() {
        return driverFileName;
    }
}
