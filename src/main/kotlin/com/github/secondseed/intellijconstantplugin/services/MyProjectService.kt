package com.github.secondseed.intellijconstantplugin.services

import com.intellij.openapi.project.Project
import com.github.secondseed.intellijconstantplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
