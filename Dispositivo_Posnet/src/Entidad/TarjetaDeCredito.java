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
public class TarjetaDeCredito {
    
    private TipoTarjeta entidadFinanciera;
    private String entidadBancaria;
    private int numeroTarjeta;
    private double saldoDisponible;
    private Titular titular;

    public TarjetaDeCredito() {
    }

    public TarjetaDeCredito(TipoTarjeta entidadFinanciera, String entidadBancaria, int numeroTarjeta, double saldoDisponible, Titular titular) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }

    public TipoTarjeta getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public void setEntidadFinanciera(TipoTarjeta entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    
    
}
