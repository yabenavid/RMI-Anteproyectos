/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.Usuario;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class GestionUsuariosImpl extends UnicastRemoteObject implements GestionUsuariosInt {

    private final ArrayList<Usuario> usuarios;

    public GestionUsuariosImpl() throws RemoteException{
        super();
        this.usuarios = new ArrayList<>();
    }

    @Override
    public boolean registrarUsuario(Usuario objUsuario) throws RemoteException{
        System.out.println("\n\n Invocando a registrar usuario");
        if (objUsuario.getId() > 0) {
            usuarios.add(objUsuario);
            System.out.println("Usuario registrado exitosamente");
            return true;
        } else {
            System.out.println("Usuario no registrado");
            return false;
        }
    }

    @Override
    public Usuario verificarCredencial(String prmUsuario, String prmContrasena) throws RemoteException{
        System.out.println("\n\n Invocando a verificar credencial");
        Usuario objUsuario = new Usuario();
        if (usuarios.size() > 0) {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getUsuario().compareTo(prmUsuario) == 0
                        && usuarios.get(i).getContrasena().compareTo(prmContrasena) == 0){
                    System.out.println("\nCredencial encontrada");
                    objUsuario = usuarios.get(i);
                    break;
                }
            }
        } else {
            System.out.println("\nNo existen usuarios registrados");
        }
        return objUsuario;
    }
    @Override
    public ArrayList<Usuario> listarUsuarios()throws RemoteException{
        return usuarios;
    }

}
