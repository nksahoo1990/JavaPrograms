package RestAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class TestLib {

	public void testBooks() {
		
		//RequestSpecification
		RestAssured.baseURI="http://localhost:3000";
		
		Response res=given().param("id","2")
		.when()
		.get("/posts/1")
		.then().assertThat().statusCode(200)
		.extract().response();
		String str=res.toString();
		System.out.println("Books response is: " + str);
		JsonPath jp = new JsonPath(str);
		System.out.println("Book id is:" + jp.get("title"));
		
		/*Response res=given()
		.body("{\r\n" + 
				"    \"id\": 3,\r\n" + 
				"    \"title\": \"ABC\",\r\n" + 
				"    \"author\": \"Jai Sri Ram\"\r\n" + 
				"}")
		.when()
		.post("/posts")
		.then()
		.assertThat().statusCode(200)
		.extract().response();
		String str=res.toString();
		System.out.println("Books response is: " + str);
		JsonPath jp = new JsonPath(str);
		System.out.println("Book id is:" + jp.get("title"));*/
	}
}
