package RESTAssured.Test1;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import Files.getjson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Practise {
	public static void main(String args[]) {
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
	String response=	
	given()		
		    .queryParam("key", "qaclick123")
	        .header("content-type","application/json")
	        .body(getjson.addplace())
	.when()
	        .post("maps/api/place/add/json")
	.then()
	        .log().all()
	        .statusCode(200)
	        .extract().response().asString();
	
	JsonPath js= new JsonPath(response);
	String placeid=js.getString("place_id");
	
	
	System.out.println(placeid);
	String newaddress="12-263, Tusndur";
	
	
	
	given()
	        .queryParam("key", "qaclick123")
	        .header("content-type","application/json")
	        .body("{\r\n"
	        		+ "   \"place_id\": \""+placeid+"\", \r\n"
	        		+ " \"address\": \""+newaddress+"\",\r\n"
	        		+ "\"key\":\"qaclick123\"\r\n"
	        		+ "\r\n"
	        		+ "				}").
	when()       
	        .put("maps/api/place/update/json").
	then()  
	        .statusCode(200).log().all();
	
	
 String response1=  given()
           .queryParam("key", "qaclick123")
           .queryParam("place_id", placeid).
    when()
           .get("maps/api/place/get/json").  
    then()
           .statusCode(200).log().all()
           .extract().response().asString();
 
 JsonPath js1= new JsonPath(response1);
 
 String actualaddress=js1.getString("address");
	 
	Assert.assertEquals(actualaddress,newaddress);
	
	
	
	
	given().queryParam("key", "qaclick123").header("Content-Type","application/json").
	body("{\r\n"
			+ "   \"place_id\": \""+placeid+"\"\r\n"
			+ "}")
	
	.when()
	.delete("maps/api/place/delete/json")
	.then().statusCode(200).log().all();
	
	
	
	
	given().queryParam("key", "qaclick123").queryParam("place_id", placeid)
	.when().get("maps/api/place/get/json").then().statusCode(404).log().all();
	
	}

}
