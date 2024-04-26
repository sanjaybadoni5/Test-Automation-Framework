package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderConfirm extends BasePage {
    public WebDriver driver;

    public OrderConfirm() throws IOException {
        super();
    }

    By paymentAmount = By.cssSelector("span > strong");

    public WebElement getPaymentAmount() throws IOException {
        this.driver = getDriver();
        return driver.findElement(paymentAmount);
    }
}
