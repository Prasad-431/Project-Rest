package RESTAssured.Test1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
public class Postdemo {
	
	@Test()
	public void checkpost()
	{
	JSONObject jsonobject= new JSONObject();
	jsonobject.put("name", "Durgaprasadreddy");
	jsonobject.put("job", "Automation tester");
	baseURI="https://reqres.in";
	given()
	.body(jsonobject.toJSONString())
	.when()
	.post("/api/users")
	.then()
	.statusCode(201)
	.log().all();
		
		
	}
	
	
	@Test(enabled=false)
	public void checkget()
	{
		baseURI="https://reqres.in";
		RestAssured res= new RestAssured();
		given().
		get("/api/users?page=2").
		then()
		.body("data[1].email", equalTo("lindsay.ferguson@reqres.in"))
		.body("data.first_name", hasItems("Lindsay","George"))
		.statusCode(200)
		.log().all();
	}

}
