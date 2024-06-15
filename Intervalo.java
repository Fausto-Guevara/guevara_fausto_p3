/*
 * @author Guevara Thomas Fausto Yahel
 * @version 2.0
 * @date 22-Marzo-2024 
 */

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer datos
            System.out.print("Ingresa el valor de a: ");
            int a = scanner.nextInt();
            
            System.out.print("Ingresa el valor de b: ");
            int b = scanner.nextInt();
            
            System.out.print("Ingresa el valor de c: ");
            int c = scanner.nextInt();
            
            // Determinar la posición de c respecto al intervalo [a, b]
            if (c >= a && c <= b) {
                System.out.println("INTERVALO");
            } else if (c < a) {
                System.out.println("IZQUIERDA");
            } else {
                System.out.println("DERECHA");
            }
        }
    }
}
