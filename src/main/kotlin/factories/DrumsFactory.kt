package factories

import entities.Drums
import entities.MusicalInstrument

class DrumsFactory : MusicalInstrumentsFactory {
    override fun createInstrument(): MusicalInstrument {
        return Drums()
    }
}