package PageObject.Pages;

import com.google.errorprone.annotations.DoNotCall;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class BasePage {
    private WebDriver driver;

    @Deprecated
    public Class<? extends BasePage> getPage(Class<? extends BasePage> page){
        try {
            String s = (String) page.getMethod("getPageURL").invoke(page.getDeclaringClass());
            driver.get(s);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return page;
    }
}
