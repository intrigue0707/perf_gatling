package helpers

import api.products_id.chair_sku
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

import scala.util.Random


object BaseHelpers {

  val httpProtocol = http
    .baseUrl("http://localhost:8080")
    .inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/111.0")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_2 = Map(
    "Access-Control-Request-Headers" -> "authorization",
    "Access-Control-Request-Method" -> "GET",
    "Origin" -> "http://localhost")

  val headers_3 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Origin" -> "http://localhost",
    "authorization" -> "")

  val headers_12 = Map(
    "Access-Control-Request-Headers" -> "authorization,content-type",
    "Access-Control-Request-Method" -> "POST",
    "Origin" -> "http://localhost")

  val headers_20 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Content-Type" -> "application/json",
    "Origin" -> "http://localhost",
    "authorization" -> "")

  val headers_110 = Map(
    "Access-Control-Request-Headers" -> "authorization,content-type",
    "Access-Control-Request-Method" -> "PUT",
    "Origin" -> "http://localhost")

  def thinkTimer(Min: Int = 2, Max: Int = 5): ChainBuilder = {
    pause(Min, Max)
  }

  val body_cart = "{\"attributes\":[],\"product\":\"table1\",\"quantity\":1}"
  val body_shipping = "{}"
  val body_cart_with_product_store = s"{\"attributes\":[],\"product\":\"$chair_sku\",\"quantity\":1}"
  val body_options = "{\"options\":[]}"

//  val products_post = exec(
//    api.product_price_50.productPrice50(),
//    api.product_price_51.productPrice51(),
//    api.product_price_1.productPrice1(),
//    api.product_price_52.productPrice52(),
//    api.product_price_50.productPrice50(),
//    api.product_price_51.productPrice51(),
//    api.product_price_1.productPrice1(),
//    api.product_price_52.productPrice52()
//  )

//  def service_requests() = ???
//
//
//    api.health.pingHealth(),
//    api.health_opt.pingHealthOptions(),
//    api.content_opt.contentOpt(),
//    api.content.content(),
//    api.category_count_opt.categoryCountOpt(),
//    api.store_opt.storeOpt(),
//    api.store.store(),
//    api.category_count.categoryCount()
//  )
//  val products_cart = exec(
//    api.cart_with_product_store_opt.cartWithProductStoreOpt(),
//    api.cart_with_product_store.cartWithProductStore(),
//    api.cart_with_product_opt.cartWithProductOpt(),
//    api.cart_with_product.cartWithProduct()
//  )

  val productIds = List(50, 51, 52)
  val random_id = productIds(Random.nextInt(productIds.size))

}