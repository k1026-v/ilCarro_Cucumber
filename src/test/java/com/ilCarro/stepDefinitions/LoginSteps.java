package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on log in link")
    public void clicks_on_log_i_link (){
        new HomePage(driver).clickOnLoginLink();
            }


    @And("User enters valid data")
    public void enters_valid_data (){
        new LoginPage(driver).enterData("kiv@ukr.net","12345678Cc!");
    }

    @And("User clicks ov Yalla button")

    public void clicks_ov_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();

    }

    @And("User verifies log in message")

    public void verifies_log_in_message(){
        new LoginPage(driver).isLoginMessageDisplayed();

    }

    @And("User enters email and wrong password")
    public void enter_email_and_wrong_password(DataTable table){
        new LoginPage(driver).enterWrongData(table);
    }

    @Then("User verifies error")
    public void verifies_error(){
        new LoginPage(driver).getError();
    }
}
