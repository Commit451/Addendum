package com.commit451.addendum.threetenabp

import org.threeten.bp.DateTimeUtils
import org.threeten.bp.LocalDate
import org.threeten.bp.ZoneId
import java.util.*

inline fun LocalDate.toDateAtStartOfDay(zoneId: ZoneId = ZoneId.systemDefault()): Date {
    return DateTimeUtils.toDate(atStartOfDay(zoneId).toInstant())
}
