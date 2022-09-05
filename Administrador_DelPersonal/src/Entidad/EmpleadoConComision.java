/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Johana
 */
public class EmpleadoConComision extends Empleado {
    
    private double salarioMin;
    private int clienteCaptado;
    private double montoPorCliente;

    public EmpleadoConComision() {
    }
    
    public EmpleadoConComision(int dni, String nombre, String apellido, int anioIngreso, double salarioMin, int clienteCaptado, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMin = salarioMin;
        this.clienteCaptado = clienteCaptado;
        this.montoPorCliente = montoPorCliente;
    }


    @Override
    public void mostrarSalario() {
        
        System.out.println("Salario --> "+getSalario()+" \n**************************");
        
    }

    @Override
    public double getSalario() {
        
        double aux = clienteCaptado * montoPorCliente;
        
        return aux < salarioMin ? salarioMin : aux;
    }
    
    @Override
    public int empleadoConMasClientes(){
    
        return clienteCaptado;
    
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    
    
    
    
}
