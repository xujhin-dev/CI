package com.xujhin.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        //编译时就会执行
        System.out.println("==========================")
        System.out.println("this is test plugin")
        System.out.println("==========================")
    }
}



