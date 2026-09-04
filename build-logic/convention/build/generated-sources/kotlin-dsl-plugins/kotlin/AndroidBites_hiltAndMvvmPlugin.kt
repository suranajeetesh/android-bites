/**
 * Precompiled [android-bites.hilt-and-mvvm.gradle.kts][Android_bites_hilt_and_mvvm_gradle] script plugin.
 *
 * @see Android_bites_hilt_and_mvvm_gradle
 */
public
class AndroidBites_hiltAndMvvmPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Android_bites_hilt_and_mvvm_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
