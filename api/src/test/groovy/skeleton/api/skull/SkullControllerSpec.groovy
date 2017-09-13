package skeleton.api.skull

import skeleton.model.fixtures.SkullFixture
import skeleton.service.SkullService
import spock.lang.Shared
import spock.lang.Specification



class SkullControllerSpec extends Specification {

    @Shared
    SkullController controller = new SkullController()

    SkullService skullService = Mock(SkullService)

    def setup() {
        controller.skullService = skullService
    }

    def "a call to read should be forwarded to the service" () {
        when:
            controller.read(5)
        then:
            1 * skullService.read(5) >> SkullFixture.aDefaultSkull().build()
    }
}