package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_1_review_opt {
  def product1ReviewOpt() : ChainBuilder = {
    exec(
      http("Review_product_1")
        .options("/api/v1/products/1/reviews?store=DEFAULT")
    )
  }
}
