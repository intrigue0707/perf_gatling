package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_52 {
  def productPrice52() : ChainBuilder = {
    exec(
      http("Product_52_price")
        .post("/api/v1/product/52/price/")
        .header("Content-Type", "application/json")
        .body(StringBody(body_options)).asJson
    )
  }
}
