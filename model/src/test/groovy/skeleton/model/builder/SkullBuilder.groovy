package skeleton.model.builder

import skeleton.model.Skull


class SkullBuilder {

    private Skull skull

    private SkullBuilder(Skull skull) {
        this.skull = skull
    }

    static SkullBuilder fromNew() {
        SkullBuilder builder = new SkullBuilder(new Skull())
        return builder
    }

    def teeth = { Integer numberOfTeeth ->
        this.skull.setNumberOfTeeth(numberOfTeeth)
        return this
    }

    def eyes = { Integer numberOfEyes ->
        this.skull.setNumberOfEyes(numberOfEyes)
        return this
    }

    def fractures = { Integer numberOfFractures ->
        this.skull.setNumberOfFractures(numberOfFractures)
        return this
    }

    def build = {
        return skull
    }
}
