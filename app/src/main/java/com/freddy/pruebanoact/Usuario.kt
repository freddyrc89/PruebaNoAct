package com.freddy.pruebanoact
import com.google.gson.Gson
data class Usuario(
    val nombre: String,
    val edad: Int,
    val correo: String,
    val direccion: Direccion
)

data class Direccion(
    val calle: String,
    val ciudad: String,
    val pais: String
)

fun main() {
    // 2️⃣ Variable con estructura JSON en formato String
    val jsonUsuario = """
        {
            "nombre": "Juan Pérez",
            "edad": 30,
            "correo": "juan.perez@example.com",
            "direccion": {
                "calle": "Av. Siempre Viva 742",
                "ciudad": "Springfield",
                "pais": "EE.UU."
            }
        }
    """.trimIndent()

    // 3️⃣ Convertir JSON a Data Class usando Gson
    val gson = Gson()
    val usuario: Usuario = gson.fromJson(jsonUsuario, Usuario::class.java)

    // 4️⃣ Mostramos los datos convertidos
    println("Nombre: ${usuario.nombre}")
    println("Edad: ${usuario.edad}")
    println("Correo: ${usuario.correo}")
    println("Dirección: ${usuario.direccion.calle}, ${usuario.direccion.ciudad}, ${usuario.direccion.pais}")
}