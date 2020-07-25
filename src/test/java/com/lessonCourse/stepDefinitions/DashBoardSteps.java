package com.lessonCourse.stepDefinitions;

import com.lessonCourse.pages.*;
import com.lessonCourse.utilities.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardSteps {
    //    DashBoard_Alan dashBoardAlan = new DashBoard_Alan();
//    DashBoard_Turker dashBoardTurker = new DashBoard_Turker();
//    DashBoard_Vahit dashBoardVahit = new DashBoard_Vahit();
//    DashBoard_Hilal dashBoardHilal = new DashBoard_Hilal();
//    DashBoard_Omar dashBoardOmar = new DashBoard_Omar();
//    DashBoard_AyseGul dashBoardAyseGul = new DashBoard_AyseGul();
    DashBoard_Mustafa dashBoardMustafa = new DashBoard_Mustafa();


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


    @Given("User navigates to homepage")
    public void user_navigates_to_homepage() {
    }
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
//        dashBoardHilal.searchBox(text);
//        dashBoardHilal.verifyMathListing();
    }


    @When("User should be able to click on login button")
    public void user_should_be_able_to_click_on_login_button() {
//        dashBoardOmar.loginToAccount();
    }

    @Then("User should be able to enter username and password")
    public void user_should_be_able_to_enter_username_and_password() {
//        dashBoardOmar.enterUserName();
//        dashBoardOmar.enterPassword();
    }

    @Then("User should be able to verify remember me button is clickable")
    public void user_should_be_able_to_verify_remember_me_button_is_clickable() {
//        dashBoardOmar.rememberMeFunctional();
    }

    @Then("User should be able to verify forget password is clickable")
    public void user_should_be_able_to_verify_forget_password_is_clickable() {
//        dashBoardOmar.forgotPasswordFunctional();
    }


    @When("User should be able to click on Coaching")
    public void user_should_be_able_to_click_on_Coaching() {
//        dashBoardAyseGul.hoverOnCoaching();
    }

    @Then("User should be able to verify Coaching page")
    public void user_should_be_able_to_verify_Coaching_page() {
//        dashBoardAyseGul.assertionCoachingPage();
    }

    @Then("User should be able to go to Home page by clicking Home button")
    public void user_should_be_able_to_go_to_Home_page_by_clicking_Home_button() {
//        dashBoardAyseGul.hoverOnHome();
    }

    @Then("User should be able to verify that is on Home page")
    public void user_should_be_able_to_verify_that_is_on_Home_page() {
//        dashBoardAyseGul.assertionHome();
    }

    @When("User mouse over Languages")
    public void user_mouse_over_Languages() {
        dashBoardMustafa.hoverOnLanguages();
    }

    @Then("User mouse over Turkish Language")
    public void user_mouse_over_Turkish_Language() {
        dashBoardMustafa.hoverOnTurkishLanguage();
    }

    @Then("User verify Home page is Turkish Language")
    public void user_verify_Home_page_is_Turkish_Language() {
        dashBoardMustafa.assertionTurkishLanguage();
    }
}
