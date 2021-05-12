/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosImpl;
import SGestionAnteproyectos.utilidades.UtilidadesConsola;
import SGestionAnteproyectos.utilidades.UtilidadesRegistroS;
import java.rmi.RemoteException;

/**
 *
 * @author ANDRES BENAVIDEZ,YENNYFER
 */
public class Servidor1 {
    	public static void main(String args[]) throws RemoteException
        {
        int numPuertoNS;
        String direccionIpNS;

        System.out.println("Cual es el la direccion ip donde se encuentra  el N_S");
        direccionIpNS = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el numero de puerto por el cual escucha el N_S");
        numPuertoNS = UtilidadesConsola.leerEntero();

        GestionAnteproyectosImpl objRemoto = new GestionAnteproyectosImpl();
        objRemoto.consultarReferenciaRemota(direccionIpNS, numPuertoNS);

        try
        {
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionIpNS, numPuertoNS, "ObjetoRemotoAnteproyecto");
        }catch (Exception e){
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        }
    }
}
