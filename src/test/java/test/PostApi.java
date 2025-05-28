package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class PostApi {
	@Test
public void checkPostApi() {
		
		// Prepare Request URL
		
		String url = "https://reqres.in";
		String request = "/api/users";
		String apicall = url + request;
		
		// Prepare JSON Pay load
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "morpheus");
		jsonObject.put("job", "leader");
		String payload = jsonObject.toString();
		
		//Execute Post Call
		
		RequestSpecification requestSpecification = RestAssured.given().contentType("application/json").body(payload);
		Response response = requestSpecification.post(apicall);
		int statusCodeForPostCall  = response.getStatusCode();
		System.err.println("Status Code for Post Call is :" + statusCodeForPostCall);
		String statusLineForPostCall = response.getStatusLine();
		System.err.println("Status line for post call is : " + statusLineForPostCall);
}
}
