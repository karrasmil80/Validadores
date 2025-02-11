package org.example.validators
import org.example.models.Dni
import java.time.LocalDate

class DniValidator {

    fun validate(dni: Dni): Boolean {

        // Dni, 8 números 1 letra
        val regex = "^[0-9]{8}[A-Za-z]$".toRegex()
        if(!regex.matches(Dni)) {
            println("Dni inválido")
        }

        // Nombre, no puede estar vacío
        if (dni.nombre.isBlank()) {
            println("El nombre no puede estar en blanco")
        }

        // Apellido, no puede estar vacío
        if (dni.apellido.isBlank()) {
            println("El apellido no puede estar en blanco")
        }

        // Sexo, no puede estar vacío
        if (Dni.Tipo.values().isEmpty()) {
            println("El sexo no puede estar vacío")
        }

        // Fecha emisión, no puede ser superior a la actual
        if (dni.fechaEmisión > LocalDate.now()) {
            println("La fecha de emisión no puede ser mayor a la fecha actual")
        }

        // Fecha emisión, no puede estar vacía
        if (dni.fechaEmisión.toString().isBlank())
            println("")

        // Fecha de nacimiento, no puede ser superior a la actual
        if (dni.fechaNacimiento > LocalDate.now()) {
            println("")
        }

        // Fecha de nacimiento, no puede estar vacía
        if (dni.fechaNacimiento.toString().isBlank()) {
            println("")
        }

        // Fecha de caducidad, no puede estar vacía
        if (dni.fechaCaducidad.toString().isBlank())
            println("")

        // Fecha de caducidad, no puede ser superior a la actual
        if (dni.fechaCaducidad > LocalDate.now() ) {
            println("")
        }

        // Nacionalidad, no puede estar vacía
        if (dni.nacionalidad.isBlank()) {
            println("")
        }

    }

}