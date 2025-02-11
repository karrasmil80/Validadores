package org.example.models

class Dni (

    var código: String,
    var nombre : String,
    var apellido : String,
    var fechaEmisión : String,
    var fechaNacimiento : String,
    var fechaCaducidad : String,
    var sexo : Tipo,
    var nacionalidad : String,

) {

    enum class Tipo {
        MASCULINO, FEMENINO
    }
}