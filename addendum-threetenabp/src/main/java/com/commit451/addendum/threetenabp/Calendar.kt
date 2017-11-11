package com.commit451.addendum.threetenabp

import org.threeten.bp.*
import java.util.*

inline fun Calendar.toZonedDateTime(): ZonedDateTime {
    val zoneId = ZoneId.of(timeZone.id)
    val instant = Instant.ofEpochMilli(this.time.time)
    return ZonedDateTime.ofInstant(instant, zoneId)
}

inline fun Calendar.toLocalDate(): LocalDate {
    //gotta add one to the cal month since it starts at 0
    val monthOfYear = get(Calendar.MONTH) + 1
    return LocalDate.of(get(Calendar.YEAR), monthOfYear, get(Calendar.DAY_OF_MONTH))
}

inline fun Calendar.toLocalDateTime(): LocalDateTime {
    val monthOfYear = get(Calendar.MONTH) + 1
    return LocalDateTime.of(get(Calendar.YEAR), monthOfYear, get(Calendar.DAY_OF_MONTH), get(Calendar.HOUR_OF_DAY), get(Calendar.MINUTE), get(Calendar.SECOND))
}
