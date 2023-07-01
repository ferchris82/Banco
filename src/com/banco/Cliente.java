
package com.banco;

public class Cliente {
    //Definimos variables de la clase cliente
    private int numeroUsuario;
    private String identificacion;
    private String tipoCuenta;
    private double saldo;
    
    //Constructor con parametros

    public Cliente(int numeroUsuario, String identificacion, String tipoCuenta) {
        this.numeroUsuario = numeroUsuario;
        this.identificacion = identificacion;
        this.tipoCuenta = tipoCuenta;
        
        //El primer depósito para cuentas de ahorro debe ser $1,000
        if(tipoCuenta.equals("ahorro")){
            this.saldo = 1000;
        }else{
            this.saldo = 25000; //Monto inicial para cuentas de inversion
        }
    }
    //Métodos getter and setter
    public int getNumeroUsuario(){    
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(double saldo) {    
        this.saldo = saldo;
    }

    //Métodos para depositar y retirar
    public void depositar(double monto) {
        this.saldo += monto;
    }
    public void retirar(double monto){
        if(tipoCuenta.equals("ahorro")){
            //La cuenta nunca debe quedar en ceros ni por debajo de $500
            if(this.saldo - monto >= 500){
                this.saldo -= monto;
            }else{
                System.out.println("El retiro no es posible. Saldo mínimo de $10,000");
            }
        }
    }
    //Método para calcular intereses mensuales para cuentas de ahorro
    public void calcularIntereses(double porcentajeAnual){
        if(tipoCuenta.equals("ahorro")){
            double interesesMensuales = (this.saldo * porcentajeAnual) / 12;
            this.saldo += interesesMensuales;
        }
    }
    
}
