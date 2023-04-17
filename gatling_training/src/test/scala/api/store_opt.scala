package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object store_opt {

  def storeOpt() : ChainBuilder ={
    exec (
      http("Store")
        .options("/api/v1/store/DEFAULT")
    )
  }

}
