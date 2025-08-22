/*
 * Programa: Piedra, papel o tijera
 * El programa permite simular el juego de "Piedra, papel o tijera" entre dos jugadores.
 * Cada jugador ingresa su selección y el programa determina quién es el ganador o si hay empate.
 * 
 * Correcciones realizadas:
 * Se corrigieron errores de sintaxis.
 * Se implementa el uso de equalsIgnoresCase() para comparar cadenas, evitando problemas con mayúscula y/o minúsculas.
 * Se agrega cierre de los objetos Scanner.
 * Se corrigen mensajes para legibilidad del código.
 */

package com.generation;
import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Entrada jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase(); // Convertimos a minúscula para evitar errores

        // Entrada jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();

        // Lógica del juego
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else if (
            (j1.equals("piedra") && j2.equals("tijeras")) ||
            (j1.equals("papel") && j2.equals("piedra")) ||
            (j1.equals("tijeras") && j2.equals("papel"))
        ) {
            System.out.println("Gana el jugador 1");
        } else if (
            (j2.equals("piedra") && j1.equals("tijeras")) ||
            (j2.equals("papel") && j1.equals("piedra")) ||
            (j2.equals("tijeras") && j1.equals("papel"))
        ) {
            System.out.println("Gana el jugador 2");
        } else {
            System.out.println("Entrada no válida. Solo se permite: piedra, papel o tijeras.");
        }//if

        // Cerrar scanner
        s.close();
    }
}