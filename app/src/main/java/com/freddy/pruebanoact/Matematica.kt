package com.freddy.pruebanoact

class KotlinEjemplo {

    // Diferentes tipos de variables
    val constante: String = "Esta es una constante" // Variable inmutable (val)
    var contador: Int = 0 // Variable mutable (var)
    var decimal: Double = 3.14 // Número decimal
    var esVerdadero: Boolean = true // Booleano

    // Lista de números enteros
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Lista mutable de nombres
    val nombres = mutableListOf("Ana", "Carlos", "Elena", "Marcos")

    // Función de orden superior que recibe una operación como lambda
    fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b) // Aplica la operación sobre los números
    }

    // Función que muestra el uso de operadores, condiciones if-else, y iteraciones
    fun procesarLista() {
        println("Lista de números: $numeros")

        // Uso de operador y condición if-else
        if (numeros.isNotEmpty()) {
            println("El primer número de la lista es: ${numeros[0]}")
        } else {
            println("La lista está vacía")
        }

        // Iteración con for para mostrar los elementos de la lista
        println("Recorriendo la lista con for:")
        for (num in numeros) {
            print("$num ")
        }
        println()

        // Filtrar números pares usando una lambda
        val numerosPares = numeros.filter { it % 2 == 0 }
        println("Números pares de la lista: $numerosPares")

        // Iteración con while para mostrar los primeros 5 elementos
        var i = 0
        println("Recorriendo los primeros 5 números con while:")
        while (i < 5) {
            print("${numeros[i]} ")
            i++
        }
        println()

        // Uso de una lista mutable
        println("Lista de nombres antes: $nombres")
        nombres.add("Sofía") // Agregar un elemento
        nombres.remove("Carlos") // Eliminar un elemento
        println("Lista de nombres después de modificaciones: $nombres")

        // Mapear la lista para transformarla
        val nombresEnMayusculas = nombres.map { it.uppercase() }
        println("Nombres en mayúsculas: $nombresEnMayusculas")

        // Buscar un nombre en la lista
        val nombreBuscado = "Elena"
        if (nombres.contains(nombreBuscado)) {
            println("$nombreBuscado está en la lista")
        } else {
            println("$nombreBuscado no está en la lista")
        }
    }
}

fun main() {
    val ejemplo = KotlinEjemplo()

    // Ejecutar la función de orden superior con una lambda personalizada
    val resultado = ejemplo.aplicarOperacion(10, 5) { x, y -> x * y + 2 }
    println("Resultado de la operación personalizada: $resultado")

    // Ejecutar la función que procesa listas
    ejemplo.procesarLista()
}
