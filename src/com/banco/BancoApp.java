
package com.banco;

public class BancoApp {
    public static void main(String[] args) {
        
        //Crear cliente con cuenta de ahorro
        Cliente cliente1 = new Cliente(1001, "ID-123","ahorro");
        System.out.println("Saldo inicial cuenta de ahorro: $ " + cliente1.getSaldo());
        
        //Realizar un depósito
        cliente1.depositar(2000);
        System.out.println("Saldo después del depósito: $" + cliente1.getSaldo());
        
        //Realizar un retiro
        cliente1.retirar(1500);
        System.out.println("Saldo después del retiro: $" + cliente1.getSaldo());
        
        //Calcular intereses mensuales para cuentas de ahorro
        cliente1.calcularIntereses(0.03);//3% de porcentaje de ahorro anual
        System.out.println("Saldo después de calcular intereses: $" + cliente1.getSaldo());
        
        
        //Crear un empleado
        Empleado empleado1 = new Empleado(3001, "Christian Fernando Rojas", "supervisor", 5);
        System.out.println("Dias de vacaciones para el empleado: " + empleado1.calcularDiasVacaciones());
        
        //Obtener el salario del empleado
        double salarioEmpleado1 = empleado1.obtenerSalario();
        System.out.println("Salario del empleado: $" + salarioEmpleado1);
    }
    
    
}
