class Pila<T> {
    var pileList = mutableListOf<T>()

    fun top(): T = pileList.first()

    fun push(addedElement: T) = pileList.add(0, addedElement)

    fun pop(addedElement: T) = pileList.removeFirstOrNull()

    fun empty(): Boolean = pileList.isEmpty()

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
//    var numbers = listOf("one", "two", "three", "four")
//    var numbersRev = reverse(numbers)
//    if (!listOf("four", "three", "two", "one").equals(numbersRev))
//        println("Error")
//    else
//        println("Correcto")
//    println(numbersRev)
}