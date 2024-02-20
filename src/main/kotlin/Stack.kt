/**
 * Clase genérica que implementa una pila (stack) en Kotlin.
 *
 * @param T Tipo de elementos que se almacenarán en la pila.
 */
class Stack<T> {

    // Lista mutable que almacena los elementos de la pila.
    private val elementos = mutableListOf<T>()

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     *
     * @return Elemento en la cima de la pila o null si la pila está vacía.
     */
    fun tope(): T? {
        return elementos.lastOrNull()
    }

    /**
     * Agrega un elemento a la cima de la pila.
     *
     * @param elemento Elemento que se va a agregar a la pila.
     */
    fun push(elemento: T) {
        elementos.add(elemento)
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return Elemento en la cima de la pila o null si la pila está vacía.
     */
    fun pop(): T? {
        // Verifica si la pila no está vacía antes de intentar eliminar el elemento.
        return if (elementos.isNotEmpty()) elementos.removeAt(elementos.size - 1) else null
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false si contiene elementos.
     */
    fun vacia(): Boolean {
        return elementos.isEmpty()
    }
}


