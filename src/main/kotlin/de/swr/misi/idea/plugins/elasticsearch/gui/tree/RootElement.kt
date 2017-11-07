package de.swr.misi.idea.plugins.elasticsearch.gui.tree

import de.swr.misi.idea.plugins.elasticsearch.data.Host
import de.swr.misi.idea.plugins.elasticsearch.gui.tree.impl.ESTreeModelImpl
import javax.swing.tree.TreePath

internal data class RootElement(
        private val treeModel: ESTreeModelImpl,
        override val children: MutableList<HostTreeNode> = mutableListOf()
) : ChildrenHolder<HostTreeNode> {
    fun notifyIndexAdded(node: IndexTreeNode, treePath: TreePath) {
        treeModel.notifyItemAdded(node, treePath)
    }

    fun addHost(host: Host) {
        val node = HostTreeNode(this, host)
        children.add(node)
        treeModel.notifyItemAdded(node, TreePath(node))
    }
}
