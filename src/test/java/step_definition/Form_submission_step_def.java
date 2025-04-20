package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Formpage.*;

public class Form_submission_step_def {

    @Given("^User navigates to demo-form page$")
    public void user_navigates_to_demo_form_page() throws InterruptedException {
        setUp();
    }


//    Enter required form details for successful submission
    @Given("^User enters valid Firstname (.*) or Lastname (.*) or Mobile (.*)$")
    public void user_enters_valid_req_details(String first_name, String last_name, String mobile) throws InterruptedException {
        input_required_form_details(first_name, last_name, mobile);
    }

    @When("^User clicks submit button$")
    public void user_clicks_submit_button() throws InterruptedException {
        submit_form();
    }

}
