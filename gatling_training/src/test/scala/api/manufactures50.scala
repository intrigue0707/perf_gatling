package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object manufactures50 {
 def manufactures50() : ChainBuilder = {
   exec(
     http("Manufactures")
       .get("/api/v1/category/50/manufacturers/?store=DEFAULT&lang=en")
   )
 }
}
