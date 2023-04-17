package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object content_opt {
  def contentOpt(): ChainBuilder =
    exec(
      http("contentBox")
        .options("/api/v1/content/boxes/headerMessage/?lang=en")
     )
}
