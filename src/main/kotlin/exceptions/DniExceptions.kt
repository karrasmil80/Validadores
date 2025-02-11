package org.example.exceptions

sealed class DniExceptions(mensaje: String) : Exception(mensaje) {
    class ValidationException(mensaje: String) : DniExceptions(mensaje)
}