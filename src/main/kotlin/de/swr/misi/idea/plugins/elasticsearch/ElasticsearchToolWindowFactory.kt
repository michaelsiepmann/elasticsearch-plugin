package de.swr.misi.idea.plugins.elasticsearch

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class ElasticsearchToolWindowFactory : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val content = ContentFactory.SERVICE.getInstance().createContent(ElasticsearchToolWindowContent(), "", false)
        toolWindow.contentManager.addContent(content)
    }
}
