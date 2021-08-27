/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;

import SSeguimientoAnteproyectos.dto.Resolucion;
import SSeguimientoAnteproyectos.utilidades.UtilidadesArchivosTxt;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author YENNYFER
 */
public class SeguimientoAnteproyectosImpl extends UnicastRemoteObject implements SeguimientoAnteproyectosInt {

    private static int numeroSecuencial1 = 1, numeroSecuencial2 = 0, numeroSecuencial3 = 0;
    private ArrayList<Integer> numerosResoluciones;
    
    public SeguimientoAnteproyectosImpl() throws RemoteException {
        super();
        this.numerosResoluciones = new ArrayList<>();
    }

    @Override
    public int solicitarCodigoResolucion() throws RemoteException {
        System.out.println("\n\n Invocando a solicitar código resolución");
        String cod;
        int resultado;
        cod =  numeroSecuencial3 +""+ numeroSecuencial2 +""+ numeroSecuencial1;
        // Actualizando la secuencia
        actualizarNumerosSecuenciales();
        resultado = Integer.parseInt(cod);
        return resultado;
    }

    private void actualizarNumerosSecuenciales() {
        if (numeroSecuencial1 == 9) {
            if (numeroSecuencial2 == 9) {
                if (numeroSecuencial3 == 9) {
                    numeroSecuencial1 = 0;
                    numeroSecuencial2 = 0;
                    numeroSecuencial3 = 0;
                } else {
                    numeroSecuencial2 = 0;
                    numeroSecuencial1 = 0;
                    numeroSecuencial3 = numeroSecuencial3 + 1;
                }
            } else {
                numeroSecuencial1 = 0;
                numeroSecuencial2 = numeroSecuencial2 + 1;
            }
        } else {
            numeroSecuencial1 = numeroSecuencial1 + 1;
        }
    }

    @Override
    public boolean almacenarFormatos(String formatos) throws RemoteException {
        System.out.println("\n\n Invocando a alamacenar Formatos");

        if (!formatos.isEmpty()) {
            UtilidadesArchivosTxt.escribirArchivo("historialTGI.txt", formatos);
            return true;
        }
        return false;
    }

    @Override
    public boolean almacenarResolucion(Resolucion objResolucion) throws RemoteException {
        System.out.println("\n\n Invocando a almacenar Resoluciones");
        if (objResolucion.getNumeroResolucion() > 0) {
            String resolucion = objResolucion.toString();
            UtilidadesArchivosTxt.escribirArchivo("listadoTGIAprobados.txt", resolucion);
            almacenarNumeroResolucion(objResolucion.getNumeroResolucion());
            return true;
        }
        return false;
    }

    @Override
    public void almacenarNumeroResolucion(int numeroResolucion) throws RemoteException {
        System.out.println("\n\n Invocando a almacenar número resoluciones");
        numerosResoluciones.add(numeroResolucion);      
    }
    
    @Override
    public boolean consultarNumerosResolucion(int numeroResolucion) throws RemoteException{
         System.out.println("\n\n Invocando a consultar número resoluciones");
         return  numerosResoluciones.stream().anyMatch(i -> (i==numeroResolucion));
    }
    
    @Override
    public String consultarFormatos() throws RemoteException {
        System.out.println("\n\n Invocando a consultar Formatos");
        String formatos = UtilidadesArchivosTxt.leerArchivo("historialTGI.txt");
        return formatos;
    }

    @Override
    public String consultarResoluciones() throws RemoteException {
        System.out.println("\n\n Invocando a consultar Resoluciones");
        String resoluciones = UtilidadesArchivosTxt.leerArchivo("listadoTGIAprobados.txt");
        return resoluciones;
    }

}
