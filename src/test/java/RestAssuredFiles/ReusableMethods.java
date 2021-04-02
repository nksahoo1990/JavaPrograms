package RestAssuredFiles;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public static JsonPath rawToJson(Response r)
	{ 
		String respon=r.asString();
		System.out.println(respon);
		JsonPath x=new JsonPath(respon);
		return x;
	}

}
