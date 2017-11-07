package de.swr.misi.idea.plugins.elasticsearch.gui.tree

import javax.swing.tree.TreeModel

internal interface ESTreeModel : TreeModel {

    override fun getRoot(): ChildrenHolder<HostTreeNode>

    override fun isLeaf(node: Any?) = getChildCount(node) == 0

    override fun getChildCount(parent: Any?) =
            decide(parent, 0) {
                it.children.size
            }

    override fun getIndexOfChild(parent: Any?, child: Any?) =
            decide(parent, -1) {
                it.children.indexOf(child)
            }

    override fun getChild(parent: Any?, index: Int) =
            decide(parent, null) {
                it.children[index]
            }

    private fun <T> decide(parent: Any?, defaultValue: T, func: (ChildrenHolder<*>) -> T) =
            if (parent is ChildrenHolder<*>) {
                func(parent)
            } else {
                defaultValue
            }
}