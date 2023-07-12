package com.ilCarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetTheCarWorkPage extends BasePage {
    public LetTheCarWorkPage(WebDriver driver) { super(driver);
    }

    @FindBy(id="pickUpPlace")
    WebElement locationContainer;


    public LetTheCarWorkPage selectLocation(String city) {


        locationContainer.sendKeys(city);
        pausa(1000);
        locationContainer.sendKeys(Keys.DOWN);
        locationContainer.sendKeys(Keys.ENTER);
        return this;
    }


    @FindBy(id="make")
    WebElement manufactureField;

    @FindBy(id="model")
    WebElement modelField;

    @FindBy(id="year")
    WebElement yearField;



    @FindBy(id="seats")
    WebElement seatsField;


    public LetTheCarWorkPage carDetails1(String manufacture, String model, String year) {
    type(manufactureField, manufacture);
    type(modelField, model);
    type(yearField, year);
        return this;
    }

    @FindBy(id="fuel")
    WebElement fuelField;


    public LetTheCarWorkPage selectFuel() {

        fuelField.click();
         pausa(1000);
        fuelField.sendKeys(Keys.DOWN);
        fuelField.sendKeys(Keys.ENTER);
        return this;
    }
    public LetTheCarWorkPage selectSeats() {
        seatsField.click();
        pausa(1000);
        seatsField.sendKeys(Keys.UP);
        seatsField.sendKeys(Keys.UP);
        seatsField.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id="class")
    WebElement carClassField;

    @FindBy(id="serialNumber")
    WebElement serialNumberField;

    @FindBy(id="price")
    WebElement priceField;

    @FindBy(id="about")
    WebElement aboutField;
    public LetTheCarWorkPage carDetails2(String carClass, String serialNumber,Integer price, String about) {

        type(carClassField, carClass);
        type(serialNumberField, serialNumber);
        type(priceField, String.valueOf(price));
        type(aboutField, about);
        return this;
    }

    @FindBy (id="photos")
    WebElement uploadPicture;

    public LetTheCarWorkPage uploadFile(String path){
        uploadPicture.sendKeys(path);

        return this;
    }

    @FindBy(css="[type='submit']")
    WebElement submitButton;
    public LetTheCarWorkPage clickOnSubmitButton() {
        click(submitButton);
        return this;
    }


    @FindBy(xpath = "//h1[.='Car added']")
    WebElement successfulAddMessage;
    public LetTheCarWorkPage isCarAddedMessageDisplayed() {
        assert isElementDisplayed(successfulAddMessage);

        return this;
    }




}
