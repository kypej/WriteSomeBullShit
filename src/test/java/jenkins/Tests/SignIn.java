package jenkins.Tests;

import PageObject.Pages.SignInPage;
import jenkins.BaseTest;
import org.testng.annotations.Test;


public class SignIn extends BaseTest {

    @Test
    public void signIn(){
        signInPage.signIn();
    }
}
