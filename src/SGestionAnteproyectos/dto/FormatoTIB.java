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
public class FormatoTIB implements Serializable {
    private int codigoAnteproyecto;
    private int concepto;
    private String observaciones;
    private String fechaEvaluacion;
    private String nombreEvaluador;
    private int identificacionEvaluador;

    public FormatoTIB() {
        this.codigoAnteproyecto = -1;
        this.concepto = -1;
        this.observaciones = "";
        this.fechaEvaluacion = "";
        this.nombreEvaluador = "";
        this.identificacionEvaluador = -1;
    }
    
    public FormatoTIB(int codigoAnteproyecto, int concepto, String observaciones, String fechaEvaluacion, String nombreEvaluador) {
        this.codigoAnteproyecto = codigoAnteproyecto;
        this.concepto = concepto;
        this.observaciones = observaciones;
        this.fechaEvaluacion = fechaEvaluacion;
        this.nombreEvaluador = nombreEvaluador;
    }

    public int getCodigoAnteproyecto() {
        return codigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(int codigoAnteproyecto) {
        this.codigoAnteproyecto = codigoAnteproyecto;
    }

    public int getConcepto() {
        return concepto;
    }

    public void setConcepto(int concepto) {
        this.concepto = concepto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(String fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public String getNombreEvaluador() {
        return nombreEvaluador;
    }

    public void setNombreEvaluador(String nombreEvaluador) {
        this.nombreEvaluador = nombreEvaluador;
    }

    public int getIdentificacionEvaluador() {
        return identificacionEvaluador;
    }

    public void setIdentificacionEvaluador(int identificacionEvaluador) {
        this.identificacionEvaluador = identificacionEvaluador;
    }

    @Override
    public String toString() {
        return "FormatoTIB{" + "codigoAnteproyecto=" + codigoAnteproyecto + ", concepto=" + concepto + ", observaciones=" + observaciones + ", fechaEvaluacion=" + fechaEvaluacion + ", nombreEvaluador=" + nombreEvaluador + ", identificacionEvaluador=" + identificacionEvaluador + '}';
    }
    
    
    
}
