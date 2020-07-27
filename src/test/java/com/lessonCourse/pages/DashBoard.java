package com.lessonCourse.pages;


import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard  extends CommonMethods{
    @FindBy(xpath = "//div[@id='toolbar']//div//form//div//button//md-icon")
    public WebElement searchButton;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement login;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement signUp;


    @FindBy(xpath = "//div[@id='toolbar']//div//span[contains(text(),'Become an Instructor')]")
    public WebElement becomeAnInstructor;


    @FindBy(xpath = "//div[@id='toolbar']//div//ngcart-summary//div//a//md-icon")
    public WebElement shoppingCart;

    //Turker WEB ELEMENTS STARS FROM HERE

    @FindBy(xpath = "//button[@aria-label='Categories']")
    public WebElement categoriesBtn;

    @FindBy(xpath = "(//div[contains(text(),'Academics')])[1]")
    public WebElement academics;

    @FindBy(xpath = "//div[@translate='CAT.ACA.MATH']")
    public WebElement math;

    public void categoriesBtnPage(){
       moveTo(categoriesBtn);
    }
          public void academicspage() {
          moveTo(academics);
          }
          public void mathpage() {
           moveTo(math);
           jsClick(math);

          }



    public void multipleChoice(String buttonName) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (buttonName) {
            case "Search Button":
                Assert.assertTrue(searchButton.isDisplayed());
                break;
            case "Login":
                Assert.assertTrue(login.isDisplayed());
                break;
            case "Sign Up":
                Assert.assertTrue(signUp.isDisplayed());
                break;
            case "Become An Instructor":
                Assert.assertTrue(becomeAnInstructor.isDisplayed());
                break;
            default:
                Assert.assertTrue(shoppingCart.isDisplayed());
                break;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        if (buttonName.equals("Search Button")) {
//            Assert.assertTrue(searchButton.isDisplayed());
//        } else if (buttonName.equals("Login")) {
//            Assert.assertTrue(login.isDisplayed());
//        } else if (buttonName.equals("Sign Up")) {
//            Assert.assertTrue(signUp.isDisplayed());
//        } else if (buttonName.equals("Become An Instructor")) {
//            Assert.assertTrue(becomeAnInstructor.isDisplayed());
//        } else {
//            Assert.assertTrue(shoppingCart.isDisplayed());
//        }
    }
}
