/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.dto;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class Resolucion {
    
    private int numeroResolucion;
    private String fechaRegistro;
    private int codigoAnteproyecto;
    
    public Resolucion(){
        this.numeroResolucion = -1;
        this.fechaRegistro = "";
        this.codigoAnteproyecto = -1;
    }

    public Resolucion(int numero, String fechaRegistro, int codigoAnteproyecto) {
        this.numeroResolucion = numero;
        this.fechaRegistro = fechaRegistro;
        this.codigoAnteproyecto = codigoAnteproyecto;
    }

    public int getNumeroResolucion() {
        return numeroResolucion;
    }

    public void setNumeroResolucion(int numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCodigoAnteproyecto() {
        return codigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(int codigoAnteproyecto) {
        this.codigoAnteproyecto = codigoAnteproyecto;
    }
    
}
