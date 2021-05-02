package RestAssuredPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OAuth2_Handle {

	// In Oauth2 we retrieve token from one API and pass it to another API.
	
	@Test
	public void DemoOAuth2() {
		// Retrieves token code from first API
		Response resp=RestAssured.
		given()
		.formParam("client_id", "NityaRestAPI")
		.formParam("client_secret", "40c344be2ceeeca2e9a00eee555213b6")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		
		String str=resp.body().asString();
		JsonPath js = new JsonPath(str);
		String token=js.get("access_token");
		System.out.println("Access token key is : "+token);
		
		// Parameterizes the token key to this API. 
		Response resp1=RestAssured.
				given()
				.auth()
				.oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/1866/chickens-feed");
				
				System.out.println("Response code is: " + resp.getStatusCode());
				System.out.println(resp1.getBody().asString());
				System.out.println("*******************************************");
				System.out.println(resp1.jsonPath().prettify());
	}
	
}
