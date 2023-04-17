package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object category_opt {
 def categoryOpt(): ChainBuilder ={
   exec(
     http("Category")
       .options("/api/v1/category/50?store=DEFAULT&lang=en")
   )
 }
}
