package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    private By searchBox = By.name("search");
    private By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String productName) {
        type(searchBox, productName);
        click(searchButton);
    }
}
