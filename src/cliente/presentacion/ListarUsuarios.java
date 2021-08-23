/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.presentacion;

import SGestionAnteproyectos.dto.Usuario;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosInt;
import javax.swing.table.DefaultTableModel;
import cliente.utilidades.UtilidadesGenerales;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YENNYFER
 */
public class ListarUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarUsuarios
     */
    private GestionUsuariosInt objGestionUsuariosInt;
    private UtilidadesGenerales utilidadesGenerales;
    private ArrayList<Usuario> usuarios;
    
    public ListarUsuarios() {
        initComponents();
    }
    public ListarUsuarios(GestionUsuariosInt objGestionUsuariosInt) {
        this.objGestionUsuariosInt = objGestionUsuariosInt;
        this.utilidadesGenerales = new UtilidadesGenerales();
        this.usuarios = new ArrayList<>();
        initComponents();
        inicializarTablaUsuarios();
        llenarTablaUsuarios();
    }
private void inicializarTablaUsuarios(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Identificación ");
        model.addColumn("Nombre");
        model.addColumn("Rol"); 
        model.addColumn("Departamento");        
        model.addColumn("Usuario"); 
        model.addColumn("Contraseña"); 
        this.tblUsuarios.setModel(model);
    }
 private void llenarTablaUsuarios() {
        
    DefaultTableModel model = (DefaultTableModel)this.tblUsuarios.getModel();
    utilidadesGenerales.limpiarTabla(tblUsuarios);
    //this.usuarios.clear();
        try {
            this.usuarios = objGestionUsuariosInt.listarUsuarios();
        } catch (RemoteException ex) {
            Logger.getLogger(ListarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        for (int i = 0; i <usuarios.size(); i++) {
            Usuario objUsuario = usuarios.get(i);
            String[] fila = {String.valueOf(objUsuario.getId()),objUsuario.getNombre(),objUsuario.getRol().toString(),objUsuario.getDepartamento(),objUsuario.getUsuario(),objUsuario.getContrasena()+ ""};
            model.addRow(fila);
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
        tblUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMostrarLibros = new javax.swing.JTable();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Lista de Usuario Registrados");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUsuarios);

        jTableMostrarLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableMostrarLibros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMostrarLibros;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
