/*
 * @author Guevara Thomas Fausto Yahel
 * @version 2.0
 * @date 22-Marzo-2024 
 */


import java.util.Scanner;

public class Telegrama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer datos
            System.out.print("Nombre del remitente: ");
            String remitenteNombre = scanner.nextLine().toUpperCase();
            
            System.out.print("Profesión del remitente: ");
            String remitenteProfesion = scanner.nextLine().toUpperCase();
            
            System.out.print("Nombre del destinatario: ");
            String destinatarioNombre = scanner.nextLine().toUpperCase();
            
            System.out.print("Profesión del destinatario: ");
            String destinatarioProfesion = scanner.nextLine().toUpperCase();
            
            System.out.print("Contenido del telegrama: ");
            String contenido = scanner.nextLine();
            
            System.out.print("¿Es urgente? (true/false): ");
            boolean esUrgente = scanner.nextBoolean();
            
            scanner.nextLine();  // Consumir el salto de línea
            
            System.out.print("Dirección (Calle número, ciudad CP): ");
            String direccion = scanner.nextLine().toUpperCase();
            
            // Formatear profesiones
            String remitente = remitenteProfesion.substring(0, 3) + ". " + remitenteNombre;
            String destinatario = destinatarioProfesion.substring(0, 3) + ". " + destinatarioNombre;
            
            // Calcular costo
            int longitudMensaje = contenido.length();
            double costo = esUrgente ? longitudMensaje * 4.00 : longitudMensaje * 2.00;
            
            // Imprimir telegrama
            System.out.println("De: " + remitente);
            System.out.println("Para: " + destinatario);
            System.out.println("Mensaje: " + contenido);
            System.out.println("Costo: $" + costo + " (" + (esUrgente ? "Urgente" : "Normal") + ")");
            
            // Imprimir dirección
            String[] direccionPartes = direccion.split(", ");
            System.out.println("Dirección:");
            System.out.println(direccionPartes[0]);
            System.out.println(direccionPartes[1]);
        }
    }
}
