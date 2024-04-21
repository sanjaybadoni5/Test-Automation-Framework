package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreContentPanel {
    public WebDriver driver;

    public StoreContentPanel(WebDriver driver){
        this.driver = driver;
    }

    By continueShoppingBtn = By.xpath("//button[@innertext='Continue shopping']");
    By proceedToCheckoutBtn = By.xpath("//a[@innertext='Proceed to checkout']");

    public WebElement getContinueShoppingBtn(){
        return driver.findElement(continueShoppingBtn);
    }
    public WebElement getProceedToCheckoutBtn(){
        return driver.findElement(proceedToCheckoutBtn);
    }
}
