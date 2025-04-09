/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.javadoc;


/**
 * Representa una cuenta bancaria básica con funcionalidades de depósito y retiro.
 * @author daw1-18
 * @version 1.1
 */
public class CuentaBancaria {
    protected double saldo;
    
    /**
     * Constructor vacío (no recomendado para uso general).
     */
    public CuentaBancaria() {
        this.saldo = 0;
    }
    
    /**
     * Constructor para inicializar el saldo de la cuenta.
     * @param saldoInicial Cantidad inicial en la cuenta.
     */
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    /**
     * Deposita una cantidad en la cuenta.
     * @param cantidad Cantidad a depositar.
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad no válida para depositar.");
        }
    }
    
    /**
     * Retira una cantidad de la cuenta si hay fondos suficientes.
     * @param cantidad Cantidad a retirar.
     * @deprecated Usar el método retirarSeguro en futuras implementaciones.
     */
    @Deprecated
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
        }
    }
    
    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}