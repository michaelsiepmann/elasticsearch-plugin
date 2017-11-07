package de.swr.misi.idea.plugins.elasticsearch.gui.tree.impl

import de.swr.misi.idea.plugins.elasticsearch.data.Host
import de.swr.misi.idea.plugins.elasticsearch.gui.tree.ChildrenHolder
import de.swr.misi.idea.plugins.elasticsearch.gui.tree.ESTreeModel
import de.swr.misi.idea.plugins.elasticsearch.gui.tree.HostTreeNode
import de.swr.misi.idea.plugins.elasticsearch.gui.tree.RootElement
import javax.swing.event.TreeModelEvent
import javax.swing.event.TreeModelListener
import javax.swing.tree.TreePath

internal class ESTreeModelImpl : ESTreeModel {

    private val root = RootElement(this)
    private val listeners = mutableListOf<TreeModelListener>()

    override fun getRoot() = root

    override fun valueForPathChanged(path: TreePath?, newValue: Any?) {
    }

    fun notifyItemAdded(source: Any, path: TreePath) {
        val event = TreeModelEvent(source, path)
        listeners.forEach {
            it.treeNodesInserted(event)
        }
    }

    override fun addTreeModelListener(l: TreeModelListener) {
        listeners.add(l)
    }

    override fun removeTreeModelListener(l: TreeModelListener) {
        listeners.remove(l)
    }
}
