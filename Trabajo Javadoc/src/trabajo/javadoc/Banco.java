/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.javadoc;


/**
 * Extiende CuentaBancaria y añade funcionalidad de préstamos e intereses.
 * @author daw1-18
 * @see CuentaBancaria
 */
public class Banco extends CuentaBancaria {
    private double tasaInteres;
    
    /**
     * Constructor vacío para Banco.
     */
    public Banco() {
    }
    
    /**
     * Constructor para inicializar una cuenta bancaria con tasa de interés.
     * @param saldoInicial Cantidad inicial en la cuenta.
     * @param tasaInteres Porcentaje de interés aplicado.
     */
    public Banco(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }
    
    /**
     * Otorga un préstamo sumando la cantidad al saldo.
     * @param cantidad Cantidad del préstamo.
     */
    public void otorgarPrestamo(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Préstamo otorgado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad no válida para préstamo.");
        }
    }
    
    /**
     * Calcula el interés generado sobre el saldo.
     * @return Cantidad de interés generado.
     */
    public double calcularInteres() {
        return saldo * tasaInteres / 100;
    }
    
    /**
     * Obtiene la tasa de interés aplicada a la cuenta.
     * @return La tasa de interés en porcentaje.
     */
    public double getTasaInteres() {
        return tasaInteres;
    }
    
    /**
     * Establece una nueva tasa de interés para la cuenta.
     * @param tasaInteres Nueva tasa de interés en porcentaje.
     */
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Establece un nuevo saldo en la cuenta.
     * @param saldo Nuevo saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
