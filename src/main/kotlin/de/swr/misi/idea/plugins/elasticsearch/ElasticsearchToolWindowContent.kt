package de.swr.misi.idea.plugins.elasticsearch

import com.intellij.ui.components.JBScrollPane
import javax.swing.JPanel
import javax.swing.JTree

class ElasticsearchToolWindowContent : JPanel() {

    private val tree = JTree()

    init {
        add(JBScrollPane(tree))
    }
}
