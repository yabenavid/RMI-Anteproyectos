/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.dto;

/**
 *
 * @author YENNYFER
 */
public class Mensaje {
    private int identificacionDirector;
    private String mensaje;

    public Mensaje() {
        this.identificacionDirector =-1;
        mensaje = "";
    }

    public Mensaje(int identificacionDirector, String mensaje) {
        this.identificacionDirector = identificacionDirector;
        this.mensaje = mensaje;
    }

    public int getIdentificacionDirector() {
        return identificacionDirector;
    }

    public void setIdentificacionDirector(int identificacionDirector) {
        this.identificacionDirector = identificacionDirector;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
