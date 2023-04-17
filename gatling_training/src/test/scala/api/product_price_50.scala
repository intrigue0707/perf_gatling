package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_50 {
  def productPrice50(id:String = "1"): ChainBuilder = {
    exec(
      http(s"Product_"+id+"_price")
        //scala variable
        .post(s"/api/v1/product/$id/price/")
        .header("Content-Type", "application/json")
        .body(StringBody(body_options)).asJson)
  }
}
