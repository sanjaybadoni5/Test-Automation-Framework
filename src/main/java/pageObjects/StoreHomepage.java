package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class StoreHomepage extends BasePage {
    public WebDriver driver;

    public StoreHomepage() throws IOException {
        super();
    }

    // TODO: functional array of products in each category?
    By product = By.cssSelector("[data-id-product]"); // currently returns the first found element, even though there are 18

    public WebElement getProduct() throws IOException {
        this.driver = getDriver();
        return driver.findElement(product);
    }
}
