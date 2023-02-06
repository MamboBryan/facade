package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.io.FileNotFoundException

/**
 * @project Facade
 * @author mambobryan
 * @email mambobryan@gmail.com
 * Mon Feb 2023
 */
open class ManageReadme : DefaultTask() {

    @TaskAction
    fun mask(){
        val path = File("${project.rootDir}/README.md")
        if(path.exists().not())  throw FileNotFoundException("Couldn't find README.md in root project directory")

        println("README.md found successfully")
        moveReadme()
    }

    private fun moveReadme(){
        File("${project.rootDir}/README.md").let {
            try {
                it.copyTo(File("${project.rootDir}/docs/README.md"))
            } catch (e: Exception){
                e.printStackTrace()
                val folder = File("${project.rootDir}/docs")
                folder.mkdir()
            } finally {
                it.delete()
            }
        }

    }

}