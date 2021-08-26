/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.Usuario;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public interface GestionUsuariosInt extends Remote {

    public boolean registrarUsuario(Usuario objUsuario)throws RemoteException;

    public Usuario verificarCredencial(String prmUsuario, String prmContrasena)throws RemoteException;
    
    public ArrayList<Usuario> listarUsuarios()throws RemoteException;
    
    public boolean actualizarUsuarios (Usuario usuario) throws  RemoteException;
}
