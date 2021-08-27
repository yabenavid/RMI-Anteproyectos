/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import SGestionAnteproyectos.dto.NotificacionDTO;
import cliente.dto.Mensaje;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class NotificacionImpl extends UnicastRemoteObject implements NotificacionInt {
    
    public String msg="";
    private ArrayList<Mensaje> mensajes;
    
    public NotificacionImpl() throws RemoteException {
        super();
        mensajes = new ArrayList<>();
    }

    @Override
    public String enviarNotificacion(NotificacionDTO objNotificacion, int identificacionDirector) throws RemoteException {
        System.out.println("");
        System.out.println("** Desde enviarNotificacion() ... ");
        msg = "El anteproyecto con codigo: " + objNotificacion.getCodigoAnteproyecto() + " ha sido aprobado por los evaluadores: "
                + objNotificacion.getNombreEvaludor1() + " " + objNotificacion.getNombreEvaludor2();
   
        Mensaje mensaje = new Mensaje();
        mensaje.setIdentificacionDirector(identificacionDirector);
        mensaje.setMensaje(msg);
        almacenarMensajes(mensaje);
        
        return msg;
    }
    @Override
    public ArrayList<String> consultarMensaje(int identificacionDirector)throws RemoteException{
        System.out.println("** Desde consultarMensaje() ... ");
        ArrayList<String> varMensaje = new ArrayList<>();
            
        for (int i = 0; i < mensajes.size(); i++) {
            if (mensajes.get(i).getIdentificacionDirector() == identificacionDirector) {
                varMensaje.add(mensajes.get(i).getMensaje());
               // mensajes.remove(i);
            }
        
        }
            
        return varMensaje;
    }
    @Override
    public void almacenarMensajes(Mensaje mensaje) throws RemoteException{
        System.out.println("** Desde almacenarMensajes() ... ");
        mensajes.add(mensaje);      
    }
    
}
