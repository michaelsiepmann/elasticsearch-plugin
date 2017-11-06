package de.swr.misi.idea.plugins.elasticsearch.data.impl

import de.swr.misi.idea.plugins.elasticsearch.data.ESTreeModel
import de.swr.misi.idea.plugins.elasticsearch.data.TreeNode
import javax.swing.event.TreeModelListener
import javax.swing.tree.TreePath

internal class ESTreeModelImpl : ESTreeModel {

    private val root: TreeNode<Any, Any, Any>? = null

    override fun getRoot() = root!!

    override fun valueForPathChanged(path: TreePath?, newValue: Any?) {
    }

    override fun getIndexOfChild(parent: Any?, child: Any?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChild(parent: Any?, index: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addTreeModelListener(l: TreeModelListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeTreeModelListener(l: TreeModelListener?) {
    }
}
