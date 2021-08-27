/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import SGestionAnteproyectos.dto.NotificacionDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class NotificacionImpl extends UnicastRemoteObject implements NotificacionInt {

    public NotificacionImpl() throws RemoteException {
        super();
    }

    @Override
    public String enviarNotificacion(NotificacionDTO objNotificacion) throws RemoteException {
        System.out.println("");
        System.out.println("** Desde enviarNotificacion() ... ");
        String msg = "El anteproyecto con codigo: " + objNotificacion.getCodigoAnteproyecto() + " ha sido aprobado por los evaluadores: "
                + objNotificacion.getNombreEvaludor1() + " " + objNotificacion.getNombreEvaludor2();
        JOptionPane.showMessageDialog(null, msg, "Avertencia", JOptionPane.INFORMATION_MESSAGE);  
    
        return msg;
    }
}
