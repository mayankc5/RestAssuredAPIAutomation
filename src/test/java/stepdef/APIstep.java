package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class APIstep {
	RequestSpecification requestObj;
	Response response;
	String cityResponse;
	String weatherResponse;
	@Given("^I have base URL$")
    public void setBaseURL()  {     
      RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
    }
    
    @When("^I create request$")
    public void createRequest(){
        requestObj=RestAssured.given();
    }
    
    @When("^I send request$")
    public void sendRequest(){
       response= requestObj.get("/Hyderabad");
    }
    
    @When("^System returned response$")
    public void getResponse()  {
        weatherResponse=response.getBody().asString();
        System.out.println(weatherResponse);
        cityResponse=response.jsonPath().get("City");
        System.out.println(cityResponse);
       
    }
    @When("^I validate response$")
    public void validateResponse() {
      Assert.assertEquals("Hyderabad", cityResponse);
    }

}
