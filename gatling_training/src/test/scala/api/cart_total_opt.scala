package api

import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_total_opt {

 def cartTotalOpt(): ChainBuilder =
   exec(
     http("Cart_with_product_total")
       .options("/api/v1/cart/${cart_id}/total/")
)
}
