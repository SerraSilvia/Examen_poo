package controllers

fun main() {

}

/*

fun mostrarMenu() {
    val str = """
        |################################
        |#           MENÚ               #
        |# 1. Lectura amb emprempta     #
        |# 2. Lectura amb targeta       #
        |# 3. Lectura amb codi personal #
        |# 0. Sortir                    #
        |################################
        """.trimMargin()
    println(str)
}


fun main() {
    val idSet = mutableSetOf<Int>()
    var llistatDeBars: MutableList<Bar> = mutableListOf()
    var llistatDeBarsAmbTerrassa: MutableList<BarTerrace> = mutableListOf()


    var reader : GymControlReader
    do {
        mostrarMenu()
        print("Introdueix la opció a realitzar: ")

        val opcMenu: Int  = readln().toInt()

        when (opcMenu) {
            1 -> {
                reader = GymControlFingerReader()
                println(reader.message())

            }

            2 -> {
                reader = GymControlCardReader()
                println(reader.message())

            }

            3 -> {
                reader = GymControlManualReader()

                repeat(8) {
                    println(reader.message())
                    val idClient = readln().toInt()

                    if (idSet.contains(idClient)) {
                        println("$idClient $GREEN Sortida $RESET")
                        idSet.remove(idClient)
                    } else {
                        println(" $idClient $ORANGE Entrada $RESET")
                        idSet.add(idClient)
                    }
                }
            }

            0 -> println("Fi de programa")
            else -> println("Opció incorrecta!")
        }

    } while (opcMenu != 0)
}



*/