package Demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Getrequest {
  @Test
  public void Test1() {
	  RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	  Header h1= new Header("Accept","application/json");
	  RequestSpecification httprequest= RestAssured.given().header(h1);
	  Response response= httprequest.request(Method.GET,"/posts/1");
	  String body=response.getBody().asString();
	  System.out.println("Response Body =>"+body);
	  JsonPath path= response.jsonPath();
	 Assert.assertEquals(path.getInt("userId "), 1);
	 Assert.assertEquals(path.getInt("id "), 1);
	 Assert.assertTrue(!path.getString("title").equals(""));
	  int statuscode=response.getStatusCode();
	  Assert.assertEquals(statuscode, 200);
	  
  }
  @Test(enabled=false)
  public void test2() {
	  RestAssured.given()
	  .baseUri("https://jsonplaceholder.typicode.com")
	  .header("Accept","application/json")
	  .when()
	  .get("/posts/1")
	  .then()
	  .statusCode(200);
  }
}
