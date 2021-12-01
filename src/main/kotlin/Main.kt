class Pila<T> {
    private var pileList = mutableListOf<T>()

    fun top(): T = pileList.first()

    fun push(addedElement: T) = pileList.add(0, addedElement)

    fun pop() = pileList.removeFirstOrNull()

    fun empty(): Boolean = pileList.isEmpty()

}

fun <T> reverse(listToReverse: List<T>): MutableList<T> {

    var stack = Pila<T>()
    val reverse: MutableList<T> = ArrayList(listToReverse.size)
    val itr = listToReverse.listIterator()
    while (itr.hasNext()) {
        stack.push(itr.next())
    }
    while (!stack.empty()) {
        stack.top()?.let { reverse.add(it) }
        stack.pop()
    }
    return reverse

}

fun reverse2(listToReverse: List<Any>): MutableList<Any> {

    val reverse: MutableList<Any> = ArrayList(listToReverse.size)
    val itr = listToReverse.listIterator(listToReverse.size)
    while (itr.hasPrevious()) {
        reverse.add(itr.previous())
    }
    return reverse

}

fun main(args: Array<String>) {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}