/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;

import SSeguimientoAnteproyectos.dto.FormatoTIA;
import SSeguimientoAnteproyectos.dto.FormatoTIB;
import SSeguimientoAnteproyectos.dto.FormatoTIC;
import SSeguimientoAnteproyectos.dto.Resolucion;
import SSeguimientoAnteproyectos.utilidades.UtilidadesArchivosTxt;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


/**
 *
 * @author YENNYFER
 */
public class SeguimientoAnteproyectosImpl extends UnicastRemoteObject implements SeguimientoAnteproyectosInt{

    public SeguimientoAnteproyectosImpl() throws RemoteException{
        super();
    }

   @Override
      public boolean almacenarFormatos(FormatoTIA objFormatoTIA,FormatoTIB objFormatoTIB,FormatoTIC objFormatoTIC) throws RemoteException{
          System.out.println("\n\n Invocando a alamacenar Formatos");
          if(objFormatoTIA.getCodigoAnteproyecto() >0 && objFormatoTIB.getCodigoAnteproyecto() >0 && objFormatoTIC.getCodigoAnteproyecto()>0){
              String formatos = objFormatoTIA.toString() +"\n\n" + objFormatoTIB.toString()+"\n\n"+objFormatoTIC.toString()+"\n\n";
              UtilidadesArchivosTxt.escribirArchivo("historialTGI.txt",formatos);
              return true;
          }
          return false;
      }
    @Override
    public boolean almacenarResolucion(Resolucion objResolucion) throws RemoteException{
         System.out.println("\n\n Invocando a almacenar Resoluciones");  
         if(objResolucion.getNumeroResolucion()>0){
              String resolucion = objResolucion.toString();
              UtilidadesArchivosTxt.escribirArchivo("listadoTGIAprobados.txt",resolucion);
              return true;
          }
          return false;
    }

    @Override
    public String consultarFormatos() throws RemoteException{
        System.out.println("\n\n Invocando a consultar Formatos");  
        String formatos = UtilidadesArchivosTxt.leerArchivo("historialTGI.txt");
        return formatos;
    }

    @Override
    public String consultarResoluciones() throws RemoteException{
        System.out.println("\n\n Invocando a consultar Resoluciones");  
        String resoluciones = UtilidadesArchivosTxt.leerArchivo("listadoTGIAprobados.txt");
        return resoluciones;
    }
    

    
    
}
