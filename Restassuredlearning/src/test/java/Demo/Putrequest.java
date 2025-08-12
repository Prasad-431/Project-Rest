package Demo;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Putrequest {
	@Test
	public void Test1() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/1";
		Header h1 = new Header("Accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		RequestSpecification httprequest = RestAssured.given().header(h1).header(h2);
		JsonObject jo = new JsonObject();
		jo.addProperty("id", 1);
		jo.addProperty("title", "This is putrequest");
		jo.addProperty("body", "Put request demo");
		jo.addProperty("userId", 1);
		String jsonbody = jo.toString();
		httprequest.body(jsonbody);

		Response response = httprequest.put();
		int statuscode = response.getStatusCode();
		String responsebody = response.getBody().asString();
		System.out.println("Response Body =>" + responsebody);
		JsonPath path = response.jsonPath();
		int response_id = path.getInt("id");
		String response_title = path.getString("title");
		String response_body = path.getString("body");
		int response_userid = path.getInt("userId");
		Assert.assertEquals(200, statuscode);
		Assert.assertEquals(1, response_id);
		Assert.assertEquals("This is putrequest", response_title);
		Assert.assertEquals("Put request demo", response_body);
		Assert.assertEquals(1, response_userid);
	}
}
