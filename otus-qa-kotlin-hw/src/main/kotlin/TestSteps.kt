class TestSteps {

    fun afterEach() {
        println("After each method called")
    }

    fun afterAll() {
        println("After all called")
    }

    fun testMethod() {
        println("Test method called")
    }

    fun beforeEach() {
        println("Before each method called")
    }

    fun beforeAll() {
        println("Before all method called")
    }
}