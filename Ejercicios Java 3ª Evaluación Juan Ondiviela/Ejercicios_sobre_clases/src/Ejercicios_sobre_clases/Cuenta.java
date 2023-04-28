package Ejercicios_sobre_clases;

public class Main {
    
    public static void main(String[] args) {
        
        var miCuenta = new CuentaBancaria("Juan Perez");
        miCuenta.depositar(1000);
        miCuenta.retirar(500);
        System.out.println(miCuenta.getTitular() + " tiene un saldo de $" + miCuenta.getSaldo());
    }
}

class CuentaBancaria {
    
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: fondos insuficientes");
        } else {
            saldo -= cantidad;
        }
    }
}