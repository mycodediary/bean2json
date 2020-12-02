package com.github.mycodediary.bean2json.services

import com.intellij.openapi.project.Project
import com.github.mycodediary.bean2json.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
