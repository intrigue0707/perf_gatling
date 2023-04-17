package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_1_review {
  def product1Review() : ChainBuilder = {
    exec(
      http("Review_product_1")
        .get("/api/v1/products/1/reviews?store=DEFAULT")
    )
  }
}
