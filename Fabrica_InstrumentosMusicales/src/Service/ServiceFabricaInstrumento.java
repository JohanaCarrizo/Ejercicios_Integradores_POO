/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Fabrica;
import Entidad.Instrumento;
import Entidad.Sucursal;
import Entidad.TipoInstrumento;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServiceFabricaInstrumento {

    Scanner leer = new Scanner(System.in);
    Fabrica fabrica = new Fabrica();

    public void menu() {

        boolean appInicia = true;
        System.out.println("Bienvenido a la fabrica de instrumentos musicales");
        do {
            System.out.println("Por favor, selecciones la operación a realizar: "
                    + "\n1) Listar instrumentos "
                    + "\n2) Filtra instrumento por tipo "
                    + "\n3) Eliminar instrumento "
                    + "\n4) Porcenaje de instrumento por tipo"
                    + "\n5) Salir del programa");

            int op = leer.nextInt();

            switch (op) {

                case 1:
                    listarInstrumento();
                    break;

                case 2:
                    InstrumentoPorTipo();
                    break;

                case 3:
                    borrarInstrumento();
                    break;

                case 4:
                    PorcInstrumentoPorTipo();
                    break;

                case 5:
                    appInicia = false;
                    break;
            }

        } while (appInicia);

    }

    public void guardarFabrica() {

        Sucursal sucursal1 = new Sucursal("Sucursal A");

        sucursal1.agregarIntrumento(new Instrumento(32000, TipoInstrumento.CUERDA));
        sucursal1.agregarIntrumento(new Instrumento(50000, TipoInstrumento.CUERDA));
        sucursal1.agregarIntrumento(new Instrumento(62000, TipoInstrumento.PERCUSION));
        sucursal1.agregarIntrumento(new Instrumento(95000, TipoInstrumento.PERCUSION));
        sucursal1.agregarIntrumento(new Instrumento(73000, TipoInstrumento.VIENTO));

        Sucursal sucursal2 = new Sucursal("Sucursal B");

        sucursal2.agregarIntrumento(new Instrumento(32000, TipoInstrumento.CUERDA));
        sucursal2.agregarIntrumento(new Instrumento(50000, TipoInstrumento.PERCUSION));
        sucursal2.agregarIntrumento(new Instrumento(62000, TipoInstrumento.PERCUSION));
        sucursal2.agregarIntrumento(new Instrumento(95000, TipoInstrumento.VIENTO));
        sucursal2.agregarIntrumento(new Instrumento(73000, TipoInstrumento.VIENTO));

        fabrica.agregarSucursal(sucursal1);
        fabrica.agregarSucursal(sucursal2);

    }

    private void listarInstrumento() {

        fabrica.listarInstrumento();

    }

    private void InstrumentoPorTipo() {

        ArrayList<Instrumento> iEncontrados = new ArrayList();
        System.out.println("Seleccione el tipo de instrumento a buscar: \n1)" + TipoInstrumento.VIENTO.name()
                + " \n2)" + TipoInstrumento.CUERDA.name() + " \n3)" + TipoInstrumento.PERCUSION.name());

        switch (leer.nextInt()) {

            case 1:
                iEncontrados.addAll(fabrica.instrumentoPorTipo(TipoInstrumento.VIENTO));
                break;

            case 2:
                iEncontrados.addAll(fabrica.instrumentoPorTipo(TipoInstrumento.CUERDA));
                break;

            case 3:
                iEncontrados.addAll(fabrica.instrumentoPorTipo(TipoInstrumento.PERCUSION));
                break;

        }

        for (Instrumento iEncontrado : iEncontrados) {

            iEncontrado.mostrarDatosInstrumento();

        }

    }

    private void borrarInstrumento() {

        System.out.print("Ingrese el ID del instrumento a eliminar: ");
        fabrica.borrarInstrumento(leer.nextInt());

    }

    private void PorcInstrumentoPorTipo() {

        System.out.println("Seleccione el tipo de instrumento a buscar: \n1)" + TipoInstrumento.VIENTO.name()
                + " \n2)" + TipoInstrumento.CUERDA.name() + " \n3)" + TipoInstrumento.PERCUSION.name());

        switch (leer.nextInt()) {

            case 1:
                fabrica.PorcInstrumentoPorTipo(TipoInstrumento.VIENTO);
                break;

            case 2:
                fabrica.PorcInstrumentoPorTipo(TipoInstrumento.CUERDA);
                break;

            case 3:
                fabrica.PorcInstrumentoPorTipo(TipoInstrumento.PERCUSION);
                break;

        }

    }

}
