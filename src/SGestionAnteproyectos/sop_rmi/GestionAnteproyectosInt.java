/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.*;
import cliente.sop_rmi.NotificacionInt;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author YENNYFER,  YEFERSON
 */
public interface GestionAnteproyectosInt extends Remote{
    
    public int solicitarCodigoAnteproyectos() throws RemoteException;

    public boolean remitirFormatoTIA(FormatoTIA objFormatoTIA) throws RemoteException;
    public boolean remitirFormatoTIB(FormatoTIB objFormatoTIB) throws RemoteException;
    public boolean remitirFormatoTIC(FormatoTIC objFormatoTIC) throws RemoteException;
    public boolean remitirFormatoTID(FormatoTID objFormatoTID) throws RemoteException;
    
    public ArrayList<Integer> consultarConceptos(int prmCodAnteproyecto)throws RemoteException;
        
    public ArrayList<FormatoTIA> consultarFormatosTIA() throws RemoteException;
    public ArrayList<FormatoTIB> consultarFormatosTIB() throws RemoteException;
    public ArrayList<FormatoTIC> consultarFormatosTIC() throws RemoteException;
    public ArrayList<FormatoTID> consultarFormatosTID() throws RemoteException;

    
    public boolean asignarEvaluador (int codigoAnteproyecto, int identificacionEvaluador)throws  RemoteException;
    
    public void registrarCallback (NotificacionInt objNotificacionInt) throws RemoteException;
    
    public void hacerCallback (int codigoAnteproyecto, String evaluador1, String evaluador2) throws  RemoteException;
}
