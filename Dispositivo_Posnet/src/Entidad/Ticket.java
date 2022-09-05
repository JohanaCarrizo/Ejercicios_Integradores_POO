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
public class Ticket {
    
    private Titular nomYApe;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket() {
    }

    public Ticket(Titular nomYApe, double montoTotal, double montoPorCuota) {
        this.nomYApe = nomYApe;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    public Titular getNomYApe() {
        return nomYApe;
    }

    public void setNomYApe(Titular nomYApe) {
        this.nomYApe = nomYApe;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }
    
    public void mostrarDatosTicket(){
    
        System.out.println("*****************************************************");
        System.out.println("Nombre y Apellido del titular --> "+nomYApe.getNombre()+" "+nomYApe.getApellido()+
                " \nMonto total a pagar --> "+montoTotal+
                " \nMonto de cada cuota --> "+montoPorCuota);
        
    }
    
}
