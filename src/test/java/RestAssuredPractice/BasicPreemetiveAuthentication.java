package RestAssuredPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicPreemetiveAuthentication {

	@Test
	public void basicAuthTest() {
		
		int respCode=RestAssured.given().
		auth().preemptive()
		.basic("ToolsQA", "TestPassword")
		.when()
		.get("https://restapi.demoqa.com/authentication/CheckForAuthentication")
		.getStatusCode();
		
		System.out.println("Response code from server is :" + respCode);
	}
}
