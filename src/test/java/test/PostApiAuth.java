package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostApiAuth {
	
	String url = "https://gorest.co.in/public/v2/users";
	private String headerName;
	
	@Test(priority = 1)
	
	public void CreateUserApi() {
		String apiCall = url;
		
		// Create Pay load
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "ram");
		jsonObject.put("age", "5");
		jsonObject.put("gender", "male");
		String payload = jsonObject.toJSONString();
		String token = "3ff87dc9efdd35509df5921059ec734655fc4db529c8f3e137f06e82086be529";
		String authToken = "Bearer "+ token;
		
		// Call the Api
		
		RequestSpecification requestSpecification = RestAssured.given().header(headerName = "Authorization" ,authToken).contentType("application/json").body(payload);
		
		Response response = requestSpecification.post(apiCall);
		int statusCode = response.getStatusCode();
		System.err.println("Status Code Is :" + statusCode);
		String payloadData = response.body().prettyPrint();
		System.err.println(payloadData);
		
		
	}
}
