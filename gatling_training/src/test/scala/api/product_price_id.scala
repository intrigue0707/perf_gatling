package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_id {
  def productPriceId() : ChainBuilder = {
    exec(
      http("Product_id_price")
        .post(s"/api/v1/product/${random_id}/price/")
        .body(StringBody(body_options)).asJson
    )
  }
}
