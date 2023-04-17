package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object products_id {
  val chair_sku= ""
def productsId() : ChainBuilder ={
  exec (
    http("Products_id")
      .get(s"/api/v1/products/$random_id?lang=en&store=DEFAULT")
      .check(jsonPath("$.sku").findAll.saveAs("chair_sku"))
  )

}
}
