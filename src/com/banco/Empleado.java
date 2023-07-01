
package com.banco;

//Clase Empleado
public class Empleado {
    private int numeroEmpleado;
    private String nombre;
    private String puesto;
    private int antiguedad;

    public Empleado(int numeroEmpleado, String nombre, String puesto, int antiguedad) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.antiguedad = antiguedad;
    }
    
    //Método para calcular los días de vacaciones al año
    public int calcularDiasVacaciones(){
        int diasVacaciones = 5; //Se otorgan 5 dias por el primer año
        
        //Se aumentan 2 días  por cada año cumplido hasta llegar al máximo de 20 días
        if(antiguedad > 1){
            diasVacaciones += (antiguedad - 1) * 2;
            if(diasVacaciones > 20){
                diasVacaciones = 20;
            }
        }
        return diasVacaciones;
    }
    //Método para obtener el salario del empleado según su puesto 
    public double obtenerSalario(){
        double salario = 0;
        
        //Definir los salarios según el puesto del empleado 
        switch(puesto){
            case "cajero":
                salario = 30000;
                break;
            case "supervisor":
                salario = 45000;
                break;
            case "recepcionista":
                salario = 25000;
                break;
            //Agregar otros puestos y sus salarios según sea necesario  
            default:
                System.out.println("Puesto no reconocido");
        }
        return salario;
    }
}
