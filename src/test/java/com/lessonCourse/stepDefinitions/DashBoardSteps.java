package com.lessonCourse.stepDefinitions;

import com.lessonCourse.pages.DashBoard;
import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashBoardSteps {
    DashBoard dashBoard = new DashBoard();

    @Given("User test with {string} browser")
    public void user_is_in_destination_page(String browser) {
        if (browser.equals("chrome")) {
//            ConfigurationReader.getProperty(browser);
            System.setProperty("browser", "chrome");
        } else {
            System.setProperty("browser", "firefox");
        }
    }


    @Given("User should be able to see {string} is shown on the  site")
    public void user_should_be_able_to_see_is_shown_on_the_site(String buttons) {
        dashBoard.multipleChoice(buttons);
    }


}
