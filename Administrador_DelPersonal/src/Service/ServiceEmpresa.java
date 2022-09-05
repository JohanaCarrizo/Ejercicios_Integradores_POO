/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.EmpleadoConComision;
import Entidad.EmpleadoSalarioFijo;
import Entidad.Empresa;

/**
 *
 * @author Johana
 */
public class ServiceEmpresa {
    
    Empresa empresa = new Empresa();
    
    public void crearEmpleado(){
    
        
        empresa.guardarEmpleado(new EmpleadoConComision(123456, "Javier", "Cordoba", 4, 45000, 20, 1500));
        empresa.guardarEmpleado(new EmpleadoConComision(321987, "José", "Rodriguez", 1, 25000, 8, 800));
        empresa.guardarEmpleado(new EmpleadoConComision(159753, "Silvia", "Juarez", 6, 53000, 30, 2500));
        
        
        empresa.guardarEmpleado(new EmpleadoSalarioFijo(456951, "Mariela", "Bustamante", 2, 30500));
        empresa.guardarEmpleado(new EmpleadoSalarioFijo(948624, "Hector", "Carrizo", 7, 55000));
        empresa.guardarEmpleado(new EmpleadoSalarioFijo(203950, "Jasmin", "Burela", 5, 48500));
    
    }
    
    public void mostrarSalario(){
    
        empresa.mostrarSalario();
    
    }
    
    public void empleadoConMasClientes(){
    
        empresa.empleadoConMasClientes();
    
    }
    
}
