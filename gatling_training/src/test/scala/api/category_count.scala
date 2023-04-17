package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object category_count {
 def categoryCount(): ChainBuilder ={
   exec(
     http("Category_count")
       .get("/api/v1/category/?count=20&page=0&store=&lang=en")
   )
 }
}
