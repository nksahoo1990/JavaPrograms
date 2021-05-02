package RestAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth_Twitter {
	
	public void testTwitter() {
		
		Response resp=RestAssured.given()
		.auth()
		.oauth("", "", "", "")
		.post("");
		
		System.out.println(resp.getStatusCode());
			
	}

}
