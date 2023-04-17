package api

import api.cart.cart_id
import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_shipping_opt {
//  val cart_id = ""
 def cartShippingOpt(): ChainBuilder =
   exec(
     http("Cart_shipping")
       .options(s"/api/v1/cart/${cart_id}/shipping")
   )
}
