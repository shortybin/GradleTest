package com.shortybin.version

import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionPlugin:Plugin<Project> {
    override fun apply(p0: Project) {
        println("测试gradle插件")
        p0.task("hello"){
            it.doLast {
                println("hello 结束")
            }
        }
    }

    companion object {
        val appcompat = "androidx.appcompat:appcompat:1.1.0"
    }
}