package models

class ClasseNormal {

        // Atributos
        private var nom: String
        private var salari: Double

        // Constructores
        constructor(pNom:String, pSalari:Double) {
            this.nom = pNom
            this.salari = pSalari
        }

        // Getters
        fun getNom():String {
            return nom
        }
        // Setters
        fun setNom(pNom:String) {
            this.nom = pNom
        }

        // Función que sobrescribe la descripción por defecto de la clase
        override fun toString(): String {
            return "CONDUCTOR\n" +
                    "Nom: ${this.nom}\n" +
                    "Salari: ${this.salari}"
        }
    }
