/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.utilidades;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosInt;
import SGestionAnteproyectos.dto.FormatoTIA;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YENNYFER
 */
public class UtilidadesGenerales {

    public UtilidadesGenerales() {
    }
    
    private ArrayList<FormatoTIA> consultarCodigosAnteproyectos(GestionAnteproyectosInt objAnteproyectosInt) throws RemoteException {
        System.out.println("Consultando codigos de Anteproyectos");
        ArrayList<FormatoTIA> objFormatos;
        objFormatos = objAnteproyectosInt.consultarFormatosTIA();
        return objFormatos;
    }
    
     public void limpiarTabla(JTable tabla){
         if (tabla!= null) {
         DefaultTableModel model = (DefaultTableModel) tabla.getModel();             
             int filas = tabla.getRowCount();
             for (int i = 0; filas > i; i++) {
                 model.removeRow(0);
             }
         }
    }
     public  boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
     }
}
