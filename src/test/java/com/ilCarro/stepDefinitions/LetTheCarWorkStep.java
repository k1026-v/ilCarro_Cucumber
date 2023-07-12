package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LetTheCarWorkPage;
import com.ilCarro.pages.LoginPage;
import data.Car;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class LetTheCarWorkStep {

    @And ("User accepts log in message")
    public void  accept_login_message(){
        new LoginPage(driver).acceptMessage();
    }

    @And("User clicks on Let the car work link")

    public void click_on_Let_the_car_work_link(){

        new HomePage(driver).clicksOnLetTheCarWorkLink();
    }

    @And("User selects location")
    public void select_location(){
        new LetTheCarWorkPage(driver).selectLocation("Tel Aviv");
    }

    @And("User enters valid car details")
    public void  enter_valid_data_car(){
        new LetTheCarWorkPage(driver).carDetails1(Car.MANUFACTURE,Car.MODEL,Car.YEAR);
    }

    @And("User selects fuel")
    public void select_fuel(){
        new LetTheCarWorkPage(driver).selectFuel();
    }

    @And("User selects number of seats")
    public void select_seats(){
        new LetTheCarWorkPage(driver).selectSeats();

    }

    @And("User continues enter valid car details")
    public void  continue_enter_valid_data_car(){
        new LetTheCarWorkPage(driver).carDetails2(Car.CAR_CLASS,Car.SERIAL_NUMBER, Car.PRICE, Car.ABOUT);
    }



    @And("User uploads file")
    public void upload_file(){
        new LetTheCarWorkPage(driver).uploadFile("C:/Users/AIT TR Student/Downloads/Pic.jpg");

    }


    @And("User clicks on Submit button")
    public void click_on_Submit_button (){
        new LetTheCarWorkPage(driver).clickOnSubmitButton();
    }

    @Then("User verifies Car added message")

        public void  verify_Car_added_message(){
        new LetTheCarWorkPage(driver).isCarAddedMessageDisplayed();

    }


}
