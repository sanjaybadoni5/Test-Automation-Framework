package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BasePage {
    public static WebDriver driver;
    private String url;
    private final Properties prop;

    public BasePage() throws IOException{
        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
        prop.load(data);
    }

    public WebDriver getDriver() throws IOException{
        if (prop.getProperty("browser").equals("chrome")){
            System.getProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.getProperty("webdriver.edge.driver",
                    System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\msedgedriver.exe");
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--inprivate");
            driver = new EdgeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    public String getUrl() throws IOException{
        url = prop.getProperty("url");
        return url;
    }

    public void takeScreenShot(String name) throws IOException{
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destFile = new File(System.getProperty("user.dir") + "\\target\\screenshots\\" + timestamp() + ".png");

        FileUtils.copyFile(srcFile, destFile);
    }

    public String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
