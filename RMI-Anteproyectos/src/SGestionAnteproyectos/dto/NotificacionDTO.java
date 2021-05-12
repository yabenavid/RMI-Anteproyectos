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
public class NotificacionDTO {
    private int codigoAnteproyecto;
    private String nombreEvaludor1;
    private String nombreEvaludor2;

    public NotificacionDTO() {
         this.codigoAnteproyecto = -1;
        this.nombreEvaludor1 = "";
        this.nombreEvaludor2 = "";
    }

    public NotificacionDTO(int codigoAnteproyecto, String nombreEvaludor1, String nombreEvaludor2) {
        this.codigoAnteproyecto = codigoAnteproyecto;
        this.nombreEvaludor1 = nombreEvaludor1;
        this.nombreEvaludor2 = nombreEvaludor2;
    }

    public int getCodigoAnteproyecto() {
        return codigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(int codigoAnteproyecto) {
        this.codigoAnteproyecto = codigoAnteproyecto;
    }

    public String getNombreEvaludor1() {
        return nombreEvaludor1;
    }

    public void setNombreEvaludor1(String nombreEvaludor1) {
        this.nombreEvaludor1 = nombreEvaludor1;
    }

    public String getNombreEvaludor2() {
        return nombreEvaludor2;
    }

    public void setNombreEvaludor2(String nombreEvaludor2) {
        this.nombreEvaludor2 = nombreEvaludor2;
    }

    
}
