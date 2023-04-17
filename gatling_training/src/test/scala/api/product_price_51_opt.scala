package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_51_opt {
  def productPrice51Opt() : ChainBuilder = {
    exec(
      http("Product_51_price")
        .options("/api/v1/product/51/price/")
    )
  }
}
