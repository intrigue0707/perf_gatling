package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_opt {
 def cartOpt(): ChainBuilder = {
   exec(
     http("Cart")
       .options("/api/v1/cart/?store=DEFAULT")
       )
 }
}
