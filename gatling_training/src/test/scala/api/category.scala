package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object category {
 def category(): ChainBuilder ={
   exec(
     http("Category")
       .get("/api/v1/category/50?store=DEFAULT&lang=en")
   )
 }
}
