package de.swr.misi.idea.plugins.elasticsearch.drivers.elasticsearch.commands

import de.swr.misi.idea.plugins.elasticsearch.drivers.NoSQLException
import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.HttpMethod
import org.apache.commons.httpclient.methods.GetMethod

internal abstract class AbstractCommand<out T> {

    fun execute(): T {
        val client = HttpClient()
        val method = clientMethod()
        val result = client.executeMethod(method)
        if (result < 400) {
            return parse(method.responseBodyAsString)
        }
        throw NoSQLException("Query returns code " + result)
    }

    open fun clientMethod(): HttpMethod = GetMethod(createURI())

    abstract fun createURI(): String

    abstract fun parse(body: String): T
}