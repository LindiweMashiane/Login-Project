
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", LaunchWebPage.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a WebForm")
    public static void submitForm() throws InterruptedException {
        driver.get(LaunchWebPage.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUserName();
        webForm.enterPassword();
        webForm.pressSubmitButton();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    //Closing Web Browser
    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}