package de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch

import de.swr.misi.idea.plugins.elasticsearch.data.Index
import de.swr.misi.idea.plugins.elasticsearch.drivers.NoSQLDriver
import de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch.commands.CreateIndexCommand
import de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch.commands.IndicesCommand

internal class ElasticsearchDriver : NoSQLDriver {

    override fun createIndex(indexName: String) {
        CreateIndexCommand(indexName).clientMethod()
    }

    override fun getIndices(): List<Index> {
        return IndicesCommand().execute()
    }
}