package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_id_opt {
def product_id_Opt() : ChainBuilder ={
  exec (
    http("Product_id")
      .options(s"/api/v1/products/$random_id?lang=en&store=DEFAULT")
  )
}
}
