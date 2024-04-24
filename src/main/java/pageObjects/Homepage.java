package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Homepage {
    public WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    By toggle = By.cssSelector(".toggle");
    By testStoreLink = By.linkText("TEST STORE");
    By cookie = By.cssSelector(".close-cookie-warning > span");
    By sidebar = By.xpath("//div[@id='sidebar']");

    public WebElement getToggle(){
        return driver.findElement(toggle);
    }
    public WebElement getTestStoreLink(){
        return driver.findElement(testStoreLink);
    }
    public WebElement getCookie() throws IOException {
        return driver.findElement(cookie);
    }
    public WebElement getSidebar(){
        return driver.findElement(sidebar);
    }
}
