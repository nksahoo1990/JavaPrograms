package RestAssuredPractice;

import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import RestAssuredFiles.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AddBookLibrary {
	
	@Test
	public void addBook() {
		
		RestAssured.baseURI="http://216.10.245.166";
		
		Response responseString =given().
		body("{\r\n\r\n\"name\":\"Krushna Boook\",\r\n\"isbn\":\"DXYA\",\r\n\"aisle\":\"1015\",\r\n\"author\":\"Cena Sahoo\"\r\n}\r\n").
		when().post("/Library/Addbook.php").
		then().assertThat().statusCode(200).
		extract().response();
		JsonPath j = ReusableMethods.rawToJson(responseString);
		String id = j.get("ID");
		System.out.println(id);
		
		System.out.println("Response time is:  "+responseString.getTime());
		System.out.println("Response body is:  "+responseString.body().asString());
	
	}

}
