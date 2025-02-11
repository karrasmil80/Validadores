package org.example.validators
import org.example.exceptions.DniExceptions
import org.example.models.Dni
import java.time.LocalDate

class DniValidator {

    fun validate(dni: Dni) {

        // Dni, 8 números 1 letra
        val regex = "^[0-9]{8}[A-Za-z]$".toRegex()
        if(!regex.matches(dni.código)) {
            DniExceptions.ValidationException("El formato del Dni es incorrecto")
        }

        // Nombre, no puede estar vacío
        if (dni.nombre.isBlank()) {
            DniExceptions.ValidationException("El nombre no puede estar en blanco")
        }

        // Apellido, no puede estar vacío
        if (dni.apellido.isBlank()) {
            DniExceptions.ValidationException("El apellido no puede estar en blanco")
        }

        // Sexo, no puede estar vacío
        if (Dni.Tipo.values().isEmpty()) {
            DniExceptions.ValidationException("El tipo no puede estar en blanco")
        }

        // Fecha emisión, no puede ser superior a la actual
        if (dni.fechaEmisión > LocalDate.now()) {
            DniExceptions.ValidationException("La fecha de emisión no puede ser mayor a la actual")
        }

        // Fecha emisión, no puede estar vacía
        if (dni.fechaEmisión.toString().isBlank())
            DniExceptions.ValidationException("La fecha de emisión no puede estar en blanco")

        // Fecha de nacimiento, no puede ser superior a la actual
        if (dni.fechaNacimiento > LocalDate.now()) {
            DniExceptions.ValidationException("La fecha de nacimiento no puede ser mayor a la actual")
        }

        // Fecha de nacimiento, no puede estar vacía
        if (dni.fechaNacimiento.toString().isBlank()) {
            DniExceptions.ValidationException("La fecha de nacimiento no puede estar en blanco")
        }

        // Fecha de caducidad, no puede estar vacía
        if (dni.fechaCaducidad.toString().isBlank())
            DniExceptions.ValidationException("La fecha de caducidad no puede estar en blanco")

        // Fecha de caducidad, no puede ser superior a la actual
        if (dni.fechaCaducidad > LocalDate.now() ) {
            DniExceptions.ValidationException("La fecha de caducidad no puede ser mayor a la actual")
        }

        // Nacionalidad, no puede estar vacía
        if (dni.nacionalidad.isBlank()) {
            DniExceptions.ValidationException("La nacionalidad no puede estar en blanco")
        }
    }

}