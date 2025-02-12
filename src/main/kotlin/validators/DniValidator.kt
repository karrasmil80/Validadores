package org.example.validators

import org.example.exceptions.DniExceptions
import org.example.models.Dni
import java.time.LocalDate

class DniValidator {

    // Validar código del DNI
    fun validateCodigo(código: String) {
        val regex = "^[0-9]{8}[A-Za-z]$".toRegex()
        if (!regex.matches(código)) {
            throw DniExceptions.ValidationException("El formato del DNI es incorrecto")
        }
    }

    // Validar Nombre
    fun validateNombre(nombre: String) {
        if (nombre.isBlank()) {
            throw DniExceptions.ValidationException("El nombre no puede estar en blanco")
        }
    }

    // Validar apellido
    fun validateApellido(apellido: String) {
        if (apellido.isBlank()) {
            throw DniExceptions.ValidationException("El apellido no puede estar en blanco")
        }
    }

    //Validar fecha de emisión
    fun validateFechaEmision(fechaEmision: LocalDate) {
        if (fechaEmision > LocalDate.now()) {
            throw DniExceptions.ValidationException("La fecha de emisión no puede ser mayor a la actual")
        }
        if (fechaEmision.toString().isBlank()) {
            throw DniExceptions.ValidationException("La fecha de emisión no puede estar en blanco")
        }
    }

    // Validar fecha de nacimiento
    fun validateFechaNacimiento(fechaNacimiento: LocalDate) {
        if (fechaNacimiento > LocalDate.now()) {
            throw DniExceptions.ValidationException("La fecha de nacimiento no puede ser mayor a la actual")
        }
        if (fechaNacimiento.toString().isBlank()) {
            throw DniExceptions.ValidationException("La fecha de nacimiento no puede estar en blanco")
        }
    }

    // Validar fecha de caducidad
    fun validateFechaCaducidad(fechaCaducidad: LocalDate) {
        if (fechaCaducidad.toString().isBlank()) {
            throw DniExceptions.ValidationException("La fecha de caducidad no puede estar en blanco")
        }
        if (fechaCaducidad > LocalDate.now()) {
            throw DniExceptions.ValidationException("La fecha de caducidad no puede ser mayor a la actual")
        }
    }

    // Validar nacionalidad
    fun validateNacionalidad(nacionalidad: String) {
        if (nacionalidad.isBlank()) {
            throw DniExceptions.ValidationException("La nacionalidad no puede estar en blanco")
        }
    }
}
