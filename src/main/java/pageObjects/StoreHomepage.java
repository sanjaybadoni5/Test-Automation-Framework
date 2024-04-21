package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreHomepage {
    public WebDriver driver;

    public StoreHomepage(WebDriver driver){
        this.driver = driver;
    }

    // TODO: functional array of products in each category?
    By product = By.cssSelector("[data-id-product]"); // currently returns the first found element, even though there are 18
}
