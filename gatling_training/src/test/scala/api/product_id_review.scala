package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_id_review {
  def productidReview() : ChainBuilder = {
    exec(
      http("Review_product_id")
        .get(s"/api/v1/products/$random_id/reviews?store=DEFAULT")
    )
  }
}
