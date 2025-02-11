package org.example.models

import java.time.LocalDate

class Dni (

    var código: String,
    var nombre : String,
    var apellido : String,
    var fechaEmisión : LocalDate,
    var fechaNacimiento : LocalDate,
    var fechaCaducidad : LocalDate,
    var sexo : Tipo,
    var nacionalidad : String,

    ) {

    enum class Tipo {
        MASCULINO, FEMENINO
    }
}