package api

import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_shipping_opt {
 def cartShippingOpt(): ChainBuilder =
   exec(
     http("Cart_shipping")
       .options("/api/v1/cart/${cart_id}/shipping")
   )
}
