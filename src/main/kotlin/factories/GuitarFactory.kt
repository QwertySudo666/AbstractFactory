package factories

import entities.Guitar
import entities.MusicalInstrument

class GuitarFactory : MusicalInstrumentsFactory {
    override fun createInstrument(): MusicalInstrument {
        return Guitar()
    }
}