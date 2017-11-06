package de.swr.misi.idea.plugins.elasticsearch

import com.intellij.ui.components.JBScrollPane
import com.intellij.ui.treeStructure.Tree
import de.swr.misi.idea.plugins.elasticsearch.data.impl.ESTreeModelImpl
import javax.swing.JPanel

class ElasticsearchToolWindowContent : JPanel() {

    private val tree = Tree()

    init {
        tree.model = ESTreeModelImpl()
        add(JBScrollPane(tree))
    }
}
