/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.AbstractDAO;
import Modelo.Tratamiento;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import util.modalInternalFrame;

/**
 *
 * @author usuario
 */
public class iFraTratamientos extends modalInternalFrame {
    private DefaultTableModel model;
    private int num;
    /**
     * Creates new form iFraTratamientos
     */
    public iFraTratamientos() {
        initComponents();
        arranque();
        grupoBotones();
        SLetras(this.txtNombreBuscar);
        SLetras(this.txtNombre);
        SNroEntero(this.txtIdBuscar);
        SNroEntero(this.txtId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRegistrar = new javax.swing.JPanel();
        lblOcupacion1 = new javax.swing.JLabel();
        lblIdOcupacion1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelBuscar = new javax.swing.JPanel();
        txtIdBuscar = new javax.swing.JTextField();
        txtNombreBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        rbtNro = new javax.swing.JRadioButton();
        rbtNombre = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Administrar Tratamientos");

        panelRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Registrar nuevo Tratamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        panelRegistrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblOcupacion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupacion1.setText("Nombre");

        lblIdOcupacion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIdOcupacion1.setText("Número");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIdOcupacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOcupacion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNombre))
                .addContainerGap())
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdOcupacion1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addContainerGap())
        );

        panelBotones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelBotones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnNuevo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/New.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Trashcan_empty.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnInforme.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Tasks.png"))); // NOI18N
        btnInforme.setText("Informe");
        btnInforme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInforme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/cancel32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnEditar, btnEliminar, btnGuardar, btnInforme, btnNuevo});

        panelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        panelBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtIdBuscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        txtNombreBuscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nro", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnBuscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/search-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        rbtNro.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        rbtNro.setText("Número");
        rbtNro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNroActionPerformed(evt);
            }
        });

        rbtNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        rbtNombre.setText("Nombre Tratamiento");
        rbtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addComponent(rbtNro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbtNombre)
                    .addComponent(txtNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBuscarLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtIdBuscar))
                            .addComponent(rbtNro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        //informe();
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgOpReportes dialog = new dlgOpReportes(f, true);
        dialog.setOpcion(5);
        dialog.show();
    }//GEN-LAST:event_btnInformeActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        arranque();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        obtenerTabla();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        defaultTableModel();
        if(this.rbtNro.isSelected())
        {
            if(txtIdBuscar.getText().trim().length()!=0)
            cargarTabla(1);
            else {JOptionPane.showMessageDialog(this, "<html><font size=5>Ingrese un Nro a buscar..");
                txtIdBuscar.grabFocus(); }
        }
        else{
            if(txtNombreBuscar.getText().trim().length()!=0)
            cargarTabla(2);
            else {JOptionPane.showMessageDialog(this, "<html><font size=5>Ingrese un nombre a buscar..");
                txtNombreBuscar.grabFocus(); }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbtNroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNroActionPerformed
        // TODO add your handling code here:
        habilitarBusqueda(true);
    }//GEN-LAST:event_rbtNroActionPerformed

    private void rbtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNombreActionPerformed
        // TODO add your handling code here:
        habilitarBusqueda(false);
    }//GEN-LAST:event_rbtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdOcupacion1;
    private javax.swing.JLabel lblOcupacion1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JRadioButton rbtNombre;
    private javax.swing.JRadioButton rbtNro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBuscar;
    // End of variables declaration//GEN-END:variables

private void arranque(){
    this.txtId.setEnabled(false);
    this.txtId.setText(null);
    this.txtNombre.setEnabled(false);
    this.txtNombre.setText(null);
    this.btnGuardar.setEnabled(false);
    this.btnEditar.setEnabled(false);
    this.btnEliminar.setEnabled(false);
    this.btnInforme.setEnabled(true);
    this.btnNuevo.setEnabled(true);
    this.btnGuardar.setText("Guardar");
    this.jTable1.setEnabled(true);
    this.rbtNro.setSelected(true);
    this.txtIdBuscar.grabFocus();
    habilitarBusqueda(true);
    //tam original ventana
    this.panelBuscar.setVisible(true);
    this.setSize(740, 520);  
}

public void habilitarBusqueda(boolean op){
        this.txtNombreBuscar.setEnabled(!op);
        this.txtIdBuscar.setEnabled(op);
        this.txtIdBuscar.setText(null);
        this.txtNombreBuscar.setText(null);
        if(op) this.txtIdBuscar.grabFocus();
        if(!op) this.txtNombreBuscar.grabFocus();
        defaultTableModel();
    }

public void defaultTableModel(){
    this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
    this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 18));
    jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
    jTable1.setRowHeight(30);
    model = (DefaultTableModel) this.jTable1.getModel();
    model.setNumRows(0);
}

private void grupoBotones(){
        this.buttonGroup1=new ButtonGroup();
        this.buttonGroup1.add(rbtNro);
        this.buttonGroup1.add(rbtNombre);
    }

private void SLetras(JTextField a){
    a.addKeyListener(new KeyAdapter() {
   @Override public void keyTyped(KeyEvent e) {            
        char car = e.getKeyChar();       
        if((car<'a' || car>'z') && (car<'A' || car>'Z')            
            && car !='á'          
            && car !='é'           
            && car !='í'           
            && car !='ó'          
            && car !='ú'  
            && car !='Á'           
            && car !='É'           
            && car !='Í'           
            && car !='Ó'
            && car !='Ú'
            && car !='ñ'
            && car !='Ñ'    
            && (car!=(char)KeyEvent.VK_SPACE)
            && (car!=(char)KeyEvent.VK_BACK_SPACE))
        {
          Toolkit.getDefaultToolkit().beep();
          e.setKeyChar((char) KeyEvent.VK_CLEAR);
                JOptionPane.showMessageDialog(null, "<html><font size=5 style=color:red;>Solo puede ingresar letras", "Validando Datos",
                        JOptionPane.ERROR_MESSAGE);
          e.consume(); 
        }
        String text = ((JTextField) e.getSource()).getText();
        if (text.length() >= 50) {
            e.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "<html><font size=5 style=color:red;>Ha excedido el número máximo de caracteres!!! (50)", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    });          
}
    
private void SNroEntero(JTextField a){   
    a.addKeyListener(new KeyAdapter() {
   @Override public void keyTyped(KeyEvent e) {            
            String text = ((JTextField) e.getSource()).getText();

            if(!Character.isDigit(e.getKeyChar()) && !Character.isISOControl(e.getKeyChar()))
            {
                 Toolkit.getDefaultToolkit().beep();

                 e.setKeyChar((char) KeyEvent.VK_CLEAR);
                JOptionPane.showMessageDialog(null, "<html><font size=5 style=color:red;>Solo puede ingresar números", "Validando Datos",
                        JOptionPane.ERROR_MESSAGE);
                e.consume();
            }
            if (text.length() >= 5) {
                e.setKeyChar((char) KeyEvent.VK_CLEAR);
                JOptionPane.showMessageDialog(null, "<html><font size=5 style=color:red;>Ha excedido el numero maximo de caracteres!!! (5)", "Validando Datos",
                        JOptionPane.ERROR_MESSAGE);
            }                     
    }
    });  
}

public void nuevo(){
    obtenetID();
    this.btnNuevo.setEnabled(false);
    this.btnGuardar.setEnabled(true);
    this.txtNombre.setEnabled(true);
//    this.txtId.setText("Auto");
    this.txtId.setText(String.valueOf(num));
    this.panelBuscar.setVisible(false);
    this.setSize(740, 320);
}

public void obtenetID(){
    num = 0;
    List<Tratamiento> lista = AbstractDAO.getListaEntidades(Tratamiento.class);
    for (Iterator<Tratamiento> it = lista.iterator(); it.hasNext();) {
        Tratamiento d = it.next();
        num= d.getId() + 1;
    }
    if(num==0){
        num=1;
    } 
}

public void editar(){
    this.btnGuardar.setEnabled(true);
    this.btnGuardar.setText("Actualizar");
    this.txtNombre.setEnabled(true);
    this.btnEliminar.setEnabled(false);
    this.btnEditar.setEnabled(false);
    this.jTable1.setEnabled(false);
    this.panelBuscar.setVisible(false);
        this.setSize(740, 320);
}

public void guardar(){
    if(this.txtNombre.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "<html><font size=5 style=color:red;>Imposible guardar campo vacio.","Atención",JOptionPane.WARNING_MESSAGE);
        txtNombre.grabFocus();
    }
    else{       
        if(this.btnGuardar.getText().equals("Guardar")){ 
            Tratamiento t = new Tratamiento();
            t.setDes(this.txtNombre.getText());
            AbstractDAO.almacenaEntidad(t);
            JOptionPane.showMessageDialog(this, "<html><font size=5>Registro guardado.");
            arranque();
        }
        else{          
            int id = getId();          
            Tratamiento t = AbstractDAO.getEntidad(id, Tratamiento.class);
            t.setDes(this.txtNombre.getText());
            AbstractDAO.almacenaEntidad(t);
            JOptionPane.showMessageDialog(this, "<html><font size=5>Registro actualizado.");
            arranque();
        }
    }
}

public void eliminar(){
    int seleccion = JOptionPane.showConfirmDialog(this,"<html><font size=5>¿Desea eliminar el Registro?", "Eliminación de Registro.", JOptionPane.YES_NO_OPTION);//Obtnemos la selección del usuario
    if(seleccion == 1){
        JOptionPane.showMessageDialog(this, "<html><font size=5>Registro no Eliminado...");
        arranque();
    }
    else{
        int id = getId();      
        Tratamiento t=AbstractDAO.getEntidad(id, Tratamiento.class);
        AbstractDAO.borrarEntidad(t);        
        JOptionPane.showMessageDialog(this, "<html><font size=5 style=color:red;>Registro Eliminado...");
        arranque();
    }
}

public void obtenerTabla(){
   int id = getId();   
   Tratamiento t=AbstractDAO.getEntidad(id, Tratamiento.class);
   this.txtId.setText(String.valueOf(t.getId()));
   this.txtNombre.setText(t.getDes());
   this.btnEditar.setEnabled(true);
   this.btnEliminar.setEnabled(true);
   this.btnNuevo.setEnabled(false);
}

private int getId(){
    int selectedRow = this.jTable1.getSelectedRow();//Obtenemos la fila seleccionada...
    Object valueAt = model.getValueAt(selectedRow, 0);//Obtenemos el valor de esa fila...
    int id = Integer.parseInt(valueAt.toString());//Convertimos el valor en entero...
    return id;
}

public void cargarTabla(int op){
    List<Tratamiento> lista = null;   
    if (op==1){ 
        int cod = Integer.parseInt(txtIdBuscar.getText());
        lista=AbstractDAO.getListaEntidadesXid(Tratamiento.class, cod);
    }
    else {
        String nom = txtNombreBuscar.getText();
        lista=AbstractDAO.getListaEntidadesXnom(Tratamiento.class, nom);              
    }
    
    for (Iterator<Tratamiento> it = lista.iterator(); it.hasNext();) {
            Tratamiento t = it.next();
            model.addRow(new Object[]{
                t.getId(), t.getDes()
            });
        } 
    if(lista.isEmpty())JOptionPane.showMessageDialog(this, "<html><font size=5>Esta búsqueda no arrojo resultados..");
}


}
