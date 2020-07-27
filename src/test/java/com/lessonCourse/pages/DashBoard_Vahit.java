package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_Vahit extends CommonMethods {


    @FindBy(xpath = "(//span[contains(text(),'Categories')])[1]")
    public WebElement categories;


    @FindBy(xpath = "(//div[@translate='CAT.PD.NAME'])[1]")
    public WebElement personalDev;

    @FindBy(xpath = "//div[@translate='CAT.PD.LEAD']")
    public WebElement leadership;

    public void hoverOnCategories() {
        moveTo(categories);
    }

    public void hoverOnPersonalDev() {
        moveTo(personalDev);
    }

    public void hoverOnLeadership() {
        moveTo(leadership);
        slpMyDriver(2000);
        jsClick(leadership);
    }

    public void assertionLeadership() {
        String actualTitle = leadership.getText();
        String expectedTitle = "Leadership";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
