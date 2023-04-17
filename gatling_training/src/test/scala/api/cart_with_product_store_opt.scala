package api

import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_with_product_store_opt {
 def cartWithProductStoreOpt(): ChainBuilder =
   exec(
     http("Cart_with_product_store")
     .options("/api/v1/cart/$cart_id?store=DEFAULT")
     )
}
