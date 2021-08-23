/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
import SGestionAnteproyectos.dto.NotificacionDTO;
/**
 *
 * @author YENNYFER
 */
public interface NotificacionInt extends Remote{
    public String enviarNotificacion(NotificacionDTO objNotificacion) throws RemoteException;
}
