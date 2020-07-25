package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_Omar extends CommonMethods {


    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement login;

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement passWord;

    @FindBy(xpath = "//span[contains(text(),'Remember Me')]")
    public WebElement rememberMe;

    @FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
    public WebElement forgotPassword;

    @FindBy(xpath = "//a[contains(text(),'Go back to login')]")
    public WebElement goBackToLogin;

    @FindBy(xpath = "//div[@id='login-form']")
    public WebElement loginToAccount;


    public void loginToAccount() {
        slpMyDriver(1000);
        jsClick(login);
        slpMyDriver(1000);
    }

    public void enterUserName() {
        userName.clear();
        sendText(userName, ConfigurationReader.getProperty("username"));
        slpMyDriver(1000);
    }

    public void enterPassword() {
        passWord.clear();
        sendText(passWord, ConfigurationReader.getProperty("password"));
        slpMyDriver(1000);
    }

    public void rememberMeFunctional() {
        Assert.assertTrue(rememberMe.isEnabled());
        Assert.assertTrue(rememberMe.isDisplayed());
        String actualText = rememberMe.getText();
        String expectedText = "Remember Me";
        Assert.assertEquals(actualText, expectedText);
    }


    public void forgotPasswordFunctional() {
        Assert.assertTrue(forgotPassword.isEnabled());
        Assert.assertTrue(forgotPassword.isDisplayed());
        String actualText = forgotPassword.getText();
        String expectedText = "Forgot Password?";
        Assert.assertEquals(actualText, expectedText);

        slpMyDriver(1000);
        jsClick(loginToAccount);
        slpMyDriver(3000);
    }
}
