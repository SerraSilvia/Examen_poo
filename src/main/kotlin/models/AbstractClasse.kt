package models

abstract class AbstractClasse {
    // Atributos
    protected var id:Int
    protected var conductor:ClasseNormal
    protected var preuBase: Double

    // Constructor
    constructor(id: Int, conductor: ClasseNormal, pPreuBase: Double) {
        this.id = id
        this.conductor = conductor
        this.preuBase = pPreuBase
    }

    // Métodos
    abstract fun preuFinal():Double
}