package com.commit451.addendum.threetenabp

import org.threeten.bp.LocalDate
import java.util.*

inline fun Calendar.toLocalDate(): LocalDate {
    //gotta add one to the cal month since it starts at 0
    val monthOfYear = this.get(Calendar.MONTH) + 1
    return LocalDate.of(this.get(Calendar.YEAR), monthOfYear, this.get(Calendar.DAY_OF_MONTH))
}
