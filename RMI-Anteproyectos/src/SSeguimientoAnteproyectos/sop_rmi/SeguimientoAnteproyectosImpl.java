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
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/**
 *
 * @author YENNYFER
 */
public class SeguimientoAnteproyectosImpl extends UnicastRemoteObject implements SeguimientoAnteproyectosInt{

    public SeguimientoAnteproyectosImpl() throws RemoteException{
        
    }
    
    @Override
    public boolean almacenarFormatoTIA(FormatoTIA objFormatoTIA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean almacenarFormatoTIB(FormatoTIB objFormatoTIB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean almacenarFormatoTIC(FormatoTIC objFormatoTIC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean almacenarResolucion(Resolucion objResolucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarFormatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarResoluciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
