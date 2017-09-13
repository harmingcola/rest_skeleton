package skeleton.performance

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class HealthCheckSimulation extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:9004")

  val scn = scenario("HealthCheckSimulation")
    .exec(
      http("Healthcheck endpoint")
      .get("/healthcheck")
        .check(status.is(200))
          .check(jsonPath("$.status").is("healthy"))
    )
    .pause(5)

    setUp(
    scn.inject(atOnceUsers(50))
  )
  .protocols(httpConf)
  .assertions(global.successfulRequests.percent.gte(100))
}
