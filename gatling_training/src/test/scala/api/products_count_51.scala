package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object products_count_51 {
def productsCount51() : ChainBuilder ={
  exec (
    http("Products_count")
      .get("/api/v1/products/?&store=DEFAULT&lang=en&page=0&count=15&category=51")
  )
}
}
