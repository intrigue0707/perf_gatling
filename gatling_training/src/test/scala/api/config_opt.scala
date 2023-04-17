package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object config_opt {
 def config_opt(): ChainBuilder =
   exec(
     http("Config")
       .options("/api/v1/config/")
   )
}
