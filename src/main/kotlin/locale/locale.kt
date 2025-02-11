package org.example.locale

import java.text.NumberFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

private val myLocale = Locale("es", "ES")

fun LocalDate.toLocalDate(): String {
    return this.format(
        DateTimeFormatter
            .ofLocalizedDate(FormatStyle.SHORT).withLocale(myLocale)
    )
}

fun Double.toLocalMoney(): String {
    return NumberFormat.getCurrencyInstance(myLocale).format(this)
}