package com.yee.study.groovy.task

import org.gradle.api.*
import org.gradle.api.tasks.*

class HelloWorldTask2 extends DefaultTask {
    @Optional
    String message = 'I am Phoebe'

    @TaskAction
    def hello(){
        println "hello world $message"
    }
}
