
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String standard_user = "standard_user";
    private final String secret_sauce = "secret_sauce";

    @FindBy(id = "user-name")
    private WebElement Username;

    @FindBy(id = "password")
    private WebElement Password;

    @FindBy(id = "login-button")
    private WebElement SubmitButton;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(){
        this.Username.sendKeys(standard_user);
    }

    public void enterPassword(){
        this.Password.sendKeys(secret_sauce);
    }

    public void pressSubmitButton(){
        this.SubmitButton.click();
    }
}
