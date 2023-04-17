package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object products_group {

  def productGroup() : ChainBuilder = {
    exec(
      http("Products_group")
        .get("/api/v1/products/group/FEATURED_ITEM?store=&lang=en")
    )
  }
}
