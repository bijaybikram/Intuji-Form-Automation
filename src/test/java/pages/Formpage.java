package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Formpage {

    public static String first_name = "//input[@id='firstName']";
    public static String last_name = "//input[@id='lastName']";
    public static String gender = "//label[@for='gender-radio-1']";
    public static String mobile = "//input[@id='userNumber']";
    //    date picking xpaths
//    public static String year = "2006";
//    public static String month = "January";
//    public static String monthnum = "1";
//    public static String weekday = "Wednesday";
//    public static String day = "18th";
    public static String dobInput = "//input[@id='dateOfBirthInput']";
    //    public static String dobYear = "//select[@class='react-datepicker__year-select']";
//    public static String dobYearChoose = "//option[@value='" + year + "']";
//    public static String dobMonth = "//select[@class='react-datepicker__month-select']";
//    public static String dobMonthChoose = "//option[@value='" + monthnum + "']";
    public static String dobDayChoose = "//div[@aria-label='Choose Tuesday, April 15th, 2025']";
    public static String submit = "//button[@id='submit']";
    public static String successtext = "//div[@id='example-modal-sizes-title-lg']";



    public static WebElement element(String path) {
        return driver.findElement(By.xpath(path));
    }


    public static WebDriver driver;

    public static void setUp() throws InterruptedException{
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void input_required_form_details(String f_name, String l_name, String mob) {
        element(first_name).sendKeys(f_name);
        element(last_name).sendKeys(l_name);
        element(gender).click();
        element(mobile).sendKeys(mob);
        element(dobInput).click();
//        element(dobYear).click();
//        element(dobYearChoose).click();
//        element(dobMonth).click();
//        element(dobMonthChoose).click();
        element(dobDayChoose).click();
    }

    public static void submit_form() {
        element(submit).submit();
    }

//    check if the form is submitted
    public static void submit_pass_check() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(element(successtext).getText(), "Thanks for submitting the form");
        driver.quit();
    }

//    check if the form is submitted
    public static void submit_fail_check() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> successElements = driver.findElements(By.id("example-modal-sizes-title-lg"));
//        Assert.assertFalse(element(successtext).isDisplayed());
        // Assert that either it's not found or not displayed
        Assert.assertTrue(successElements.isEmpty() || !successElements.getFirst().isDisplayed());
        driver.quit();
    }



}