
package ZRestAssuredProject.Test2FrameWork.EndPoints;


import Test2FrameWork.PayLoad.Booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static ZRestAssuredProject.Test2FrameWork.EndPoints.Routes.*;

public class BookingEndPoints {

    public static String token="";







  public void gerateTokenNew()
  {

      String json ="{\n" +
              "    \"username\" : \"admin\",\n" +
              "    \"password\" : \"password123\"\n" +
              "}";

             String s = String.format(json);
      Response resp = RestAssured
              .given()
              .contentType(ContentType.JSON)  // ** as per the Swagger output
                .body(s)
              .when()
              .post("https://restful-booker.herokuapp.com/auth")
              .then()
              .extract()
              .response();

      System.out.println("TOKEN __> " + resp.prettyPrint());
      token = resp.path("token");
      System.out.println("TOKEN __> " + token);


  }


    public static Response createBooking(Booking payload)
    {

        Response resp = RestAssured
                          .given()
                .contentType(ContentType.JSON)  // ** as per the Swagger output
                //.accept(ContentType.JSON)       // ** as per the Swagger output
                .body(payload).log().all()
                .post(booking_post_url)
                .then().log().all()
                .extract()
                .response();

                return resp;
    }

    public static Response getBooking(int num)
    {
        Response resp = RestAssured
                    .given()

                .when()
                .get(booking_get_url +num)
                .then().log().all()
                .extract()
                .response();

        return resp;
    }

    public static Response UpdateBooking(Booking payload, int num)
    {
        System.out.println(token);
        System.out.println(booking_update_url + num);

        Response resp = RestAssured
                .given()
                .cookie("token", token)  // VERY IMP*** Cookies: token=53c18bfc50e0235
                .contentType(ContentType.JSON)  // ** as per the Swagger output
                .body(payload).log().all()
                .put(booking_update_url + num)
                .then().log().all()
                .extract()
                .response();

        return resp;
    }

    public static Response deleteBooking(int num)
    {
        Response resp = RestAssured
                .given()
                .cookie("token", token)   // VERY IMP*** Cookies: token=53c18bfc50e0235
                .contentType(ContentType.JSON)  // ** as per the Swagger output
                .when()
                .delete(booking_delete_url + num)
                .then()
                .extract()
                .response();

        return resp;
    }



}

