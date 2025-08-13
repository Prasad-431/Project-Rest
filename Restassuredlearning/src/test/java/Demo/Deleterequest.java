package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deleterequest {
	@Test
	public void test1() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		Header h1 = new Header("Accept", "application/json");
		RequestSpecification httprequest = RestAssured.given().header(h1);
		Response response = httprequest.delete("/posts/1");
		int statuscode = response.getStatusCode();
		Assert.assertTrue(statuscode == 200 || statuscode == 204,
				"statuscode expected is 200 or 204 but got :" + statuscode);
		response.prettyPeek();
		
	}
}
