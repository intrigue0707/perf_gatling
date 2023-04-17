package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_1_opt {
  def productPrice1Opt() : ChainBuilder = {
    exec(
      http("Product_1_price")
        .options("/api/v1/product/1/price/")
    )
  }
}
