package models

class ClasseFilla: Superclasse /*classe d'on ve*/ {

    // Atributos
    private var ruta: String = "A"

    // Constructor
    constructor(
        pId: Int,
        pConductor: ClasseNormal,
        pPreuBase: Double,
        pRuta: String = "A"
    ) : super(/*atributs del pare */) {

        //definir en el constructor l'atribut
        this.ruta = pRuta
    }

    /*
    * si ve d'una interface, override a totes les funcions
    *     override fun nextId(): Int {
       return  0
    }

    override fun message():String {
        return "Si us plau, apropi la seva tarja"
    }*/

    // Métodos

    // Getters

    // Setters

    /*
    override fun toString() {

 */
}