package com.santisteban.jose.laboratoriocalificado01

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Ejercicio01Kotlin {


    @Test
    fun main() {
        val palabra = "hello"
        // Llama a la función contarFrecuencia y almacena el resultado
        val resultado = contarFrecuencia(palabra)

        println("Frecuencia de caracteres en '$palabra': $resultado")
    }


    private fun contarFrecuencia(palabra: String): Map<Char, Int> {
        val frecuencia = mutableMapOf<Char, Int>() // Mapa para almacenar las frecuencias
        val palabraMinusculas = palabra.lowercase()
        for (caracter in palabraMinusculas) {
            // Se omiten los espacios - No los cuenta
            if (caracter != ' ') {
                // Actualizamos el contador del carácter correspondiente
                frecuencia[caracter] = frecuencia.getOrDefault(caracter, 0) + 1

            }
        }
        return frecuencia
    }


}

