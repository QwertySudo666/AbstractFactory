package factories

import entities.MusicalInstrument

interface MusicalInstrumentsFactory {
    fun createInstrument(): MusicalInstrument
}