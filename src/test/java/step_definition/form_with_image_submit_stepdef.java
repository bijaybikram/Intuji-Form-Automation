package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Formpage.*;
import static pages.Fileupload.*;

public class form_with_image_submit_stepdef {

    @When("^User add a non image file$")
    public void user_add_a_non_image_file() throws InterruptedException {
        setChoosenfile();
    }

//    @Then("^User is shown with submitted form preview$")
//    public void user_is_shown_with_submitted_form_preview() throws InterruptedException {
//        submit_pass_check();
//    }

}