/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.presentacion;

import SGestionAnteproyectos.dto.*;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosInt;
import cliente.utilidades.UtilidadesGenerales;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YENNYFER
 */
public class ListarFormatos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListarFormatos
     */
    private GestionAnteproyectosInt objGestionAnteproyectosInt;
    private UtilidadesGenerales utilidadesGenerales;
    private ArrayList<FormatoTIB> formatosTIB;
    private ArrayList<FormatoTIC> formatosTIC;
    private ArrayList<FormatoTID> formatosTID;
    public ListarFormatos(GestionAnteproyectosInt objGestionAnteproyectosInt) {
        initComponents();
        this.objGestionAnteproyectosInt = objGestionAnteproyectosInt;
        this.utilidadesGenerales = new  UtilidadesGenerales();
        this.formatosTIB = new ArrayList<>();
        this.formatosTIC = new ArrayList<>();
        this.formatosTID = new ArrayList<>();
        
        inicializarTablaFormatosTIB();
        inicializarTablaFormatosTIC();
        inicializarTablaFormatosTID();
        
        llenarTablaFormatosTIB();
        llenarTablaFormatosTIC();
        llenarTablaFormatosTID();
        
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbFormatosTIB = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbFormatosTIC = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbFormatosTID = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Formatos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1485476036-artboard-1_78544.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jtbFormatosTIB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtbFormatosTIB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbFormatosTIB);

        jtbFormatosTIC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtbFormatosTIC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtbFormatosTIC);

        jtbFormatosTID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtbFormatosTID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtbFormatosTID);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Formatos TIB:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Formatos TIC:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("FormatosTID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
      private void inicializarTablaFormatosTIB(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código Anteproyecto");
        model.addColumn("Concepto");
        model.addColumn("Observaciones"); 
        model.addColumn("Fecha evaluación");        
        model.addColumn("Nombre evaluador");
        model.addColumn("Identificación evaluador");    
        this.jtbFormatosTIB.setModel(model);
    }
 private void llenarTablaFormatosTIB() {
        
    DefaultTableModel model = (DefaultTableModel)this.jtbFormatosTIB.getModel();
    utilidadesGenerales.limpiarTabla(jtbFormatosTIB);
        try {
            this.formatosTIB = objGestionAnteproyectosInt.consultarFormatosTIB();
        } catch (RemoteException ex) {
            Logger.getLogger(ListarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        for (int i = 0; i <formatosTIB.size(); i++) {
            FormatoTIB objFormatoTIB = formatosTIB.get(i);
            String[] fila = {String.valueOf(objFormatoTIB.getCodigoAnteproyecto()),String.valueOf(objFormatoTIB.getConcepto()),objFormatoTIB.getObservaciones(),objFormatoTIB.getFechaEvaluacion(),objFormatoTIB.getNombreEvaluador(), objFormatoTIB.getIdentificacionEvaluador() + ""};
            model.addRow(fila);
        }
    }
  private void inicializarTablaFormatosTIC(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código Anteproyecto");
        model.addColumn("Estructura"); 
        model.addColumn("Concepto Dpto"); 
        model.addColumn("Observaciones");      
        this.jtbFormatosTIC.setModel(model);
    }
 private void llenarTablaFormatosTIC() {
        
    DefaultTableModel model = (DefaultTableModel)this.jtbFormatosTIC.getModel();
    utilidadesGenerales.limpiarTabla(jtbFormatosTIC);
        try {
            this.formatosTIC = objGestionAnteproyectosInt.consultarFormatosTIC();
        } catch (RemoteException ex) {
            Logger.getLogger(ListarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        for (int i = 0; i <formatosTIC.size(); i++) {
            FormatoTIC objFormatoTIC = formatosTIC.get(i);
            String[] fila = {String.valueOf(objFormatoTIC.getCodigoAnteproyecto()),String.valueOf(objFormatoTIC.getEstructura()),String.valueOf(objFormatoTIC.getConceptoDepto()),objFormatoTIC.getObservaciones()+ ""};
            model.addRow(fila);
        }
    }
  private void inicializarTablaFormatosTID(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código Anteproyecto");
        model.addColumn("Estructura"); 
        model.addColumn("Concepto Comite"); 
        model.addColumn("Observaciones");      
        this.jtbFormatosTID.setModel(model);
    }
 private void llenarTablaFormatosTID() {
        
    DefaultTableModel model = (DefaultTableModel)this.jtbFormatosTID.getModel();
    utilidadesGenerales.limpiarTabla(jtbFormatosTID);
        try {
            this.formatosTID = objGestionAnteproyectosInt.consultarFormatosTID();
        } catch (RemoteException ex) {
            Logger.getLogger(ListarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        for (int i = 0; i <formatosTID.size(); i++) {
            FormatoTID objFormatoTID = formatosTID.get(i);
            String[] fila = {String.valueOf(objFormatoTID.getCodigoAnteproyecto()),String.valueOf(objFormatoTID.getEstructura()),String.valueOf(objFormatoTID.getConceptoComite()),objFormatoTID.getObservaciones()+ ""};
            model.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtbFormatosTIB;
    private javax.swing.JTable jtbFormatosTIC;
    private javax.swing.JTable jtbFormatosTID;
    // End of variables declaration//GEN-END:variables
}
