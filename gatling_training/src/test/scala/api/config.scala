package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object config {
 def config(): ChainBuilder =
   exec(
     http("Config")
       .get("/api/v1/config/")
   )
}
