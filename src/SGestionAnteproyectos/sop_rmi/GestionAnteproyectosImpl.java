/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import SGestionAnteproyectos.utilidades.UtilidadesRegistroC;
import SSeguimientoAnteproyectos.sop_rmi.SeguimientoAnteproyectosInt;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class GestionAnteproyectosImpl extends UnicastRemoteObject implements GestionAnteproyectosInt {

    private static SeguimientoAnteproyectosInt objSeguimiento;
    private ArrayList<FormatoTIA> formatosTIA;
    private ArrayList<FormatoTIB> formatosTIB;
    private ArrayList<FormatoTIC> formatosTIC;
    private ArrayList<FormatoTID> formatosTID;
    
    private int anioVigente = 2021;
    private int periodoActual = 1;
    private int numeroSecuencial1 = 0, numeroSecuencial2 = 0, numeroSecuencial3 = 0;


    public GestionAnteproyectosImpl() throws RemoteException {
        super();
        formatosTIA = new ArrayList<>();
        formatosTIB = new ArrayList<>();
        formatosTIC = new ArrayList<>();
        formatosTID = new ArrayList<>();
    }

    @Override
    public int solicitarCodigo() {
        Logger.getLogger(GestionAnteproyectosImpl.class.getName()).log(Level.INFO, null,"Invocando a solicitar código");
        //System.out.println("\n\n Invocando a solicitar codigo");
        
        String cod;
        int resultado;
        cod = "" + anioVigente + periodoActual + numeroSecuencial3 + numeroSecuencial2 + numeroSecuencial1;

        // Actualizando la secuencia
        actualizarNumerosSecuenciales();
        
        resultado = Integer.parseInt(cod);
        return resultado;
    }
    
    private void actualizarNumerosSecuenciales(){
        if (numeroSecuencial1 == 9) {
            if (numeroSecuencial2 == 9) {
                if (numeroSecuencial3 == 9) {
                    numeroSecuencial1 = 0;
                    numeroSecuencial2 = 0;
                    numeroSecuencial3 = 0;
                } else {
                    numeroSecuencial2 = 0;
                    numeroSecuencial1 = 0;
                    numeroSecuencial3 = numeroSecuencial3 + 1;
                }
            } else {
                numeroSecuencial1 = 0;
                numeroSecuencial2 = numeroSecuencial2 + 1;
            }
        } else {
            numeroSecuencial1 = numeroSecuencial1 + 1;
        }
    }

    @Override
    public boolean remitirFormatoTIA(FormatoTIA objFormatoTIA) throws RemoteException {
        System.out.println("\n\n Invocando a remitir Formato TI-A");

        if (objFormatoTIA.getCodigoAnteproyecto() > 0) {
            formatosTIA.add(objFormatoTIA);
            System.out.println("\nFormato TI-A remitido correctamente.");
            return true;
        } else {
            System.out.println("\nFormato TI-A No remitido");
            return false;
        }
    }

    @Override
    public boolean remitirFormatoTIB(FormatoTIB objFormatoTIB) throws RemoteException {
        System.out.println("\n\n Invocando a remitir Formato TI-B");

        if (objFormatoTIB.getCodigoAnteproyecto() > 0) {
            formatosTIB.add(objFormatoTIB);
            System.out.println("\nFormato TI-B remitido correctamente.");
            return true;
        } else {
            System.out.println("\nFormato TI-B No remitido");
            return false;
        }
    }

    @Override
    public boolean remitirFormatoTIC(FormatoTIC objFormatoTIC) throws RemoteException {
        System.out.println("\n\n Invocando a remitir Formato TI-C");

        if (objFormatoTIC.getCodigoAnteproyecto() > 0) {
            formatosTIC.add(objFormatoTIC);
            System.out.println("\nFormato TI-C remitido correctamente.");
            return true;
        } else {
            System.out.println("\nFormato TI-C No remitido");
            return false;
        }
    }

    @Override
    public boolean remitirFormatoTID(FormatoTID objFormatoTID) throws RemoteException {
        System.out.println("\n\n Invocando a remitir Formato TI-D");

        if (objFormatoTID.getCodigoAnteproyecto() > 0) {
            formatosTID.add(objFormatoTID);
            System.out.println("\n Formato TI-D remitido correctamente.");
            return true;
        } else {
            System.out.println("\n Formato TI-D No remitido");
            return false;
        }
    }

    @Override
    public ArrayList<Integer> consultarConceptos(int prmCodAnteproyecto)throws RemoteException {
        System.out.println("\n\n Invocando Consultar Conceptos.");

        ArrayList<Integer> conceptos = new ArrayList();

        for (int i = 0; i < formatosTIB.size(); i++) {
            if (formatosTIB.get(i).getCodigoAnteproyecto() == prmCodAnteproyecto) {
                conceptos.add(formatosTIB.get(i).getConcepto());
            }
        }
        return conceptos;
    }

    @Override
    public ArrayList<FormatoTIA> consultarFormatosTIA() throws RemoteException {
        System.out.println("\n\n Invocando Consultar Formato TI-A.");
        return formatosTIA;
    }

    @Override
    public ArrayList<FormatoTIB> consultarFormatosTIB() throws RemoteException {
        System.out.println("\n\n Invocando Consultar Formato TI-B.");
        return formatosTIB;
    }

    @Override
    public ArrayList<FormatoTIC> consultarFormatosTIC() throws RemoteException {
        System.out.println("\n\n Invocando Consultar Formato TI-C.");
        return formatosTIC;
    }

    @Override
    public ArrayList<FormatoTID> consultarFormatosTID() throws RemoteException {
        System.out.println("\n\n Invocando Consultar Formato TI-D.");
        return formatosTID;
    }
    
    @Override
    public boolean asignarEvaluador (int codigoAnteproyecto, int identificacionEvaluador)throws  RemoteException{
        System.out.println("\n\n Invocando asignar Evaluador");
        for(int i =0; i< formatosTIA.size(); i++){
            //Se válida que el código del anteproyecto exista
            if(formatosTIA.get(i).getCodigoAnteproyecto()== codigoAnteproyecto){
                //Si es igual a 0 quiere decir no se ha asignado el evaluador 1
                if(formatosTIA.get(i).getIdentificacionEvaluador1() == 0){
                    //A ese código se anteproyecto que llega se le asigna el evaluador 1
                    formatosTIA.get(i).setIdentificacionEvaluador1(identificacionEvaluador);
                    return true;
                    //Si es igual a 0 quiere decir que no se le ha asignado codigo del el evaluador 2 
                }else if(formatosTIA.get(i).getIdentificacionEvaluador2()== 0){
                    // Al anteproyecto se le asigna el evaluador 2
                    formatosTIA.get(i).setIdentificacionEvaluador2(identificacionEvaluador);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void consultarReferenciaRemota(String direccionIpRMIRegistry, int numPuertoRMIRegistry) {
		System.out.println(" ");
		System.out.println("Desde consultarReferenciaRemotaDeNotificacion()...");
		this.objSeguimiento = (SeguimientoAnteproyectosInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry, "ObjetoRemotoSeguimiento");
	}
}