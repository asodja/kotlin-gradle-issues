import org.gradle.kotlin.dsl.support.serviceOf

rootProject.name = "kotlin-gradle-issues"

data class Container(val property: Property<String> = gradle.serviceOf<ObjectFactory>().property(String::class.java))
val container = Container().apply {
    property.set("Hello world")
}

println("Settings.gradle.kts: ${container.property.get()}")