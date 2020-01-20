package stepDefenitions.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Browser {
    private static WebDriver driver;

    private Browser() {

    }

    private static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\v.dudarevich\\IdeaProjects\\twcAutotest2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public static WebDriver getInstance() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void destroy() {
        driver.quit();
        driver = null;
    }
}
