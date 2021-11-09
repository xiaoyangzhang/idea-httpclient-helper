package com.github.xiaoyangzhang.ideahttpclienthelper.services

import com.intellij.openapi.project.Project
import com.github.xiaoyangzhang.ideahttpclienthelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
