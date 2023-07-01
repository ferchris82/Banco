
package com.banco;

//Clase CuentaInversion que hereda de la clase Cuenta
public class CuentaInversion extends ACuenta{
    public CuentaInversion(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 25000; //El saldo inicial para cuentas de inversión siempre es $25.000
    }

    @Override
    public void depositar(double monto) {
        this.saldo += monto;
    }
    public void retirar(double monto){
        //Para cuentas de inversión, siempre debe haber al menos $10,000 en la cuenta
        if(this.saldo - monto >= 1000){
            this.saldo -= monto;
        }else{
            System.out.println("El retiro no es posible. Saldo minimo de $10,000.");
        }
    }
    
}
