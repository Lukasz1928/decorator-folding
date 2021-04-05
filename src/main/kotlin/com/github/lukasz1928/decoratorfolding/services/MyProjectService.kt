package com.github.lukasz1928.decoratorfolding.services

import com.github.lukasz1928.decoratorfolding.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
