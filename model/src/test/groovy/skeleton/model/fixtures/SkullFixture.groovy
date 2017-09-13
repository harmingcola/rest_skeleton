package skeleton.model.fixtures

import skeleton.model.builder.SkullBuilder


class SkullFixture {

    static def aDefaultSkull = {
        return SkullBuilder.fromNew()
                .teeth(32)
                .eyes(2)
                .fractures(0)
    }
}
