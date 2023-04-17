package scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._

object Shophizer {
  def scnShophizer: ScenarioBuilder = {
    scenario("Shophizer")
      .exec(flushHttpCache)
      .exec(flushCookieJar)

    .group("Home page") {
      exec(api.home.shopHome(),
        api.health.pingHealth(),
        api.health_opt.pingHealthOptions(),
        api.content_opt.contentOpt(),
        api.content.content(),
        api.category_count_opt.categoryCountOpt(),
        api.store_opt.storeOpt(),
        api.store.store(),
        api.category_count.categoryCount(),
        api.products_group_opt.products(),
        api.products_group.productGroup(),
        api.pages_count_opt.pagesCountOpt(),
        api.pages_count.pagesCount(),
        api.category_count_opt.categoryCountOpt(),
        api.product_price_50_opt.productPrice50Opt(),
        api.product_price_50_opt.productPrice50Opt(),
        api.product_price_51_opt.productPrice51Opt(),
        api.product_price_1_opt.productPrice1Opt(),
        api.product_price_52_opt.productPrice52Opt(),
        api.product_price_50.productPrice50("1"),
        api.product_price_51.productPrice51(),
        api.product_price_1.productPrice1(),
        api.product_price_52.productPrice52(),
        api.product_price_50.productPrice50(),
        api.product_price_51.productPrice51(),
        api.product_price_1.productPrice1(),
        api.product_price_52.productPrice52())
        .pause(2,5)
    }
      .group("Tables page") {
        exec(api.health.pingHealth(),
          api.health_opt.pingHealthOptions(),
          api.content_opt.contentOpt(),
          api.content.content(),
          api.category_count_opt.categoryCountOpt(),
          api.store_opt.storeOpt(),
          api.store.store(),
          api.category_count.categoryCount(),
          api.products_count_51_opt.productsCountOpt(),
          api.content_pages_count_opt.contentPagesCountOpt(),
          api.pages_count.pagesCount(),
          api.products_count_50.productsCount50(),
          api.product_price_1_opt.productPrice1Opt(),
          api.category.category(),
          api.product_price_1.productPrice1(),
          api.category.category(),
          api.manufactures_50_opt.manufactures50Opt(),
          api.manufactures50.manufactures50(),
          api.variants_opt_50.variantsOpt(),
          api.variants50.variants50())
          .pause(2,5)
      }
      .group("Table view") {
        exec(api.health.pingHealth(),
          api.health_opt.pingHealthOptions(),
          api.content_opt.contentOpt(),
          api.content.content(),
          api.category_count_opt.categoryCountOpt(),
          api.store_opt.storeOpt(),
          api.store.store(),
          api.category_count.categoryCount(),
          api.product_1_opt.product1Opt(),
          api.product_1_review_opt.product1ReviewOpt(),
          api.content_pages_count_opt.contentPagesCountOpt(),
          api.content_pages_count.contentPagesCount(),
          api.product_1_review.product1Review(),
          api.product_1.product1(),
          api.product_price_1_opt.productPrice1Opt(),
          api.product_price_1.productPrice1())
      }.pause(2,5)
      .group("Table adding to cart") {
        exec(
          api.cart_opt.cartOpt(),
          api.cart.cart(),
          api.cart_with_product.cartWithProduct(),
          api.cart_with_product_opt.cartWithProductOpt())
      }.pause(2,5)
      .randomSwitch(
      50.0->exec(
      group("Chairs page") {
        exec(api.health.pingHealth(),
          api.health_opt.pingHealthOptions(),
          api.content_opt.contentOpt(),
          api.content.content(),
          api.category_count_opt.categoryCountOpt(),
          api.store_opt.storeOpt(),
          api.store.store(),
          api.category_count.categoryCount(),
          api.products_count_51_opt.productsCountOpt(),
          api.pages_count_opt.pagesCountOpt(),
          api.products_count_51.productsCount51(),
          api.pages_count.pagesCount(),
          api.product_price_50_opt.productPrice50Opt(),
          api.product_price_51_opt.productPrice51Opt(),
          api.product_price_52_opt.productPrice52Opt(),
          api.category_51_opt.category51Opt(),
          api.product_price_51.productPrice51(),
          api.product_price_50.productPrice50(),
          api.product_price_52.productPrice52(),
          api.category_51.category51(),
          api.manufactures_51_opt.manufactures51Opt(),
          api.manufactures51.manufactures51(),
          api.variants_opt_51.variantsOpt51(),
          api.variants51.variants51())
          .pause(2,5)
      }
      .group("Select random chair") {
        exec(api.health.pingHealth(),
          api.health_opt.pingHealthOptions(),
          api.content_opt.contentOpt(),
          api.content.content(),
          api.category_count_opt.categoryCountOpt(),
          api.store_opt.storeOpt(),
          api.store.store(),
          api.category_count.categoryCount(),
          api.product_id_review_opt.productidReviewOpt(),
          api.product_id_review.productidReview(),
          api.products_id.productsId(),
          api.pages_count_opt.pagesCountOpt(),
          api.pages_count.pagesCount(),
          api.product_price_id_opt.productPriceIdOpt(),
          api.product_price_id.productPriceId())
          .pause(2,5)
      }
      .group("Add random chair to cart") {
        exec(
          api.cart_with_product_store_opt.cartWithProductStoreOpt(),
          api.cart_with_product_store.cartWithProductStore(),
          api.cart_with_product_opt.cartWithProductOpt(),
          api.cart_with_product.cartWithProduct())
          .pause(2,5)
      }),
        30.0-> exec(
      group("View cart") {
        exec(api.health.pingHealth(),
          api.health_opt.pingHealthOptions(),
          api.content_opt.contentOpt(),
          api.content.content(),
          api.category_count_opt.categoryCountOpt(),
          api.store_opt.storeOpt(),
          api.store.store(),
          api.category_count.categoryCount(),
          api.cart_with_product_store_opt.cartWithProductStoreOpt(),
          api.cart_with_product_store.cartWithProductStore(),
          api.cart_with_product_opt.cartWithProductOpt(),
          api.cart_with_product.cartWithProduct(),
          api.content_pages_count_opt.contentPagesCountOpt(),
          api.content_pages_count.contentPagesCount())
          .pause(2,5)
      }
      .group("Checkout") {
        exec(api.health.pingHealth(),
          api.health_opt.pingHealthOptions(),
          api.content_opt.contentOpt(),
          api.content.content(),
          api.category_count_opt.categoryCountOpt(),
          api.store_opt.storeOpt(),
          api.store.store(),
          api.category_count.categoryCount(),
          api.shipping_opt.shippingOpt(),
          api.zones_opt.zonesOpt(),
          api.cart_with_product_store_opt.cartWithProductStoreOpt(),
          api.cart_shipping_opt.cartShippingOpt(),
          api.config_opt.config_opt(),
          api.cart_total_opt.cartTotalOpt(),
          api.cart_total.cartTotal(),
          api.content_pages_count_opt.contentPagesCountOpt(),
          api.content_pages_count.contentPagesCount(),
          api.zones.zones(),
          api.shipping.shipping(),
          api.config.config(),
          api.cart_with_product_store.cartWithProductStore(),
          api.cart_shipping.cartShipping())
      }))
}}
