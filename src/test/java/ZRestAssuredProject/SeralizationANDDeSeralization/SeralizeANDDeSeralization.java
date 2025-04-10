package SeralizationANDDeSeralization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

/*
Serialization – is process of converting the POJO  objects to JSON
Deserialization – is process of converting the JSON object to an POJO calss obejcts
We generally use POJOs to create JSON payload and convert JSON response payload to Java objects
conversions can be done with help of Java libraries like Jackson, Gson etc

Use overloaded obejct mapper writValuAasString() method    --> to convert POJO to JSON
Use overloaded obejct mapper readValue() method    --> to convert  JSON to POJO

 */

public class SeralizeANDDeSeralization extends  APIBaseClass{

    @Test
    public void serilazationUSEPOSTMethod() throws JsonProcessingException {

        String baseURI = "https://jsonplaceholder.typicode.com/users/";

        User user = new User(0, "Test", "email@email.com"); // VERY IMP should have same exact format of OUTPUT

        ObjectMapper objm = new ObjectMapper();
        String requestbody = objm.writerWithDefaultPrettyPrinter().writeValueAsString(user);

        Response resp = postAPI(requestbody,baseURI); //// IMP **** RESPONSE Response IS IMP

        //Serialization  IMP****
        System.out.println(resp.asPrettyString());
        JsonPath jp = resp.jsonPath();
        String name = jp.get("name");
        System.out.println("name--> " + name);

        String eamil = jp.get("email");
        System.out.println("email--> "  +eamil);
    }


    @Test
    public void DserilazationUSEPOSTMethodGet() throws JsonProcessingException {

        String baseURI = "https://jsonplaceholder.typicode.com/users/1";

        Response resp = getAPI(baseURI); //// IMP **** RESPONSE Response IS IMP

        System.out.println(resp.asString());
           /// SOLVE LATER


    }


}
