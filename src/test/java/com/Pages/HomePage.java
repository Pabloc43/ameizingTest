package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By myAccountLink = By.xpath("//a[contains(text(),'My Account')]");
    private By registerLink = By.xpath("//a[contains(text(),'Register')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToRegisterPage() {
        click(myAccountLink);
        click(registerLink);
    }
}
