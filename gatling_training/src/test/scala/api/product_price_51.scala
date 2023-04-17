package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_51 {
  def productPrice51() : ChainBuilder = {
    exec(
      http("Product_51_price")
        .post("/api/v1/product/51/price/")
        .header("Content-Type", "application/json")
        .body(StringBody(body_options)).asJson
    )
  }
}
