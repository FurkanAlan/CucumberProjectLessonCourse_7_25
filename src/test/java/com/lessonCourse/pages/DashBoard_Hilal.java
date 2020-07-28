package com.lessonCourse.pages;

import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashBoard_Hilal extends CommonMethods {
    //    By hoverTo = By.xpath("//div[@id='toolbar']//div//div//span[contains(text(),'Categories')]");
//    WebElement categories = MyDriver.get().findElement(hoverTo);


    @FindBy(xpath = "//div[@id='toolbar']//div//form//div//input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@id='toolbar']//div//form//div//button")
    public WebElement clickToSearch;


    public void searchBox(String text) {
//        MyDriver.get().manage().deleteAllCookies();
        searchBox.sendKeys(text);
        jsClick(clickToSearch);
        slpMyDriver(3000);
    }

    public void verifyMathListing() {
        List<WebElement> elementList = MyDriver.get().findElements(By.xpath("//span[@class='mb-8 mt-5 font-size-16 text-bold ng-binding']"));
        int sizeOfList = elementList.size();
        System.out.println(sizeOfList + "  Math in the list");
        slpMyDriver(5000);
//        int countMath = 0;
//        int countNonMath = 0;
//        for (int i = 0; i < sizeOfList; i++) {
//            if (!elementList.get(i).getText().contains(text)) {
//                System.out.println("We found non Math listing " + countNonMath);
//            }
//            countMath++;
//        }
//        System.out.println("We found " + countMath + " Math listing and There is no non Math listing");
//
//        System.out.println("We found " + countMath + " Math listing and There is " + countNonMath + " non Math " +
//                "listing");
    }
}
