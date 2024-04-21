package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
    public WebDriver driver;

    public ShoppingCart(WebDriver driver){
        this.driver = driver;
    }

    By havePromo = By.linkText("Have a promo code?");
    By promoTextbox = By.cssSelector("input[name='discount_name']");
    By addPromoBtn = By.cssSelector("form[method='post']  span");
    By closePromo = By.linkText("Close");
    By removeItemBtn = By.cssSelector(".remove-from-cart > .float-xs-left.material-icons");
    By proceedToCheckoutBtn = By.linkText("PROCEED TO CHECKOUT");
    By quantityIncreaseBtn = By.cssSelector(".touchspin-up");
    By quantityDecreaseBtn = By.cssSelector(".touchspin-down");

    public WebElement getHavePromo(){
        return driver.findElement(havePromo);
    }
    public WebElement getPromoTextbox(){
        return driver.findElement(promoTextbox);
    }
    public WebElement getAddPromoBtn(){
        return driver.findElement(addPromoBtn);
    }
    public WebElement getClosePromo(){
        return driver.findElement(closePromo);
    }
    public WebElement getRemoveItemBtn(){
        return driver.findElement(removeItemBtn);
    }
    public WebElement getProceedToCheckoutBtn(){
        return driver.findElement(proceedToCheckoutBtn);
    }
    public WebElement getQuantityIncreaseBtn(){
        return driver.findElement(quantityIncreaseBtn);
    }
    public WebElement getQuantityDecreaseBtn(){
        return driver.findElement(quantityDecreaseBtn);
    }
}
