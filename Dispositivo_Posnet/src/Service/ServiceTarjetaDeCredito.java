/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Posnet;
import Entidad.TarjetaDeCredito;
import Entidad.TipoTarjeta;
import Entidad.Titular;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServiceTarjetaDeCredito {
    
    TarjetaDeCredito tarjetaCredito = new TarjetaDeCredito();
    
    public TarjetaDeCredito crearTarjetaDeCredito(){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione la tarjeta a utilizar: \n1)"+tarjetaCredito.getEntidadFinanciera().VISA.name()+" \n2)"+tarjetaCredito.getEntidadFinanciera().MASTERCARD.name());
        int opcion = leer.nextInt();
        switch(opcion){
        
            case 1:
                tarjetaCredito.setEntidadFinanciera(TipoTarjeta.VISA);
                tarjetaCredito.setEntidadBancaria("Hipotecario");
                tarjetaCredito.setNumeroTarjeta(213456789);
                tarjetaCredito.setTitular(new Titular(45678911, "Victor", "Crud", 4561232, "VCrud@gmail.com"));
                tarjetaCredito.setSaldoDisponible(15000);
                break;
                
            case 2:
                tarjetaCredito.setEntidadFinanciera(TipoTarjeta.MASTERCARD);
                tarjetaCredito.setEntidadBancaria("Banco Galicia");
                tarjetaCredito.setNumeroTarjeta(987654321);
                tarjetaCredito.setTitular(new Titular(45678911, "Roxana", "Suarez", 4561232, "RoSu@gmail.com"));
                tarjetaCredito.setSaldoDisponible(15000);
                break;
        }        
        return tarjetaCredito;
    }
    
    public double calcularMontoFinal(Posnet posnet){
    
        double montoFinal = posnet.getMontoAbonar();
        switch(posnet.getCantCuotas()){
            
            case 1:
                montoFinal = posnet.getMontoAbonar();
                break;
                
            case 2:
                montoFinal += posnet.getMontoAbonar() * 0.03;
                break;
                
            case 3:
                montoFinal += posnet.getMontoAbonar() * 0.06;
                break;
                
            case 4:
                montoFinal += posnet.getMontoAbonar() * 0.09;
                break;
                
            case 5:
                montoFinal += posnet.getMontoAbonar() * 0.12;
                break;
                
            case 6:
                montoFinal += posnet.getMontoAbonar() * 0.15;
                break;
        }
        return montoFinal;
    }
    
    public boolean tieneSaldo(Posnet posnet){
        
        return calcularMontoFinal(posnet) <= posnet.getTarjetaCredito().getSaldoDisponible();
        
    }
    
    public double calcularMontoPorCuota(Posnet posnet){
    
        return calcularMontoFinal(posnet) / posnet.getCantCuotas();
    }
    
    
}
