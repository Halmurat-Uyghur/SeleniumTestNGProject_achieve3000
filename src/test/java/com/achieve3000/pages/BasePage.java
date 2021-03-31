package com.achieve3000.pages;

import com.achieve3000.utilities.Driver;
import com.achieve3000.utilities.WebDriverToolBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public static By BUTTON_MENU_TOGGLE = By.xpath("//button[contains(@class,'navbar-toggler')]");
    public static By DIV_LOADER = By.xpath("//div[@class='loader']");

    /**
     * click menu toggle at nav bar right top corner,
     */
    public static void clickMenuToggle(){
        WebDriverToolBox.waitForVisibility(Driver.getDriver().findElement(BUTTON_MENU_TOGGLE),5);
        Driver.getDriver().findElement(BUTTON_MENU_TOGGLE).click();
    }

    /**
     * Open any linkText from main navigation container
     * @param linkText
     */
    public static void clickByLinkText(String linkText){
        Driver.getDriver().findElement(By.linkText(linkText)).click();
    }

    /**
     * wait for spinner to disappear
     */
    public static void waitSpinnerDisappear(){
        WebDriverToolBox.waitForInvisibility(Driver.getDriver().findElement(DIV_LOADER),5);
    }

}
