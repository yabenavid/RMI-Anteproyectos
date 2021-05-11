/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;

import SSeguimientoAnteproyectos.dto.*;
import java.rmi.Remote;
/**
 *
 * @author YENNYFER, YEFERSON
 */
public interface SeguimientoAnteproyectosInt extends Remote{
    
    public boolean almacenarFormatos(FormatoTIA objFormatoTIA,FormatoTIB objFormatoTIB,FormatoTIC objFormatoTIC);
    public boolean almacenarResolucion(Resolucion objResolucion);
    
    public String consultarFormatos();
    public String consultarResoluciones();
    
}
