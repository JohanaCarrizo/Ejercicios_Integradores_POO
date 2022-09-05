/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Posnet;
import Entidad.Ticket;

/**
 *
 * @author Johana
 */
public class ServiceTicket {
    
    Ticket ticket = new Ticket();
    ServiceTarjetaDeCredito st = new ServiceTarjetaDeCredito();

    public Ticket crearTicket(Posnet posnet) {

        ticket.setNomYApe(posnet.getTarjetaCredito().getTitular());
        ticket.setMontoTotal(st.calcularMontoFinal(posnet));
        ticket.setMontoPorCuota(st.calcularMontoPorCuota(posnet));
        
        return ticket;
    }

}
