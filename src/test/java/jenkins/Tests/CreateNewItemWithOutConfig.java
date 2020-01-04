package jenkins.Tests;

import PageObject.Pages.SignInPage;
import jenkins.BaseTest;
import org.testng.annotations.Test;


public class CreateNewItemWithOutConfig extends BaseTest {
    @Test
    public void createNewItem() {
        signInPage.signIn();
        mainPage.createItem();
        createNewItemPage.createNewFreeStyleTask();

    }
}
