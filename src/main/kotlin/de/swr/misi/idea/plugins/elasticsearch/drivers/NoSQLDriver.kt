package de.swr.misi.idea.plugins.elasticsearch.drivers

import de.swr.misi.idea.plugins.elasticsearch.data.Index

internal interface NoSQLDriver {

    fun getIndices(): List<Index>

    fun createIndex(indexName: String)
}