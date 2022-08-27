import entities.MusicalInstrument
import factories.DrumsFactory
import factories.GuitarFactory

fun main(args: Array<String>) {
    val guitar: MusicalInstrument
    val drums: MusicalInstrument

    val guitarFactory = GuitarFactory()
    val drumsFactory = DrumsFactory()

    guitar = guitarFactory.createInstrument()
    drums = drumsFactory.createInstrument()

    println(guitar.play())
    println(drums.play())
}