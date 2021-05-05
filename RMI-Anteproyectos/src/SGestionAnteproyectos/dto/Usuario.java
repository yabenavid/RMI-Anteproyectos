/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class Usuario {
    private int id;
    private String nombre;
    private RolEnum rol;
    private String departamento;
    private String usuario;
    private String contrasena;

    public Usuario() {
        this.id = -1;
        this.nombre = "";
        this.departamento = "";
        this.usuario = "";
        this.contrasena = "";
    }
    public Usuario(int id, String nombre, RolEnum rol, String departamento, String usuario, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.departamento = departamento;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RolEnum getRol() {
        return rol;
    }

    public void setRol(RolEnum rol) {
        this.rol = rol;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
