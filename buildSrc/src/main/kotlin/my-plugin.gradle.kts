import org.gradle.kotlin.dsl.support.serviceOf

data class Container(
    val property: Property<String> = gradle.serviceOf<ObjectFactory>().property(String::class.java)
)
