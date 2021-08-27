/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.presentacion;

import SGestionAnteproyectos.dto.FormatoTIA;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosInt;
import cliente.utilidades.UtilidadesGenerales;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YENNYFER
 */
public class ListarFormatosTIA extends javax.swing.JInternalFrame {

    private GestionAnteproyectosInt objGestionAnteproyectos;
    private UtilidadesGenerales utilidadesGenerales;
    private ArrayList<FormatoTIA> formatos;
    private int idDirector;
    /**
     * Creates new form ListarFormatosTIA
     */
    public ListarFormatosTIA(GestionAnteproyectosInt objGestionAnteproyectos, int identificaciondirector) {     
        initComponents();
        this.objGestionAnteproyectos = objGestionAnteproyectos;
        utilidadesGenerales = new UtilidadesGenerales();
        formatos = new ArrayList<>();
        this.idDirector= identificaciondirector;
        inicializarTablaFormatosTIA();
        llenarTablaFormatosTIA();
    }
    
    private void inicializarTablaFormatosTIA(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo ");
        model.addColumn("Titulo");
        model.addColumn("Programa"); 
        model.addColumn("Estudiante 1");        
        model.addColumn("Estudiante 2"); 
         model.addColumn("Evaluador 1"); 
          model.addColumn("Evaluador 2"); 
        this.jTable1.setModel(model);
    }
 private void llenarTablaFormatosTIA() {
        
     DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
     utilidadesGenerales.limpiarTabla(jTable1);
     try {
         this.formatos = objGestionAnteproyectos.consultarFormatosTIA();
     } catch (RemoteException ex) {
         Logger.getLogger(ListarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
     }

     for (int i = 0; i < formatos.size(); i++) {
         if (formatos.get(i).getIdDirector() == idDirector) {
             FormatoTIA objFormatoTIA = formatos.get(i);
             String[] fila = {String.valueOf(objFormatoTIA.getCodigoAnteproyecto()), objFormatoTIA.getTituloAnteproyecto(), objFormatoTIA.getNombrePrograma(), objFormatoTIA.getNombreEstudiante1(), objFormatoTIA.getNombreEstudiante2(), String.valueOf(objFormatoTIA.getIdentificacionEvaluador1()), objFormatoTIA.getIdentificacionEvaluador2() + ""};
             model.addRow(fila);
         }
     }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Listar anteproyectos Formato TI-A");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1485476036-artboard-1_78544.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Lista de todos los anteproyectos");

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
