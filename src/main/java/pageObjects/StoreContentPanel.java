package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreContentPanel {
    public WebDriver driver;

    public StoreContentPanel(WebDriver driver){
        this.driver = driver;
    }

    By continueShoppingBtn = By.cssSelector(".cart-content-btn [data-dismiss]");
    By proceedToCheckoutBtn = By.cssSelector(".modal-body .btn.btn-primary");

    public WebElement getContinueShoppingBtn(){
        return driver.findElement(continueShoppingBtn);
    }
    public WebElement getProceedToCheckoutBtn(){
        return driver.findElement(proceedToCheckoutBtn);
    }
}
