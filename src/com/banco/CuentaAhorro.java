
package com.banco;
//Clase CuentaAhorro que hereda de la clase Cuenta
public class CuentaAhorro extends ACuenta{
    private double porcentajeAhorroAnual;
    
    public CuentaAhorro(int numeroCuenta, double porcentajeAhorroAnual){
        this.numeroCuenta = numeroCuenta;
        this.porcentajeAhorroAnual = porcentajeAhorroAnual;
        this.saldo = 1000; // El saldo inicial para cuentas de ahorro es siempre $1,000
    }
    
    @Override
    public void depositar(double monto) {
        this.saldo += monto;
    }
    
    //El método para calcular intereses mensuales para cuentas de ahorro
    public void calcularInteresesMensuales(){
        double interesesMensuales = (this.saldo + this.porcentajeAhorroAnual)/12;
        this.saldo += interesesMensuales;
    }
    
}
