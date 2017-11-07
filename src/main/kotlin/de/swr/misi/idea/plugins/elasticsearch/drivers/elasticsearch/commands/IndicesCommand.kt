package de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch.commands

import com.google.gson.Gson
import de.swr.misi.idea.plugins.elasticsearch.data.Index
import java.io.InputStreamReader

internal class IndicesCommand : AbstractListCommand<Index>() {

    override fun parse(body: String): List<Index> {
        val gson = Gson()
        val fromJson = gson.fromJson<Index>(InputStreamReader(body.byteInputStream()), Index::class.java)
        return emptyList()
    }

    override fun createURI() = "/_cat/indices"
}