package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_id_opt {
  def productPriceIdOpt() : ChainBuilder = {
    exec(
      http("Product_id_price")
        .options(s"/api/v1/product/$random_id/price/")
    )
  }
}
