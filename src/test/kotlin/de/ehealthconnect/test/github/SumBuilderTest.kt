package de.ehealthconnect.test.github

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumBuilderTest {
    @Test
    fun testSum() {
        val sumBuilder = SumBuilder()
        assertEquals(6, sumBuilder.sum(4, 3))
    }
}