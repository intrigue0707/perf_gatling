package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object manufactures_50_opt {
 def manufactures50Opt() : ChainBuilder = {
   exec(
     http("Manufactures")
       .options("/api/v1/category/50/manufacturers/?store=DEFAULT&lang=en")
   )
 }
}
