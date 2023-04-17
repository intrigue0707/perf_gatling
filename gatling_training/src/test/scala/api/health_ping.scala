package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._


object health_ping {
  def healthPing(): ChainBuilder = {
    exec(
      http("Health")
        .get("/actuator/health/ping")
      )
}}
