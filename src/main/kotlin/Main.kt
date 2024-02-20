/**
 * Función genérica que invierte el orden de los elementos en una Iterable.
 *
 * @param list Iterable que se desea invertir.
 * @return Lista con los elementos en orden inverso.
 */
fun <T> reverse(list: Iterable<T>): List<T> {
    // Se crea una instancia de la clase Stack para almacenar los elementos de la Iterable en orden inverso.
    val stack = Stack<T>()

    // Se recorre la Iterable y se agregan los elementos a la pila.
    for (elemento in list) {
        stack.push(elemento)
    }

    // Se crea una lista mutable para almacenar los elementos en orden inverso.
    val reversed = mutableListOf<T>()

    // Se desapilan los elementos y se agregan a la lista en orden inverso.
    while (!stack.vacia()) {
        stack.pop()?.let { reversed.add(it) }
    }

    // Se devuelve la lista con los elementos en orden inverso.
    return reversed
}

/**
 * Función principal que demuestra el uso de la función reverse.
 */
fun main() {
    // Se crea una lista de strings.
    var numbers = listOf("one", "two", "three", "four")

    // Se invierte la lista utilizando la función reverse.
    var numbersRev = reverse(numbers)

    // Se verifica si la lista invertida es igual a la lista esperada ("four", "three", "two", "one").
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")

    // Se imprime la lista invertida.
    println(numbersRev)
}
