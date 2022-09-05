/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Johana
 */
public class Empresa {

    ArrayList<Empleado> empleados;

    public Empresa() {

        this.empleados = new ArrayList();
    }

    public void guardarEmpleado(Empleado emp) {

        empleados.add(emp);

    }

    public void mostrarSalario() {

        for (Empleado empleado : empleados) {

            empleado.mostrarDatos();
            empleado.mostrarSalario();

        }
    }

    public void empleadoConMasClientes() {

        int mayor = 0;
        Empleado empAux = null;

        for (Empleado empleado : empleados) {

            if (empleado.empleadoConMasClientes() > mayor) {

                mayor = empleado.empleadoConMasClientes();
                empAux = empleado;
            }
        }
        System.out.println("Empleado/a con mayor clientes");
        empAux.mostrarDatos();
    }

}
