package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_1 {
  def productPrice1() : ChainBuilder = {
    exec(
      http("Product_1_price")
        .post("/api/v1/product/1/price/")
        .header("Content-Type", "application/json")
        .body(StringBody(body_options)).asJson
    )
  }
}
