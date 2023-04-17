package api



import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._


object cart_shipping {

 def cartShipping(): ChainBuilder =
   exec(
     http("Cart_with_product_shipping")
       .post("/api/v1/cart/${cart_id}/shipping")
       .body(StringBody(body_shipping)).asJson
       .check(status.is(503))
   )
}
