package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_with_product_store {
 def cartWithProductStore(): ChainBuilder =
   exec(
     http("Cart_with_product_store")
       .put("/api/v1/cart/$cart_id?store=DEFAULT")
       .body(StringBody(body_cart_with_product_store)).asJson)
}
