package de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch.commands

import de.swr.misi.idea.plugins.elasticsearch.data.Index
import org.intellij.lang.annotations.Language
import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class IndicesCommandTest {

    @Test
    @Ignore
    fun testParse() {
        val parse = IndicesCommand().parse(SIMPLE_INDEX)
        assertEquals(listOf(Index("")), parse)
    }

    companion object {
        @Language("json")
        const val SIMPLE_INDEX = """{
  "Index": {
    "name": ""
  }
}"""
    }
}