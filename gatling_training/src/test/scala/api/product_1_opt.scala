package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_1_opt {
  def product1Opt() : ChainBuilder = {
    exec(
      http("Product_1")
        .options("/api/v1/products/1?lang=en&store=DEFAULT")
    )
  }
}
