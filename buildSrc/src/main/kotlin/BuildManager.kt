import org.gradle.api.Plugin
import org.gradle.api.Project
import tasks.ManageReadme

/**
 * @project Facade
 * @author mambobryan
 * @email mambobryan@gmail.com
 * Mon Feb 2023
 */
class BuildManager : Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.register("masking", ManageReadme::class.java)
    }
}