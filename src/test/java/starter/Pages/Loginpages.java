package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpages extends PageObject {

    @FindBy(xpath ="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement iconBooksStore;
    public void clickIconBooksStore() {
//        waitForCondition().until(ExpectedCondition.elementToBeClickable(iconBooksStore));
        iconBooksStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;
    public void clickButtonLogin() {
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPass;

    @FindBy(id ="login")
    WebElement ButtonLogin2;

    public void inputUserNamePassValid() {
        inputUserName.sendKeys("andiefendi1");
        inputPass.sendKeys("Testing@1");
    }

    public void inputUserNameInValid() {
        inputUserName.sendKeys("ando");
        inputPass.sendKeys("Testing@1");
    }

    public void inputPassValid() {
        inputUserName.sendKeys("andiefendi1");
        inputPass.sendKeys("Testing@2");
    }

    public void clickLogin2() {
        ButtonLogin2.click();
    }
}












