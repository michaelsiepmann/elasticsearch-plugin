package de.swr.misi.idea.plugins.elasticsearch.data

internal interface TreeNode<P, T, C> {

    val parent: P
    val data: T
    val children: List<C>
}