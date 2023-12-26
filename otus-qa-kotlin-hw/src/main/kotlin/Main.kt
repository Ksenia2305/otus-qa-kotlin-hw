fun main() {
    val runner = TestRunnerImpl()
    val testSteps = TestSteps()

    runner.runTest(steps = testSteps)
    {
        testSteps.beforeAll()
        testSteps.beforeEach()
        testSteps.testMethod()
        testSteps.afterEach()
        testSteps.afterAll()
    }
}