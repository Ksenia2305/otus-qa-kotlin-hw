import kotlin.reflect.KFunction
import kotlin.reflect.full.declaredFunctions

class TestRunnerImpl: TestRunner {

    private val before = Regex("before\\w*")
    private val after = Regex("after\\w*")
    private val test = Regex("test\\w*")

    override fun <T> runTest(steps: T, test: () -> Unit) {
        val functions: Collection<KFunction<*>> = TestSteps::class.declaredFunctions
        for (function in functions) {
            if (function.name.contains(before)) {
                println("Before method called ${function.name}")
            }
        }
        for (function in functions) {
            if (function.name.contains(this.test)) {
                println("Running test")
            }
        }
        for (function in functions) {
            if (function.name.contains(after)) {
                println("After method called ${function.name}")
            }
        }
    }
}