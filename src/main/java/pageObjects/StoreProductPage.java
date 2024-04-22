package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreProductPage {
    public WebDriver driver;

    public StoreProductPage(WebDriver driver){
        this.driver = driver;
    }

    By sizeOption = By.cssSelector("[aria-label='Size']");
    By quantityIncreaseBtn = By.cssSelector(".touchspin-up");
    By quantityDecreaseBtn = By.cssSelector(".touchspin-down");
    By addToCartBtn = By.cssSelector("[data-button-action]");
    By homepageLink = By.cssSelector("ol li:nth-of-type(1) span");

    public WebElement getSizeOption(){
        return driver.findElement(sizeOption);
    }
    public WebElement getQuantityIncreaseBtn(){
        return driver.findElement(quantityIncreaseBtn);
    }
    public WebElement getQuantityDecreaseBtn(){
        return driver.findElement(quantityDecreaseBtn);
    }
    public WebElement getAddToCartBtn(){
        return driver.findElement(addToCartBtn);
    }
    public WebElement getHomepageLink(){
        return driver.findElement(homepageLink);
    }
}
