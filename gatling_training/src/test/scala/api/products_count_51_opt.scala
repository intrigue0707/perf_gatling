package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object products_count_51_opt {
def productsCountOpt() : ChainBuilder ={
  exec (
    http("Products_count")
      .options("/api/v1/products/?&store=DEFAULT&lang=en&page=0&count=15&category=51")
  )
}
}
