package de.swr.misi.idea.plugins.elasticsearch.drivers

internal interface NoSQLDriver {

    // fun getIndices(host: Host) : List<Index>
    fun getIndices(): List<Any>

    fun createIndex(indexName: String)
}