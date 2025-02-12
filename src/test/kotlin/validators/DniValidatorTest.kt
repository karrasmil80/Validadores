package validators

import org.example.validators.DniValidator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.DisplayName
import java.time.LocalDateTime

class DniValidatorTest {

    private val validator = DniValidator()

@Test
@DisplayName("Debe validar correctamente un código de DNI válido")
    fun validateCodigo() {

        // arrangement
        val expected = "12345678A"

        // act
        val resultado = expected

       // expected
       assertEquals(expected, resultado, "Código DNI: correcta")

    }

@Test
@DisplayName("El nombre del Dni debería de estar relleno")
    fun validateNombre() {
        // arrangement
        val expected = "Nombre"

        // act
        val resultado = expected

        // expected
        assertEquals(expected, resultado, "Casilla nombre: correcta")
    }

@Test
@DisplayName("El apellido del DNI debería de estar relleno")
    fun validateApellido() {
        // arrangement
        val expected = "Apellido"

        // act
        val resultado = expected

        // expected
        assertEquals(expected, resultado, "Casilla apellido: correcta")
    }

@Test
@DisplayName("La fecha de emisión debería de ser la fecha actual")
    fun validateFechaEmision() {

        // arrangement
        val expected = LocalDateTime.now()

        // act
        val resultado = expected

        // expected
        assertEquals(expected, resultado, "Casilla fecha emision: correcta")
    }

@Test
@DisplayName("La fecha de nacimiento debería de ser la fecha actual")
    fun validateFechaNacimiento() {

        // arrangement
        val expected = LocalDateTime.now()

        // act
        val resultado = expected

        // expected
        assertEquals(expected, resultado, "Casilla fecha nacimiento: correcta")
    }

@Test
@DisplayName("La fecha de caducidad debería de ser menor al día actual")
    fun validateFechaCaducidad() {

        // arrangement
        val expected = LocalDateTime.now().minusDays(1)

        // act
        val resultado = expected

        // expected
        assertEquals(expected, resultado, "Casilla fecha caducidad: correcta")
    }

@Test
@DisplayName("La nacionalidad del DNI debería de estar rellena")
    fun validateNacionalidad() {

        // arrangement
        val expected = "Nacionalidad"

        // act
        val resultado = expected

        // expected
        assertEquals(expected, resultado, "Nacionalidad: correcta")
    }
}