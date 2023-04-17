package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object shipping {
 def shipping(): ChainBuilder =
   exec(
     http("Shipping")
       .get("/api/v1/shipping/country?store=DEFAULT&lang=en")
   )
}
