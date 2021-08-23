/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class FormatoTID implements Serializable{
    private int codigoAnteproyecto;
    private boolean estructura;
    private int conceptoComite;
    private String observaciones;
    
    public FormatoTID() {
        this.codigoAnteproyecto = -1;
        this.estructura = false;
        this.conceptoComite = -1;
        this.observaciones = "";
    }

    public FormatoTID(int codigoAnteproyecto, boolean estructura, int conceptoComite, String observaciones) {
        this.codigoAnteproyecto = codigoAnteproyecto;
        this.estructura = estructura;
        this.conceptoComite = conceptoComite;
        this.observaciones = observaciones;
    }

    public int getCodigoAnteproyecto() {
        return codigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(int codigoAnteproyecto) {
        this.codigoAnteproyecto = codigoAnteproyecto;
    }

    public boolean getEstructura() {
        return estructura;
    }

    public void setEstructura(boolean estructura) {
        this.estructura = estructura;
    }

    public int getConceptoComite() {
        return conceptoComite;
    }

    public void setConceptoComite(int conceptoComite) {
        this.conceptoComite = conceptoComite;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
