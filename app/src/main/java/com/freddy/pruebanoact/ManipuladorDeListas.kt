package com.freddy.pruebanoact

class ManipuladorDeListas {

    // Lista de números enteros
    private val numeros = listOf(10, 5, 8, 3, 12, 7, 2, 15)

    // 🔹 Filtrar números mayores a 7
    fun filtrarMayoresA7(): List<Int> = numeros.filter { it > 7 }

    // 🔹 Transformar: elevar al cuadrado cada número
    fun elevarCuadrados(): List<Int> = numeros.map { it * it }

    // 🔹 Ordenar la lista de menor a mayor
    fun ordenarAscendente(): List<Int> = numeros.sorted()

    // 🔹 Ordenar la lista de mayor a menor
    fun ordenarDescendente(): List<Int> = numeros.sortedDescending()

    // 🔹 Reducir la lista sumando todos los elementos
    fun sumarElementos(): Int = numeros.reduce { acc, num -> acc + num }

    // 🔹 Agrupar números en pares e impares
    fun agruparParesEImpares(): Map<Boolean, List<Int>> = numeros.groupBy { it % 2 == 0 }

    // 🔹 Buscar elementos en la lista
    fun buscarPrimerElemento(): Int = numeros.first()
    fun buscarUltimoElemento(): Int = numeros.last()
    fun buscarMayorA10(): Int? = numeros.find { it > 10 }

    // 🔹 Concatenar listas
    fun concatenarConOtraLista(otraLista: List<Int>): List<Int> = numeros + otraLista

    // 🔹 Combinar listas con `zip`
    fun combinarConLetras(letras: List<String>): List<Pair<Int, String>> = numeros.zip(letras)

    // 🔹 Iterar con `forEach`
    fun iterarListaForEach() {
        numeros.forEach { println(it) }
    }

    // 🔹 Iterar con `for`
    fun iterarListaFor() {
        for (num in numeros) {
            println("Número en la lista: $num")
        }
    }

    // 🔹 Uso de `mutableListOf` para modificar listas
    fun modificarListaMutable(): MutableList<String> {
        val listaMutable = mutableListOf("Kotlin", "Java", "Python")
        listaMutable.add("Swift") // Agregar un elemento
        listaMutable.remove("Java") // Eliminar un elemento
        listaMutable[1] = "C++" // Modificar un elemento
        return listaMutable
    }
}

fun main() {
    val manipulador = ManipuladorDeListas()

    // Ejecutando métodos y mostrando resultados
    println("Números mayores a 7: ${manipulador.filtrarMayoresA7()}")
//    println("Cuadrados de los números: ${manipulador.elevarCuadrados()}")
//    println("Lista ordenada: ${manipulador.ordenarAscendente()}")
//    println("Lista ordenada (descendente): ${manipulador.ordenarDescendente()}")
//    println("Suma total de la lista: ${manipulador.sumarElementos()}")
    println("Números agrupados en pares e impares: ${manipulador.agruparParesEImpares()}")
//    println("Primer elemento: ${manipulador.buscarPrimerElemento()}")
//    println("Último elemento: ${manipulador.buscarUltimoElemento()}")
//    println("Encontrado (>10): ${manipulador.buscarMayorA10()}")
//    println("Lista concatenada: ${manipulador.concatenarConOtraLista(listOf(20, 25, 30))}")
//    println("Lista combinada (números y letras): ${manipulador.combinarConLetras(listOf("A", "B", "C", "D"))}")
//
//    println("Elementos de la lista con forEach:")
//    manipulador.iterarListaForEach()
//
//    println("Elementos de la lista con for:")
//    manipulador.iterarListaFor()
//
//    println("Lista mutable modificada: ${manipulador.modificarListaMutable()}")
}
