package de.swr.misi.idea.plugins.elasticsearch.data

import javax.swing.tree.TreeModel


internal interface ESTreeModel : TreeModel {

    override fun getRoot(): TreeNode<Any, Any, Any>

    override fun isLeaf(node: Any?) = getChildCount(node) == 0

    override fun getChildCount(parent: Any?) =
            if (parent is TreeNode<*, *, *>) {
                parent.children.size
            } else {
                0
            }
}