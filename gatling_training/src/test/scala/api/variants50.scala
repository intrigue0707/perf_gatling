package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object variants50 {
 def variants50() : ChainBuilder = {
   exec(
     http("Variants")
       .get("/api/v1/category/50/variants/?store=DEFAULT&lang=en")
       .check(status.is(404))
   )
 }
}
