package RestAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class S2 {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification a = RestAssured.given();
		JSONObject obj = new JSONObject();
		obj.put("name", "chirag");
		obj.put("job", "sdet");
		a.contentType(ContentType.JSON);
		a.body(obj.toJSONString());
		
		Response res = a.request(Method.GET,"api/users");
		String s = res.prettyPrint();
		System.out.println(s);
		

	}

}
