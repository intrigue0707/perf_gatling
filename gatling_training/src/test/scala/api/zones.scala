package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object zones {
 def zones(): ChainBuilder =
   exec(
     http("Zone")
       .get("/api/v1/zones/?code=")
   )
}
