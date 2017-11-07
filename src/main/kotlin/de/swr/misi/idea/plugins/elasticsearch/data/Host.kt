package de.swr.misi.idea.plugins.elasticsearch.data

internal data class Host(
        val server: String,
        val port: Int,
        override val name: String,
        val driverType: DriverType
) : NamedElement