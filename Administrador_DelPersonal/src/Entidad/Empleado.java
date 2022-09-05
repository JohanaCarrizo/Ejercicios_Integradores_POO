/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author Johana
 */
public abstract class Empleado {
    
    private int dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado() {
    }

    
    public Empleado(int dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    } 
    
    public abstract void mostrarSalario();
    
    public abstract double getSalario();
    
    public int antiguedad(){
    
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioIngreso;
    }
    
    public int empleadoConMasClientes(){
    
        return 0;
    
    }
    
    public void mostrarDatos(){
    
        System.out.println(nombre+" "+apellido);
        
    }
    
}
