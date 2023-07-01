
package com.banco;

//Clase Cuenta(abstracta)
public abstract class ACuenta {
    //Definimos las propiedades comunes de todas las cuentas
    protected int numeroCuenta;
    protected double saldo;
    
    //Definimos los métodos comunes que todas las cuentas deben tener.
    public abstract void depositar(double monto);
}
