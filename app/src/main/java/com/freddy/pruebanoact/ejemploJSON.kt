package com.freddy.pruebanoact
import com.google.gson.Gson
class ejemploJSON {
}
data class Libros(
    val titulo: String,
    val autor: String,
    val publicacion: Int,
    val genero: String,
    val disponibilidad: Boolean,
    val resumen: String,
    val calificaciones: List<Calificaciones>
)

data class Calificaciones(
    val usuario: String,
    val puntuacion: Int,
    val comentario: String
)

fun main(){
    val datosJSON = """{ 

  "titulo": "Cien años de soledad", 

  "autor": "Gabriel García Márquez", 

  "ano_publicacion": 1967, 

  "genero": "Realismo mágico", 

  "disponibilidad": true, 

  "resumen": "La novela narra la historia de la familia Buendía en el ficticio pueblo de Macondo, abordando temas como el amor, la soledad y el destino.", 

  "calificaciones": [ 

    { 

      "usuario": "Juan123", 

      "puntuacion": 5, 

      "comentario": "Una obra maestra de la literatura." 

    }, 

    { 

      "usuario": "Ana456", 

      "puntuacion": 4, 

      "comentario": "Una historia fascinante, aunque algo difícil de seguir en algunos momentos." 

    } 

  ] 

} """.trimIndent()

    //Convertir el JSON en Data Class

    val gson = Gson()
    val libro: Libros = gson.fromJson(datosJSON,Libros::class.java)

    println("Titulo: ${libro.titulo}")
    println("Autor: ${libro.autor}")

    //println("las calificaciones son: ${libro.calificaciones[0].usuario} es ${libro.calificaciones[0].puntuacion} ")
    println("las calificaciones son:")
    libro.calificaciones.forEach{
        println("usuario: " + it.usuario)
        println("puntuacion: " + it.puntuacion)
        println("comentario: " + it.comentario)
        println("-----")
    }


}