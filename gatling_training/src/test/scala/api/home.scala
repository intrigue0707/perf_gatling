package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._


object home {
 def shopHome(): ChainBuilder = {
  exec(
    http("shop")
      .get("/")
   )
 }
}
