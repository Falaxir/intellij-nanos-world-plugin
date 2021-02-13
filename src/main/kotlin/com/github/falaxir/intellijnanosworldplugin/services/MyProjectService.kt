package com.github.falaxir.intellijnanosworldplugin.services

import com.github.falaxir.intellijnanosworldplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
