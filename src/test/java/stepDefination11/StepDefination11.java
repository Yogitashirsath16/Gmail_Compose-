package stepDefination11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.GmailLogin;

public class StepDefination11 {
	public String title;
	public WebDriver driver;
	public GmailLogin gl;
	String act;

	@Given("User is able to launch chrome browser")
	public void user_is_able_to_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		gl = new GmailLogin(driver);
	}

	@When("User is able to open  URL with {string}")
	public void user_is_able_to_open_url_with(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters username as {string}")
	public void user_enters_username_as_and_password_as(String username) throws InterruptedException {
		gl.getUN(username);
	}

	@When("Click On Next button")
	public void click_on_next_button() throws InterruptedException {
		gl.clickon();
	}

	@When("user entrs password As {string}")
	public void user_entrs_password_as(String Password) throws InterruptedException {
		gl.getPWD(Password);
	}

	@When("Click On another Next button")
	public void click_on_another_next_button() throws InterruptedException {
		gl.clickon1();
	}
	/*
	 * @When("click on cancle button") public void click_on_cancle_button() {
	 * gl.cancle(); }
	 */

	@When("Click on Compose Button")
	public void click_on_compose_button() throws InterruptedException
	{
		
		gl.compose();
	}

	@When("Add receipent As {string}")
	public void add_receipent_as(String recepient) throws InterruptedException {
		gl.recepient(recepient);
	}

	@When("write subject As {string}")
	public void write_subject_as(String subject) throws InterruptedException {
		gl.subject(subject);
	}

	@When("write body As {string}")
	public void write_body_as(String body) throws InterruptedException {
	gl.body(body);
	}

	@Then("Mail Should be sent")
	public void mail_should_be_sent() throws InterruptedException {
		gl.sendButton();
	}

}
