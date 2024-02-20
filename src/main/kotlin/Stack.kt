class Stack<T>{

    private val elementos = mutableListOf<T>()
    fun tope(): T?{
        return elementos.lastOrNull()
    }

    fun push(elemento: T){
        elementos.add(elemento)
    }

    fun pop(): T?{
        return if (elementos.isNotEmpty()) elementos.removeAt(elementos.size-1) else null
    }

    fun vacia(): Boolean{
        return elementos.isEmpty()
    }
}

