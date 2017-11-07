package de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch.commands

import com.google.gson.Gson
import java.io.InputStreamReader

internal class IndicesCommand<T> : AbstractListCommand<T>() {

    override fun parse(body: String): List<T> {
        val gson = Gson()
        val fromJson = gson.fromJson<Any>(InputStreamReader(body.byteInputStream()), Any::class.java)
        return emptyList()
    }

    override fun createURI() = "/_cat/indices"
}