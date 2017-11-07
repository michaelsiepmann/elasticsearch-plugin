package de.swr.misi.idea.plugins.elasticsearch.gui.tree

import de.swr.misi.idea.plugins.elasticsearch.data.Host
import de.swr.misi.idea.plugins.elasticsearch.data.Index
import javax.swing.tree.TreePath

internal data class HostTreeNode(
        private val parent: RootElement,
        val data: Host,
        override val children: MutableList<IndexTreeNode> = mutableListOf()
) : ChildrenHolder<IndexTreeNode> {
    fun addIndex(index: Index) {
        val node = IndexTreeNode(this, index)
        children.add(node)
        parent.notifyIndexAdded(node, TreePath(arrayOf(this, node)))
    }

    override fun toString() = data.name
}
