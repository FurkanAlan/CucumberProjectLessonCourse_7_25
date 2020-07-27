package com.lessonCourse.stepDefinitions;

import com.lessonCourse.pages.DashBoard_Alan;
import com.lessonCourse.pages.DashBoard_Hilal;
import com.lessonCourse.pages.DashBoard_Turker;
import com.lessonCourse.pages.DashBoard_Vahit;
import com.lessonCourse.utilities.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardSteps {
//    DashBoard_Alan dashBoardAlan = new DashBoard_Alan();
//    DashBoard_Turker dashBoardTurker = new DashBoard_Turker();
//    DashBoard_Vahit dashBoardVahit = new DashBoard_Vahit();
    DashBoard_Hilal dashBoardHilal = new DashBoard_Hilal();


    @Given("User test with {string} browser")
    public void user_is_in_destination_page(String browser) {
//        if (browser.equals("chrome")) {
//            ConfigurationReader.getProperty(browser);
//            System.setProperty("browser", "chrome");
//        } else {
//            System.setProperty("browser", "firefox");
//        }
}


//    @Given("User should be able to see {string} is shown on the  site")
//    public void user_should_be_able_to_see_is_shown_on_the_site(String buttons) {
//        dashBoardAlan.multipleChoice(buttons);
//    }

    @Then("User should be able to click categories and see math in the academics section")
    public void user_should_be_able_to_click_categories_and_see_math_in_the_academics_section() {
//        dashBoardTurker.hoverOnCategories();
//        dashBoardTurker.academics();
//        dashBoardTurker.mathCategory();
//        dashBoardTurker.assertionMath();
    }


//    @Given("User navigates to homepage")
//    public void user_navigates_to_homepage() {
////        MyDriver.driver();
//    }
//
//    @When("^User mouse over \"([^\"]*)\"$")
//    public void user_mouse_over_categories() {
////        dashBoardVahit.hoverOnCategories();
//    }
//
//    @Then("^User mouse over \"([^\"]*)\"$")
//    public void user_mouse_over_personal_development() {
////        dashBoardVahit.hoverOnPersonalDev();
//    }
//
//    @Then("^User mouse over \"([^\"]*)\"$")
//    public void user_mouse_over_leadership_Button() {
////        dashBoardVahit.hoverOnLeadership();
//    }
//
//    @Then("^Verify user button is \"([^\"]*)\"$")
//    public void verify_user_button_is_clickable() {
////        dashBoardVahit.assertionLeadership();
//    }



    @Then("User should be able to type in search box {string} and then click on the search button, verify that allresults contains math in it")
    public void user_should_be_able_to_type_in_search_box_math_and_then_click_on_the_search_button_verify_that_all_results_contains_math_in_it(String text) {
        dashBoardHilal.searchBox(text);
        dashBoardHilal.verifyMathListing();
    }
}
