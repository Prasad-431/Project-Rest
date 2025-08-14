package Demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Parameterizedtest {
	@Test
	public void test1() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		Header h1 = new Header("Accept", "application/json");
		RequestSpecification httprequest = RestAssured.given().header(h1);
		for (int i = 1; i <= 5; i++) {
			System.out.println("***********************");
			Response response = httprequest.get("/posts/" + i);
			int statuscode = response.getStatusCode();
			JsonPath path = response.jsonPath();
			String title = path.get("title");
			int ID = path.get("id");
			System.out.println("statuscode: " + statuscode + "\ntitle: " + title + "\nID: " + ID);
			Assert.assertEquals(200, statuscode);
			Assert.assertTrue(!title.equals(""));
			Assert.assertEquals(i, ID);

		}

	}
}
