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
public class Sucursal {

    private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void listarInstrumentos() {

        for (Instrumento instrumento : instrumentos) {

            instrumento.mostrarDatosInstrumento();

        }

    }

    public void agregarIntrumento(Instrumento i) {

        instrumentos.add(i);

    }

    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo) {

        ArrayList<Instrumento> iEncontrados = new ArrayList();
        for (Instrumento i : instrumentos) {

            if (i.getTipoInstrumento() == tipo) {

                iEncontrados.add(i);

            }
        }

        return iEncontrados;
    }

    public void borrarInstrumento(int idI) {

        Instrumento iBorrar = buscarInstrumento(idI);

        instrumentos.remove(iBorrar);
    }

    private Instrumento buscarInstrumento(int idI) {

        for (Instrumento instrumento : instrumentos) {

            if (instrumento.getId() == idI) {

                return instrumento;
            }

        }
        return null;
    }
    
    public double PorcInstrumentoPorTipo(TipoInstrumento tipo){
    
        ArrayList<Instrumento> iEncontrados = new ArrayList();
        iEncontrados.addAll(instrumentoPorTipo(tipo));
        
        return (iEncontrados.size() * 100) / instrumentos.size();
    
    }

}
