package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");


    public ProgressBarPage clickProgressBarMenu () {
        scrollToElementJS(progressBarMenuItem);
        clickJS(progressBarMenuItem);
        return new ProgressBarPage();
    }

    public SelectMenuPage clickSelectMenu( ) {
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePickerMenu() {
        scrollToElementJS(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
