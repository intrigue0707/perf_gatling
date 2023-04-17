package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object variants_opt_51 {
 def variantsOpt51() : ChainBuilder =
   exec(
     http("Variants")
       .options("/api/v1/category/51/variants/?store=DEFAULT&lang=en")
   )
}
