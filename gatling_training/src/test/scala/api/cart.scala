package api

import helpers.BaseHelpers._
import io.gatling.core.Predef.{jsonPath, _}
import io.gatling.core.structure._
import io.gatling.http.Predef._


object cart {
  //val cart_id: ChainBuilder = cart()

 def cart(): ChainBuilder =
   exec(
     http("Cart")
       .post("/api/v1/cart/?store=DEFAULT")
       .body(StringBody(body_cart)).asJson
       .check(jsonPath("$.code").saveAs("cart_id"))
   )
}

