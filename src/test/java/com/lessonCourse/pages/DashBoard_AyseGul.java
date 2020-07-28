package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_AyseGul extends CommonMethods {

    @FindBy(xpath = "(//div[@class= 'background-image-center'])[1]")
    public WebElement coaching;

    @FindBy(xpath = "//h4[contains(text(),'Coaching is a process that aims to improve perform')]")
    public WebElement coachingPage;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Explore Lessons')]")
    public WebElement exploreLessons;


    public void hoverOnCoaching() {
        slpMyDriver(1000);
        scrollIntoElement(coaching);
        slpMyDriver(1000);
        jsClick(coaching);
        slpMyDriver(1000);
    }

    public void assertionCoachingPage() {
        String actualTitle = coachingPage.getText();
        String expectedTitle = "Coaching is a process that aims to improve performance and focuses on the ‘here and now’. If you want to reach your goals, but not sure how to start, coaching can be good solution for you.In this category you can find your own personal professional coach. Also, if you want to become coach you can get courses on coaching as well.";
        Assert.assertEquals("Assertion is successful", actualTitle, expectedTitle);
    }

    public void hoverOnHome() {
        slpMyDriver(1000);
        scrollIntoElement(home);
        slpMyDriver(1000);
        jsClick(home);
        slpMyDriver(1000);
    }

    public void assertionHome() {
        String actualTitle = exploreLessons.getText();
        String expectedTitle = "Explore Lessons";
        Assert.assertEquals("Assertion is successful", actualTitle, expectedTitle);
    }
}
