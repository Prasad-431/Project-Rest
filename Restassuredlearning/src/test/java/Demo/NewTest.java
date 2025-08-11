package Demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewTest {
	@Test
	public void Test1() {
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		Header h1 = new Header("Accept", "application/json");
		RequestSpecification request = RestAssured.given().header(h1);
		Response response = request.get();
		String body = response.getBody().asString();
		System.out.println("Response Body =>" + body);
		int statuscode = response.getStatusCode();
		String statusline = response.getStatusLine();
		String contenttype = response.getContentType();
		System.out.println("Status Code =>" + statuscode);
		System.out.println("Status Line =>" + statusline);
		System.out.println("contentype =>" + contenttype);
//		JsonPath jo= response.jsonPath();
//	String id=	jo.get("data.id").toString();
//	System.out.println("id =>"+id);
		Headers allheaders = response.getHeaders();
		for (Header h : allheaders) {
System.out.println("Header Name: "+h.getName()+" Header value: "+h.getValue());
		}

	}
}
