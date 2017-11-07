package de.swr.misi.idea.plugins.elasticsearch.gui.tree

import de.swr.misi.idea.plugins.elasticsearch.data.NamedElement

internal interface TreeNode<P, out T : NamedElement, C> {
    val parent: P
    val data: T
    val children: List<C>
}