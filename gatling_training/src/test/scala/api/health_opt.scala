package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object health_opt {
  def pingHealthOptions(): ChainBuilder = {
  exec(http("health_opt")
      .options("/actuator/health/ping"))
  }}
