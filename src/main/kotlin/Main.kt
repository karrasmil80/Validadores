package org.example

import org.example.models.Dni
import java.time.LocalDate

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

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

    if (dni.validate)
}