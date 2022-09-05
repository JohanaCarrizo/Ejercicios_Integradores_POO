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
public class EmpleadoSalarioFijo extends Empleado {

    private double salarioBasico;
    private static double porcentaje1 = 0.05;
    private static double porcentaje2 = 0.1;

    public EmpleadoSalarioFijo() {
    }

    
    public EmpleadoSalarioFijo(int dni, String nombre, String apellido, int anioIngreso, double salarioBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioBasico = salarioBasico;
    }
    

    @Override
    public void mostrarSalario() {

        System.out.println("Salario --> "+getSalario()+" \n*************************");
        
    }

    @Override
    public int antiguedad() {
        return super.antiguedad();
    }    
    

    @Override
    public double getSalario() {
        
        if (antiguedad() < 2) {
            
            salarioBasico = salarioBasico;
            
        } else if (antiguedad() >= 2 && antiguedad() <= 5) {
            
            salarioBasico += salarioBasico * porcentaje1;
            
        } else if (antiguedad() > 5) {
            
            salarioBasico += salarioBasico * porcentaje2;
        }
        
        return salarioBasico;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    
    
    

}
