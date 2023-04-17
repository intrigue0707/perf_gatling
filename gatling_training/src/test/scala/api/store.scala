package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object store {

  def store() : ChainBuilder ={
    exec (
      http("Store")
        .get("/api/v1/store/DEFAULT")
    )
  }

}
