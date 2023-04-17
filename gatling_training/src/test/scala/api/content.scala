package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object content {
  def content() : ChainBuilder = {
exec(
  http("Content")
    .get("/api/v1/content/boxes/headerMessage/?lang=en")
    .check(status.is(404)))
}}