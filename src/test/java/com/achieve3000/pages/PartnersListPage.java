package com.achieve3000.pages;


import com.achieve3000.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class PartnersListPage extends BasePage{

    public static By DIV_ALL_PARTNERS = By.xpath("//div[@class='row h-100 ']");
    public static By IMG_LOGO = By.xpath(".//img");
    public static By H3_HEADER = By.xpath(".//h3");
    public static By P_DESCRIPTION = By.xpath(".//p");

    /**
     * This method will return all the displayed partners element from partners list page.
     * @return list of partners element
     */
    public static List<WebElement> getAllPartners() {
        return Driver.getDriver().findElements(DIV_ALL_PARTNERS);
    }

    /**
     * This method will return all the logo addresses on list of partner.
     * @param partners any list of partner that we need to get the logo of.
     * @return list of logo img address.
     */
    public static List<String> getPartnersLogos(List<WebElement> partners) {
        return partners.stream().map(partner -> partner.findElement(PartnersListPage.IMG_LOGO).
                getAttribute("src")).collect(Collectors.toList());
    }


}
