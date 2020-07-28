package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_Mustafa extends CommonMethods {


    @FindBy(xpath = "//md-input-container[@id='sLang']//span[2]")
    public WebElement languageOptions;


    @FindBy(xpath = "//span[contains(text(),'Türkçe')]")
    public WebElement turkishLanguage;

    @FindBy(xpath = "//a[contains(text(),'Dersleri Ke')]")
    public WebElement turkishHomePage;


    public void hoverOnLanguages() {
        scrollIntoElement(languageOptions);
        slpMyDriver(1000);
        jsClick(languageOptions);
    }

    public void hoverOnTurkishLanguage() {
        slpMyDriver(1000);
        scrollIntoElement(turkishLanguage);
        slpMyDriver(1000);
        jsClick(turkishLanguage);
        slpMyDriver(1000);
    }

    public void assertionTurkishLanguage() {
        String actualTitle = turkishHomePage.getText();
        String expectedTitle = "Dersleri Keşfet";
        Assert.assertEquals("Assertion is OK", actualTitle, expectedTitle);
    }
}
