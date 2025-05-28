package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiTest {
public static void main(String[] args) {
	RestAssured.baseURI = "https://reqres.in/api/users";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("/2");
	System.out.println("Response Body Is :" + response.asString());
	System.out.println("Response Status Is :" + response.getStatusCode());
}
}
