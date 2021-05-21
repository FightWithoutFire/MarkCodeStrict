package com.github.fightwithoutfire.markcodestrict.services

import com.github.fightwithoutfire.markcodestrict.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
