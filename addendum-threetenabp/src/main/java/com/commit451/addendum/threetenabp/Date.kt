package com.commit451.addendum.threetenabp

import org.threeten.bp.Instant
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import java.util.*

inline fun Date.toLocalDate(): LocalDate {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.toLocalDate()
}

inline fun Date.toLocalDateTime(): LocalDateTime {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.toLocalDateTime()
}

inline fun Date.toInstant(): Instant {
    return Instant.ofEpochMilli(this.time)
}