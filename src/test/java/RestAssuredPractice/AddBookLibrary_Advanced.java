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

public class AddBookLibrary_Advanced {
	
	@Test(dataProvider="testData")
	// it gets value from getData method and passes to addBook method.
	public void addBook(String isbn, String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166";
		
		Response responseString =given().
		//Added parameter in body and body is passed in payLoad class		
		body(payLoad.addBook(isbn,aisle)).
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

	// For multiple time test execution we used DataProvider annotation
	@DataProvider(name="testData")
	public Object[][] getData() {
		
		return new Object[][] {{"NKS1","1243"},{"NKS2","1293"},{"NKh1","71243"}};
	}
}
