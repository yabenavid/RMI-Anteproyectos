/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos;

import SSeguimientoAnteproyectos.sop_rmi.SeguimientoAnteproyectosInt;
import SSeguimientoAnteproyectos.sop_rmi.SeguimientoAnteproyectosImpl;
import java.rmi.RemoteException;
import SSeguimientoAnteproyectos.utilidades.UtilidadesConsola;
import SSeguimientoAnteproyectos.utilidades.UtilidadesRegistroS;

 /*
 * @author YEFERSON, YENNYFER
 */

public class Servidor2 {
    public static void main(String args[]) throws RemoteException{
        int numPuertoNS = 0;
        String direccionNS = "";

        System.out.println("Cual es el la direccion ip donde se encuentra  el n_s");
        direccionNS = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el numero de puerto por el cual escucha el n_s");
        numPuertoNS = UtilidadesConsola.leerEntero();

        SeguimientoAnteproyectosInt objRemotoNotificacion = new SeguimientoAnteproyectosImpl();

        try
        {
           UtilidadesRegistroS.arrancarNS(numPuertoNS);
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoNotificacion, direccionNS, numPuertoNS, "ObjetoRemotoSeguimiento");
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        }
    }
}
