package RestAssuredPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2 {
	
	@Test
	public void Test0Auth2() {
		
		Response resp=RestAssured.
		given()
		.auth()
		.oauth2("97224a8e011e6deabf421ee0d10ed0cab643ffc7")
		.post("http://coop.apps.symfonycasts.com/api/1866/chickens-feed");
		
		System.out.println("Response code is: " + resp.getStatusCode());
		System.out.println(resp.getBody().asString());
		System.out.println("*******************************************");
		System.out.println(resp.jsonPath().prettify());
	}

}
