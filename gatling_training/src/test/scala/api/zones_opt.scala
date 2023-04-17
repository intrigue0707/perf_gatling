package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object zones_opt {
 def zonesOpt(): ChainBuilder =
   exec(
     http("Zones")
       .options("/api/v1/zones/?code=")
   )
}
