package de.swr.misi.idea.plugins.elasticsearch.gui.tree

internal interface ChildrenHolder<T> {
    val children : List<T>
}