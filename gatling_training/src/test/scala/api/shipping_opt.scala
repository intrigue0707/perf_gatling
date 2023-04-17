package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object shipping_opt {
 def shippingOpt(): ChainBuilder = {
   exec(
     http("Shipping")
       .options("/api/v1/shipping/country?store=DEFAULT&lang=en")
       )
 }
}
