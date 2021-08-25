/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;

import SSeguimientoAnteproyectos.dto.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
/**
 *
 * @author YENNYFER, YEFERSON
 */
public interface SeguimientoAnteproyectosInt extends Remote{
    
    public boolean almacenarFormatos(String formatos)throws RemoteException;
    public boolean almacenarResolucion(Resolucion objResolucion)throws RemoteException;
    
    public String consultarFormatos()throws RemoteException;
    public String consultarResoluciones()throws RemoteException;
    
}
