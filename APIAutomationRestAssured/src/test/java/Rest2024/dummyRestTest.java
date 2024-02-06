package Rest2024;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class dummyRestTest {
@Test
	public void testmethod1()
{
JsonPath js= new JsonPath(payload.CoursePrice());
int cont=js.get("courses.size()");
System.out.println(cont);
	}

}
