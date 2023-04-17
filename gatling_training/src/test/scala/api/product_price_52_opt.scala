package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_52_opt {
  def productPrice52Opt() : ChainBuilder = {
    exec(
      http("Product_52_price")
        .options("/api/v1/product/52/price/")
    )
  }
}
