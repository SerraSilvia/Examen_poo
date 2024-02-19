
package org.example.Utilities
import java.util.Scanner

fun llegirInt(pMessage: String, intMin: Int, intMax: Int): Int {
    val scan = Scanner(System.`in`)
    var valorInt = 0
    var valorCorrecto: Boolean
    do {
        print(pMessage)
        valorCorrecto = scan.hasNextInt()
        if (!valorCorrecto) {
            print("${RED}ERROR: introdueix un nombre enter\n$RESET")
        } else {
            valorInt = scan.nextInt()
            if (valorInt < intMin || valorInt > intMax) {
                valorCorrecto = false
                print("${RED}ERROR: introdueix un nombre entre els valors requerits\n$RESET")
            }
        }
        scan.nextLine()
    } while (!valorCorrecto)
    return valorInt
}

fun llegirString(pMessage: String): String {
    val scan = Scanner(System.`in`)
    var valorString = ""
    var valorCorrecto: Boolean
    do {
        print(pMessage)
        valorCorrecto = scan.hasNext()
        if (!valorCorrecto) {
            print("${RED}ERROR: introdueix una paraula" +
                    "\nOpció: $RESET")
        } else {
            valorString = scan.next()
        }
        scan.nextLine()
    } while (!valorCorrecto)
    return valorString
}

fun llegirStringUrbaOInterUrba(pMessage: String): String {
    val scan = Scanner(System.`in`)
    var valorString = ""
    var valorCorrecto: Boolean
    do {
        print(pMessage)
        valorCorrecto = scan.hasNext()
        if (!valorCorrecto) {
            print("${RED}ERROR: introdueix una paraula" +
                    "\nOpció: $RESET")
        } else {
            do {
                valorString = scan.next()
                if (valorString != "urbà" && valorString != "interurbà") {
                    !valorCorrecto
                    print("${RED}ERROR: el tipus d'autobús és invàlid $RESET"  +
                            "\nTorna a inserir el tipus d'autobús: ")
                }
            } while (valorString != "urbà" && valorString != "interurbà")
        }
        scan.nextLine()
    } while (!valorCorrecto)
    return valorString
}

fun llegirDouble(pMessage: String, doubleMin: Double, doubleMax: Double): Double {
    val scan = Scanner(System.`in`)
    var valorDouble = 0.0
    var valorCorrecto: Boolean
    do {
        print(pMessage)
        valorCorrecto = scan.hasNextDouble()
        if (!valorCorrecto) {
            print("${RED}ERROR: introdueix un nombre enter\n$RESET")
        } else {
            valorDouble = scan.nextDouble()
            if (valorDouble < doubleMin || valorDouble > doubleMax) {
                valorCorrecto = false
                print("${RED}ERROR: introdueix un nombre entre els valors requerits\n$RESET")
            }
        }
        scan.nextLine()
    } while (!valorCorrecto)
    return valorDouble
}