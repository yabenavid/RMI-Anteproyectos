/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author YENNYFER,YEFERSON
 */
public class FormatoTIA implements Serializable {
    private int codigoAnteproyecto;
    private String nombrePrograma;
    private String tituloAnteproyecto;
    private String nombreEstudiante1;
    private int codigoEstudiante1;
    private String nombreEstudiante2;
    private int codigoEstudiante2;
    private String nombredirector;
    private String nombreCoDirector;
    private String obetivosAnteproyecto;
    private int identificacionEvaluador1;
    private int identificacionEvaluador2;
    private int idDirector;


    public FormatoTIA() {   
        this.codigoAnteproyecto = -1;
        this.nombrePrograma = "";
        this.tituloAnteproyecto = "";
        this.nombreEstudiante1 = "";
        this.codigoEstudiante1 = -1;
        this.nombreEstudiante2 = "";
        this.codigoEstudiante2 = -1;
        this.nombredirector = "";
        this.nombreCoDirector = "";
        this.obetivosAnteproyecto = "";
        this.identificacionEvaluador1 = 0;
        this.identificacionEvaluador2 = 0;
        this.idDirector = -1;
      
    }

    public FormatoTIA(int codigoAnteproyecto, String nombrePrograma, String tituloAnteproyecto, String nombreEstudiante1, int codigoEstudiante1, String nombreEstudiante2, int codigoEstudiante2, String nombredirector, String nombreCoDirector, String obetivosAnteproyecto) {
        this.codigoAnteproyecto = codigoAnteproyecto;
        this.nombrePrograma = nombrePrograma;
        this.tituloAnteproyecto = tituloAnteproyecto;
        this.nombreEstudiante1 = nombreEstudiante1;
        this.codigoEstudiante1 = codigoEstudiante1;
        this.nombreEstudiante2 = nombreEstudiante2;
        this.codigoEstudiante2 = codigoEstudiante2;
        this.nombredirector = nombredirector;
        this.nombreCoDirector = nombreCoDirector;
        this.obetivosAnteproyecto = obetivosAnteproyecto;
    }

    public int getCodigoAnteproyecto() {
        return codigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(int codigoAnteproyecto) {
        this.codigoAnteproyecto = codigoAnteproyecto;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getTituloAnteproyecto() {
        return tituloAnteproyecto;
    }

    public void setTituloAnteproyecto(String tituloAnteproyecto) {
        this.tituloAnteproyecto = tituloAnteproyecto;
    }

    public String getNombreEstudiante1() {
        return nombreEstudiante1;
    }

    public void setNombreEstudiante1(String nombreEstudiante1) {
        this.nombreEstudiante1 = nombreEstudiante1;
    }

    public int getCodigoEstudiante1() {
        return codigoEstudiante1;
    }

    public void setCodigoEstudiante1(int codigoEstudiante1) {
        this.codigoEstudiante1 = codigoEstudiante1;
    }

    public String getNombreEstudiante2() {
        return nombreEstudiante2;
    }

    public void setNombreEstudiante2(String nombreEstudiante2) {
        this.nombreEstudiante2 = nombreEstudiante2;
    }

    public int getCodigoEstudiante2() {
        return codigoEstudiante2;
    }

    public void setCodigoEstudiante2(int codigoEstudiante2) {
        this.codigoEstudiante2 = codigoEstudiante2;
    }

    public String getNombredirector() {
        return nombredirector;
    }

    public void setNombredirector(String nombredirector) {
        this.nombredirector = nombredirector;
    }

    public String getNombreCoDirector() {
        return nombreCoDirector;
    }

    public void setNombreCoDirector(String nombreCoDirector) {
        this.nombreCoDirector = nombreCoDirector;
    }

    public String getObetivosAnteproyecto() {
        return obetivosAnteproyecto;
    }

    public void setObetivosAnteproyecto(String obetivosAnteproyecto) {
        this.obetivosAnteproyecto = obetivosAnteproyecto;
    }

    public int getIdentificacionEvaluador1() {
        return identificacionEvaluador1;
    }

    public void setIdentificacionEvaluador1(int identificacionEvaluador1) {
        this.identificacionEvaluador1 = identificacionEvaluador1;
    }

    public int getIdentificacionEvaluador2() {
        return identificacionEvaluador2;
    }

    public void setIdentificacionEvaluador2(int identificacionEvaluador2) {
        this.identificacionEvaluador2 = identificacionEvaluador2;
    }

    public int getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }

    @Override
    public String toString() {
        return "FormatoTIA{" + "codigoAnteproyecto=" + codigoAnteproyecto + ", nombrePrograma=" + nombrePrograma + ", tituloAnteproyecto=" + tituloAnteproyecto + ", nombreEstudiante1=" + nombreEstudiante1 + ", codigoEstudiante1=" + codigoEstudiante1 + ", nombreEstudiante2=" + nombreEstudiante2 + ", codigoEstudiante2=" + codigoEstudiante2 + ", nombredirector=" + nombredirector + ", nombreCoDirector=" + nombreCoDirector + ", obetivosAnteproyecto=" + obetivosAnteproyecto + ", identificacionEvaluador1=" + identificacionEvaluador1 + ", identificacionEvaluador2=" + identificacionEvaluador2 + ", idDirector=" + idDirector + '}';
    }

}
