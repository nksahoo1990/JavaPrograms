package RestAssuredPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RestAssuredFiles.ReusableMethods;
import RestAssuredFiles.payLoad;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddBookLibrary_StaticJson {
	
	// Here we directly pass the json into code. We do this static json when there is no change in data is required.
	
	@Test
	public void addBook() throws IOException {
		
		RestAssured.baseURI="http://216.10.245.166";
		
		Response responseString =given().
		//Added parameter in body and body is passed in payLoad class		
		body(GenerateStringFromResource("C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\staticJson.json")).
		when().
		post("/Library/Addbook.php").
		then().assertThat().statusCode(200).
		extract().response();
		//rawToJSon method is created to change raw data to String and String as json format
		JsonPath j = ReusableMethods.rawToJson(responseString);
		//Gets the value from json and kept in a string
		String id = j.get("ID");
		System.out.println(id);
	}

	// For static json... generates srting from resource
	
	public static String GenerateStringFromResource(String path) throws IOException {
		return new String (Files.readAllBytes(Paths.get(path)));
	}
	
}
