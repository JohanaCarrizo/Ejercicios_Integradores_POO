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
public class Instrumento {
    
    private int id;
    private static int contador = 1;
    private double precio;
    private TipoInstrumento tipoInstrumento;

    public Instrumento() {
    }

    public Instrumento(double precio, TipoInstrumento tipoInstrumento) {
      
        this.id = contador++;
        this.precio = precio;
        this.tipoInstrumento = tipoInstrumento;
    }

    public int getId(){
        return id;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoInstrumento getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(TipoInstrumento tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    
  
    public void mostrarDatosInstrumento(){
    
        System.out.println("ID --> "+id+" \nPrecio --> "+precio+" \nTipo --> "+tipoInstrumento+
                "\n*************************");
    
    }
    
}
