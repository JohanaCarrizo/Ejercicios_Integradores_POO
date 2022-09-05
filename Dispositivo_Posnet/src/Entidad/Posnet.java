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
public class Posnet {
    
    private TarjetaDeCredito tarjetaCredito;
    private double montoAbonar;
    private int cantCuotas;

    public Posnet() {
    }

    public Posnet(TarjetaDeCredito tarjetaCredito, double montoAbonar, int cantCuotas) {
        this.tarjetaCredito = tarjetaCredito;
        this.montoAbonar = montoAbonar;
        this.cantCuotas = cantCuotas;
    }

    public TarjetaDeCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaDeCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public double getMontoAbonar() {
        return montoAbonar;
    }

    public void setMontoAbonar(double montoAbonar) {
        this.montoAbonar = montoAbonar;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }
    
    
    
    
}
