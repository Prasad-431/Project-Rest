package Demo;

import java.io.FileInputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Postrequest {
	@Test(dataProvider = "getdata", enabled = false)
	public void test1(Object body) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		Header h1 = new Header("Accept", "application/json");

		RequestSpecification httprequest = RestAssured.given();
		httprequest.body(body);
		Response response = httprequest.request(Method.POST, "/posts");
		System.out.println("Response Body =>" + response.getBody().asString());

	}

	@Test
	public void test2() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		Header h1 = new Header("Accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		RequestSpecification httprequest = RestAssured.given().header(h1).header(h2);
		JsonObject jo = new JsonObject();
		jo.addProperty("title", "Learn REST Assured");
		jo.addProperty("body", "This is a test post");
		jo.addProperty("userId", 101);
		String jsonbody = jo.toString();
		httprequest.body(jsonbody);
		Response response = httprequest.request(Method.POST, "/posts");
		int responsecode = response.getStatusCode();
		String responsebody = response.getBody().asString();
		System.out.println("Response Body => " + responsebody);
		JsonPath path1 = response.jsonPath();
		int id = path1.getInt("id");
		System.out.println(" id =>" + id);
		Assert.assertEquals(101, id);

//		RequestSpecification getrequest = RestAssured.given().header(h1);
//		Response getresponse = getrequest.request(Method.GET, "/posts/" + id);
//		String getresponsebody = getresponse.getBody().asString();
//		System.out.println("Response Body =>"+getresponsebody);
		JsonPath path = response.jsonPath();
		String title = path.getString("title");
		String body = path.getString("body");
		int userId = path.getInt("userId");
		Assert.assertEquals(201, responsecode);
		Assert.assertEquals("Learn REST Assured", title);
		Assert.assertEquals("This is a test post", body);
		
	}

	@DataProvider
	public Object[][] getdata() throws Exception {

		JsonObject jo = Excelreader.readdata();
		String body = jo.toString();
		return new Object[][] { { body } };

	}
}
