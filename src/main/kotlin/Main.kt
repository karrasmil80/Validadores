package org.example

import org.example.exceptions.DniExceptions
import org.example.models.Dni
import org.example.validators.DniValidator
import java.time.LocalDate

fun main() {

    // Prueba con Dni válido
    val dni = Dni (
        código = "12345678A",
        nombre = "Pepe",
        apellido = "Martínez",
        fechaEmisión = LocalDate.now(),
        fechaNacimiento = LocalDate.of(1970, 1, 1),
        fechaCaducidad = LocalDate.now(),
        sexo = Dni.Tipo.MASCULINO,
        nacionalidad = "España"
    )

    // validador de Dni
    val validator = DniValidator()

    // Validador de código
    try {
        validator.validateCodigo(dni.código)
        println("Código DNI: correcta")
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    // Validador de nombre
    try {
        validator.validateNombre(dni.nombre)
        println("Casilla nombre: correcta")
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    // Validador de apellido
    try {
        validator.validateApellido(dni.apellido)
        println("Casilla apellido: correcta")
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    // Validador de fecha de emision
    try {
        validator.validateFechaEmision(dni.fechaEmisión)
        println("Casilla fecha emisión : correcta")
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    // Validador de fecha de nacimiento
    try {
        validator.validateFechaNacimiento(dni.fechaNacimiento)
        println("Casilla fecha nacimiento: correcta")
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

     // validador de fecha de caducidad
     try {
         validator.validateFechaCaducidad(dni.fechaCaducidad)
         println("Casilla fecha caducidad: correcta")
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    // Validador de nacionalidad
    try {
        validator.validateNacionalidad(dni.nacionalidad)
        println("Casilla nacionalidad: correcta")
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

}

