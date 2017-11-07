package de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch.commands

import org.apache.commons.httpclient.methods.PutMethod

internal class CreateIndexCommand(private val indexName: String) : AbstractCommand<String>() {

    override fun createURI() = "/$indexName"

    override fun clientMethod() = PutMethod()

    override fun parse(body: String) = body
}