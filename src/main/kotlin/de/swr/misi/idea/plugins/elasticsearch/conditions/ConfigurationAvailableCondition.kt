package de.swr.misi.idea.plugins.elasticsearch.conditions

import com.intellij.openapi.util.Condition

internal class ConfigurationAvailableCondition<T> : Condition<T> {

    override fun value(t: T) = false // todo
}