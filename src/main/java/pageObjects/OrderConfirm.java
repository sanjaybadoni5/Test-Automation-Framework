package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirm {
    public WebDriver driver;

    public OrderConfirm(WebDriver driver) {
        this.driver = driver;
    }

    By paymentAmount = By.cssSelector("span > strong");

    public WebElement getPaymentAmount() {
        return driver.findElement(paymentAmount);
    }
}
