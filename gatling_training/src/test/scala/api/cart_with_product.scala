package api

import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._


object cart_with_product {

  def cartWithProduct(): ChainBuilder = {
    exec(http("Cart_with_product")
      .get("/api/v1/cart/$cart_id?lang=en")
    )
  }
}
