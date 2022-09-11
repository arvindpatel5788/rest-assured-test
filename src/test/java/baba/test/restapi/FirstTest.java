package baba.test.restapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class FirstTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
   			given().
    	    when().
    	        get("http://ergast.com/api/f1/2017/circuits.json").
    	    then().
    	        statusCode(200);
        
        
    }
    
    @Test
    public void logResponseToConsole()
    {
    	Response response = 
    			given().
    			when().
    	        	get("http://ergast.com/api/f1/2017/circuits.json");
    	
			System.out.println(response.asPrettyString());
			System.out.println("hey there");
    	    
    	
        
        
    }
    
    @Test
    public void assertionOnBody()
    {
			given().
    	    when().
    	        get("http://ergast.com/api/f1/2017/circuits.json").
	        then().
	        assertThat().
	        body("MRData.total", equalTo("20"));
    	    
    	
        
        
    }


}
