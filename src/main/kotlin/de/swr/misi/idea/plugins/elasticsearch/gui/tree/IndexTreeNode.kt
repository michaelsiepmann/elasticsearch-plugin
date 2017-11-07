package de.swr.misi.idea.plugins.elasticsearch.gui.tree

import de.swr.misi.idea.plugins.elasticsearch.data.Index

internal data class IndexTreeNode(
        private val parent: HostTreeNode,
        val data: Index,
        override val children: MutableList<Any> = mutableListOf()
) : ChildrenHolder<Any> {
    override fun toString() = data.name
}