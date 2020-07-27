package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashBoard_Turker extends CommonMethods {

//    By hoverTo = By.xpath("//div[@id='toolbar']//div//div//span[contains(text(),'Categories')]");
//    WebElement categories = MyDriver.get().findElement(hoverTo);


    @FindBy(xpath = "(//span[contains(text(),'Categories')])[1]")
    public WebElement categories;


//    //span[@translate='TOOLBAR.CATS']

    @FindBy(xpath = "(//div[@translate='CAT.ACA.NAME'])[1]")
    public WebElement academics;


    @FindBy(xpath = "//div[@translate='CAT.ACA.MATH']")
    public WebElement mathSection;


    public void hoverOnCategories() {
//        MyDriver.get().manage().deleteAllCookies();
//        waitForClickability(categories);
//        System.out.println(categories.isDisplayed()+""+categories.isSelected()+""+categories.isEnabled()+"");
        moveTo(categories);
        slpMyDriver(5000);
    }

    public void academics() {
        moveTo(academics);
    }

    //
    public void mathCategory() {
        moveTo(mathSection);
        String math = mathSection.getText();
        System.out.println(math);
    }

    public void assertionMath() {
        String actualTitle = mathSection.getText();
        String expectedTitle = "Mat";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}


