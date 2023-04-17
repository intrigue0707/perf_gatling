package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object products_group_opt {

def products() : ChainBuilder = {
  exec(
    http("Products")
      .options("/api/v1/products/group/FEATURED_ITEM?store=&lang=en")
  )
}
}
