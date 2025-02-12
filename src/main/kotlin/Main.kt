package org.example

import org.example.exceptions.DniExceptions
import org.example.models.Dni
import org.example.validators.DniValidator
import java.time.LocalDate

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Prueba con Dni válido
    val dni = Dni (
        código = "12345678A",
        nombre = "Pepe",
        apellido = "Martínez",
        fechaEmisión = LocalDate.now(),
        fechaNacimiento = LocalDate.of(1970, 1, 1),
        fechaCaducidad = LocalDate.now().plusYears(20),
        sexo = Dni.Tipo.MASCULINO,
        nacionalidad = "España"
    )

    val validator = DniValidator()

    try {
        validator.validateCodigo(dni.código)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateNombre(dni.nombre)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateApellido(dni.apellido)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateFechaEmision(dni.fechaEmisión)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateFechaNacimiento(dni.fechaNacimiento)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    /* try {
        validator.validateFechaCaducidad(dni.fechaCaducidad)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

     */

    try {
        validator.validateNacionalidad(dni.nacionalidad)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    // Dni inválido
    val dniInválido = Dni (
        código = "12345678ABC",
        nombre = "Pepe",
        apellido = "Martínez",
        fechaEmisión = LocalDate.now(),
        fechaNacimiento = LocalDate.of(3054, 1, 1),
        fechaCaducidad = LocalDate.now().plusYears(20),
        sexo = Dni.Tipo.MASCULINO,
        nacionalidad = "España"
    )

    try {
        validator.validateCodigo(dni.código)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateNombre(dni.nombre)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateApellido(dni.apellido)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateFechaEmision(dni.fechaEmisión)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateFechaNacimiento(dni.fechaNacimiento)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateFechaCaducidad(dni.fechaCaducidad)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }

    try {
        validator.validateNacionalidad(dni.nacionalidad)
    } catch (e: DniExceptions.ValidationException) {
        println(e.message)
    }
}