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
public class Fabrica {
    
    private ArrayList<Sucursal> sucursales;
    
    public Fabrica() {
        
        this.sucursales = new ArrayList();
    }
    
    public void agregarSucursal(Sucursal sucursal) {
        
        sucursales.add(sucursal);
        
    }
    
    public void listarInstrumento() {
        
        for (Sucursal su : sucursales) {
            
            System.out.println(su.getNombre());
            su.listarInstrumentos();
            
        }
        
    }
    
    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo) {
        
        ArrayList<Instrumento> iEncontrados = new ArrayList();
        for (Sucursal su : sucursales) {
            
            iEncontrados.addAll(su.instrumentoPorTipo(tipo));            
            
        }
        return iEncontrados;
    }
    
    public void borrarInstrumento(int idI){
    
        for (Sucursal su : sucursales) {
            
             su.borrarInstrumento(idI);
            
        }    
    
    }
    
    public void PorcInstrumentoPorTipo(TipoInstrumento tipo){
    
         for (Sucursal su : sucursales) {
            
             System.out.println("Porcentaje de "+su.getNombre()+" --> "+su.PorcInstrumentoPorTipo(tipo));
            
        }   
    
    }
   
    
}
