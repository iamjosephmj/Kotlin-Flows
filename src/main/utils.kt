fun exampleOf(exampleName: String, action: () -> Unit = {}) {
    println(exampleName)
    action()
}