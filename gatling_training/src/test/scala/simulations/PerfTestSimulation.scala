package simulations

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import scenarios.Shophizer.scnShophizer
 //mvn gatling:test
//mnv gatling: test -DShopUsers=100

class PerfTestSimulation extends Simulation {
 setUp(
   scnShophizer.inject(rampUsers(System.getProperty("ShopUsers", "100").toInt).during(60))
 ).protocols(httpProtocol)
}
