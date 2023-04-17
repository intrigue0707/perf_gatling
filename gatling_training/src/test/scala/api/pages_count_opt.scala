package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object pages_count_opt {
  def pagesCountOpt() : ChainBuilder = {
    exec(
      http("Pages_count")
        .options("/api/v1/content/pages/?page=0&count=20&store=&lang=en")
        )
  }
}
