/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosInt;
import SSeguimientoAnteproyectos.dto.FormatoTIA;
import cliente.presentacion.jfrIniciarSesion;
import cliente.presentacion.jfrmVistaInicial;

/**
 *
 * @author ANDRES BENAVIDEZ, YENNYFER
 */
public class Cliente {
    	private static GestionAnteproyectosInt objRemotoAnteproyecto;
        private static FormatoTIA objAnteproyecto;
    
	public static void main(String args[]){
		//if (System.getSecurityManager()==null)
		//{
		//	System.setSecurityManager(new RMISecurityManager());
		//}

        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";

            jfrmVistaInicial vistaInicicial =  new jfrmVistaInicial();
            vistaInicicial.setVisible(true);
        
//        System.out.println("Cual es la direccion ip donde se encuentra el rmiregistry ");
//        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
//        System.out.println("Cual es el numero del puerto por el cual escucha el rmiregistry ");
//        numPuertoRMIRegistry = UtilidadesConsola.leerEntero();
//        
//        objRemotoAnteproyecto = (GestionAnteproyectosInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry, "ObjetoRemotoAnteproyecto");
//        //menuPrincipal();
}
}
