package org.example.validators

interface Validador<T> {
    fun validate(entity: T)
}