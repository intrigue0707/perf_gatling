package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object category_51_opt {
 def category51Opt(): ChainBuilder ={
   exec(
     http("Category_51")
       .options("/api/v1/category/51?store=DEFAULT&lang=en")
   )
 }
}
