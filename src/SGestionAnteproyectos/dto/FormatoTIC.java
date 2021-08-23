/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class FormatoTIC implements Serializable{
    private int codigoAnteproyecto;
    private boolean estructura;
    private int conceptoDepto;
    private String Observaciones;

    public FormatoTIC() {
        this.codigoAnteproyecto = -1;
        this.estructura = false;
        this.conceptoDepto = -1;
        this.Observaciones = "";
    }

    public FormatoTIC(int codigoAnteproyecto, boolean estructura, int conceptoDepto, String Observaciones) {
        this.codigoAnteproyecto = codigoAnteproyecto;
        this.estructura = estructura;
        this.conceptoDepto = conceptoDepto;
        this.Observaciones = Observaciones;
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

    public int getConceptoDepto() {
        return conceptoDepto;
    }

    public void setConceptoDepto(int conceptoDepto) {
        this.conceptoDepto = conceptoDepto;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
    
}
