package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object content_pages_count_opt {
 def contentPagesCountOpt() : ChainBuilder= {
   exec(
     http("Content_pages_count")
       .options("/api/v1/content/pages/?page=0&count=20&store=DEFAULT&lang=en")
   )
 }
}
