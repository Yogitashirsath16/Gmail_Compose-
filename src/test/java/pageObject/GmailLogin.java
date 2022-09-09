package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	WebDriverWait wait;
	public WebDriver ldriver;

	public GmailLogin(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "identifierId")
	WebElement tx_username;

	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
	WebElement next;

	@FindBy(xpath = "(//*[@class=\"whsOnd zHQkBf\"])[1]")
	WebElement pwd;

	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
	WebElement next1;

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	WebElement compose;

	@FindBy(xpath="//input[contains(@class,'agP aFw')]")
	WebElement toInput;

	@FindBy(xpath = "//input[contains(@class,'aoT')]")
	WebElement subjectText;

	@FindBy(xpath = "//div[contains(@class,'Am Al editable LW-avf tS-tW')]")
	WebElement bodyTextElement;

	@FindBy(id = ":or")
	WebElement sendBtn;

	public void getUN(String username) throws InterruptedException {
		Thread.sleep(2000);
		tx_username.sendKeys(username);

	}

	public void clickon() throws InterruptedException {
		Thread.sleep(2000);
		next.click();
	}

	public void getPWD(String Password) throws InterruptedException {
		Thread.sleep(2000);
		pwd.sendKeys(Password);
	}

	public void clickon1() throws InterruptedException {
		Thread.sleep(2000);
		next1.click();
	}

	/*
	 * public void cancle() { canclebutton.click(); }
	 */
	public void compose() throws InterruptedException {
		Thread.sleep(2000);
		compose.click();
	}

	public void recepient(String receipent) throws InterruptedException {
		Thread.sleep(2000);
		toInput.sendKeys(receipent);
	}

	public void subject(String subject) throws InterruptedException {
		Thread.sleep(2000);
		subjectText.sendKeys(subject);
	}

	public void body(String body) throws InterruptedException {
		Thread.sleep(2000);
		bodyTextElement.sendKeys(body);
	}

	public void sendButton() throws InterruptedException {
		Thread.sleep(2000);
		sendBtn.click();
	}
}
