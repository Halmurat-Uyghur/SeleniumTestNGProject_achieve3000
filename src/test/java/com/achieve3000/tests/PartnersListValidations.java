package com.achieve3000.tests;

import com.achieve3000.pages.BasePage;
import com.achieve3000.pages.PartnersListPage;
import com.achieve3000.utilities.ConfigReader;
import com.achieve3000.utilities.Driver;
import com.achieve3000.utilities.WebDriverToolBox;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PartnersListValidations {

    @BeforeClass
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        BasePage.waitSpinnerDisappear();
    }


    @Test
    public void test_Logo_Headers_Description() {


        BasePage.clickMenuToggle();

        BasePage.clickByLinkText(PartnersListPage.WhoWeAre.PARTNERS.getValue());

        List<WebElement> allPartners = PartnersListPage.getAllPartners();

        List<String> logoAddresses = PartnersListPage.getPartnersLogos(allPartners);

        Assert.assertTrue(allPartners.stream().allMatch(partner -> {
                    WebDriverToolBox.scrollIntoMiddleView(partner);
                    return partner.findElement(PartnersListPage.IMG_LOGO).isDisplayed();
                }));


        Assert.assertTrue(allPartners.stream().allMatch(partner -> {
                    WebDriverToolBox.scrollIntoMiddleView(partner);
                    return !partner.findElement(PartnersListPage.H3_HEADER).getText().isEmpty();
                }));

        Assert.assertTrue(allPartners.stream().allMatch(partner -> {
                    WebDriverToolBox.scrollIntoMiddleView(partner);
                    return !partner.findElement(PartnersListPage.P_DESCRIPTION).getText().isEmpty();
                }));
    }

    @AfterClass
    public void closeDriver() {
        Driver.closeDriver();
    }


}
