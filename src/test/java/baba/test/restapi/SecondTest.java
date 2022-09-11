package baba.test.restapi;



import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.response.Response;

public class SecondTest {
	
	@Test
	public void validateUserCrationTest() {

		 int dataSize;
		 int pageNum = 1;

		 Response response = 
						given().baseUri("https://reqres.in/")
						.param("page", pageNum)
						.when().get("/api/users");
						
						pageNum = response.jsonPath().get("page");
						dataSize = response.jsonPath().getList("data").size();
						System.out.println("page num is  : " + pageNum);
						System.out.println(response.asPrettyString());
		while (dataSize != 0);
		pageNum++;
		
		 Response response2 = 
					given().baseUri("https://reqres.in/")
					.param("page", pageNum)
					.when().get("/api/users");
		 dataSize = response2.jsonPath().getList("data").size();;
		 System.out.println("page num is  : " + pageNum);
		System.out.println(response2.asPrettyString());
	}

}
