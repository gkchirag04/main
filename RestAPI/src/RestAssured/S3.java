package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class S3 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		Response res = a.request(Method.GET,"api/users?page=2");
		String s = res.asString();
		JsonPath json = new JsonPath(s);
		String d = json.getString("data.last_name");
		System.out.println(d);
		

	}

}
