package com.lessonCourse.stepDefinitions;

import com.lessonCourse.pages.DashBoard;
import com.lessonCourse.utilities.CommonMethods;
import com.lessonCourse.utilities.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

       // Turker-Step defs starts from here
    @Given("User navigates to homepage")
    public void user_navigates_to_homepage() {

    }

    @When("User mouse over category button")
    public void user_mouse_over_category_button() throws InterruptedException {
        Thread.sleep(3000);
        dashBoard.categoriesBtnPage();

    }

    @Then("User mouse over academics")
    public void user_mouse_over_academics() throws InterruptedException {
        Thread.sleep(3000);
        dashBoard.academicspage();

    }

    @Then("User click on math button")
    public void user_click_on_math_button() throws InterruptedException {
        Thread.sleep(3000);
        dashBoard.mathpage();

    }
}