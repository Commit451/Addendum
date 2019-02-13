package com.commit451.addendum

import org.junit.Assert.assertNotNull
import org.junit.Test
import java.lang.IllegalStateException

class ExtensionsTest {

    @Test
    fun `Multi-variable let safe`() {
        val username: String? = ""
        val id: Int? = 0
        safeLet(username, id) { safeUsername, safeId ->
            assertNotNull(safeUsername)
            assertNotNull(safeId)
        }
    }

    @Test
    fun `Multi-variable let unsafe`() {
        val username: String? = null
        val id: Int? = 0
        safeLet(username, id) { safeUsername, safeId ->
            throw IllegalStateException("Not allowed in here!")
        }
    }
}
