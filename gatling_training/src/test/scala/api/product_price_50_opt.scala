package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_50_opt {
 def productPrice50Opt() : ChainBuilder = {
   exec(
     http("Product_50_price")
       .options("/api/v1/product/50/price/")
   )
 }
}
