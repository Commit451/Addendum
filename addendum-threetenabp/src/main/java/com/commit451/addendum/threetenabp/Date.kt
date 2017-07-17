package com.commit451.addendum.threetenabp

import org.threeten.bp.LocalDate
import java.util.*

inline fun Date.toLocalDate(): LocalDate {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.toLocalDate()
}
