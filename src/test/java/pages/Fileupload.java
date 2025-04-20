package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static pages.Formpage.*;

public class Fileupload {
    public static String choosefile = "//input[@id='uploadPicture']";

//    uploading a image file
    public static void setChoosenfile() {
        WebElement upload = driver.findElement(By.id("uploadPicture"));
        upload.sendKeys("C:\\Users\\becau\\IdeaProjects\\Intuji-Form-Automation\\src\\images\\cleananddirtroad (1).py");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
