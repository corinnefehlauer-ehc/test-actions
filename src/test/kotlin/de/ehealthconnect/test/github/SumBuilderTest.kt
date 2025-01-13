package de.ehealthconnect.test.github

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumBuilderTest {
    @Test
    fun testSum() {
        val sumBuilder = SumBuilder()
        assertEquals(6, sumBuilder.sum(4, 3))
    }

    @Test
    fun testSum2() {
        val sumBuilder = SumBuilder()
        assertEquals(7, sumBuilder.sum(4, 3))
    }

    @Test
    fun testSum3() {
        val sumBuilder = SumBuilder()
        assertEquals(8, sumBuilder.sum(4, 3))
    }
}