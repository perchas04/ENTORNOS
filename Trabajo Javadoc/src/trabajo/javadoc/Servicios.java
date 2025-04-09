/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.javadoc;

import java.util.Scanner;


/**
 * Clase principal que permite la interacción con el usuario.
 * @author daw1-18
 */
public class Servicios {
    /**
     * Constructor vacío para Servicios.
     */
    public Servicios() {
    }
    
    /**
     * Método principal que maneja el menú interactivo del banco.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco miBanco = new Banco(1000, 5.0);
        
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Solicitar préstamo");
            System.out.println("4. Consultar saldo e interés");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    miBanco.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    miBanco.retirar(retiro);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad del préstamo: ");
                    double prestamo = scanner.nextDouble();
                    miBanco.otorgarPrestamo(prestamo);
                    break;
                case 4:
                    System.out.println("Saldo actual: " + miBanco.getSaldo());
                    System.out.println("Interés generado: " + miBanco.calcularInteres());
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestros servicios.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

