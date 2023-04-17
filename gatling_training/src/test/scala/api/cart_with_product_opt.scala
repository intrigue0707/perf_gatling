package api

import api.cart._
import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_with_product_opt {
 def cartWithProductOpt(): ChainBuilder =
   exec(
     http("Cart_with_product")
       .options(s"/api/v1/cart/${cart_id}?lang=en")
   )
}
