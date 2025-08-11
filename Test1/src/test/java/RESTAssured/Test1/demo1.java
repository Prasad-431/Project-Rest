package RESTAssured.Test1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class demo1 {
@Test(enabled=false)
public void checkstatus()
{
	Response response=get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.time());
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));

}

@Test()
public void second() {
	
	baseURI="https://reqres.in/api";
	given().get("/users?page=2").then().statusCode(200)
	.body("data.id[1]",equalTo(8)).log().all();
	
}

@Test()
public void checkstatus1()
{
	
baseURI="https://reqres.in/";

given()
.get("/api/users/23")
  .then()
  .statusCode(404).log().all();


}

}
