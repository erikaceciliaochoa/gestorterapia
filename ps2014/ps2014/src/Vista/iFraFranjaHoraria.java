/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.AbstractDAO;
import Controlador.HorarioDAO;
import Controlador.conexion;
import Modelo.RangoHorario;
import java.awt.Font;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.modalInternalFrame;

/**
 *
 * @author usuario
 */
public class iFraFranjaHoraria extends modalInternalFrame {
    private DefaultTableModel model;
    HorarioDAO horarioDAO = null;
    private int num;
    /**
     * Creates new form iFraFranjaHoraria
     */
    public iFraFranjaHoraria() {
        initComponents();
        grupoBotones();
        arranque();
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
        panelBuscar = new javax.swing.JPanel();
        txtIdBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        rbtNro = new javax.swing.JRadioButton();
        rbtTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelDatos = new javax.swing.JPanel();
        lblOcupacion = new javax.swing.JLabel();
        lblIdOcupacion = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblOcupacion9 = new javax.swing.JLabel();
        lblOcupacion1 = new javax.swing.JLabel();
        lblOcupacion10 = new javax.swing.JLabel();
        ftxtHrFin = new javax.swing.JFormattedTextField();
        ftxtHrIni = new javax.swing.JFormattedTextField();
        panelBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registrar Rango Horario");

        panelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        panelBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtIdBuscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

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

        rbtTodos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        rbtTodos.setText("Ver todos");
        rbtTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTodosActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nro", "Hora desde", "Hora hasta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addComponent(rbtNro)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbtTodos)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtNro)
                            .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(rbtTodos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Establecer Rango Horario de Turnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 18))); // NOI18N

        lblOcupacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupacion.setText("Hora desde");

        lblIdOcupacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIdOcupacion.setText("Número");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblOcupacion9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupacion9.setText("hs");

        lblOcupacion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupacion1.setText("Hora hasta");

        lblOcupacion10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupacion10.setText("hs");

        try {
            ftxtHrFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtHrFin.setToolTipText("");
        ftxtHrFin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        try {
            ftxtHrIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtHrIni.setToolTipText("");
        ftxtHrIni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(lblIdOcupacion)
                        .addGap(45, 45, 45)
                        .addComponent(txtId))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addComponent(lblOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(ftxtHrIni, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOcupacion9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOcupacion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtHrFin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOcupacion10)
                .addGap(78, 78, 78))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdOcupacion))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacion9)
                    .addComponent(lblOcupacion1)
                    .addComponent(lblOcupacion10)
                    .addComponent(lblOcupacion)
                    .addComponent(ftxtHrFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtHrIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnEditar, btnEliminar, btnGuardar, btnNuevo});

        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnEditar, btnEliminar, btnGuardar, btnNuevo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        tableModel();
        if(this.rbtNro.isSelected())
        {
            if(txtIdBuscar.getText().trim().length()!=0)
            cargarTabla(1);
            else {JOptionPane.showMessageDialog(this, "<html><font size=5>Ingrese un Nro a buscar..");
                txtIdBuscar.grabFocus(); }
        }
//        else{
////            if(cboHrIni.getSelectedIndex()!=-1)
////            cargarTabla(2);
////            else {JOptionPane.showMessageDialog(this, "Ingrese un Horario Inicial  a buscar..");
////                cboHrIni.grabFocus(); }
//        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbtNroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNroActionPerformed
        // TODO add your handling code here:
        habilitarBusqueda(true);
    }//GEN-LAST:event_rbtNroActionPerformed

    private void rbtTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTodosActionPerformed
        // TODO add your handling code here:
        habilitarBusqueda(false);
        cargarTabla(2);
    }//GEN-LAST:event_rbtTodosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        obtenerTabla();
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        arranque();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftxtHrFin;
    private javax.swing.JFormattedTextField ftxtHrIni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdOcupacion;
    private javax.swing.JLabel lblOcupacion;
    private javax.swing.JLabel lblOcupacion1;
    private javax.swing.JLabel lblOcupacion10;
    private javax.swing.JLabel lblOcupacion9;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JRadioButton rbtNro;
    private javax.swing.JRadioButton rbtTodos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdBuscar;
    // End of variables declaration//GEN-END:variables

private void grupoBotones(){
        this.buttonGroup1=new ButtonGroup();
        this.buttonGroup1.add(rbtNro);
        this.buttonGroup1.add(rbtTodos);
    }

private void arranque(){
    habilitarCampos(false);
    limpiarCampos();
    this.btnGuardar.setEnabled(false);
    this.btnEditar.setEnabled(false);
    this.btnEliminar.setEnabled(false);
    this.btnNuevo.setEnabled(true);
    this.btnGuardar.setText("Guardar");
    this.jTable1.setEnabled(true);   

    this.rbtNro.setSelected(true);
    this.txtIdBuscar.grabFocus();
    habilitarBusqueda(true);
    tableModel();
    //cargarTabla();
    tamOriginal();
}

public void habilitarCampos(boolean op){    
    this.txtId.setEnabled(op);
    this.ftxtHrIni.setEnabled(op);
    this.ftxtHrFin.setEnabled(op);
}

public void limpiarCampos(){    
    this.txtId.setText(null);
    this.ftxtHrIni.setText(null);
    this.ftxtHrFin.setText(null);
}

public void habilitarBusqueda(boolean op){//MODIFICAR!!!
        this.txtIdBuscar.setEnabled(op);
        this.txtIdBuscar.setText(null);
        if(op) this.txtIdBuscar.grabFocus();
        if(!op) this.rbtTodos.grabFocus();
        tableModel();
    }

public void tableModel(){
    this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
    this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
    this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
    jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 18));
    jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
    jTable1.setRowHeight(20);
    model = (DefaultTableModel)this.jTable1.getModel();
    model.setNumRows(0);
}

public void tamOriginal(){   
    int ancho, largo;
    panelBuscar.setVisible(true); 
    if(fraMenu.getTam()==2){  //cuadrado  
        //JOptionPane.showMessageDialog(this, "tam.."+ fraMenu.getTam());
        ancho=580; largo=480;      
    }
    else{
        //JOptionPane.showMessageDialog(this, "tam.."+ fraMenu.getTam());
        ancho=585; largo=480; //380
    }
    this.setSize(ancho, largo); 
    
}

public void tamMod(){
    int ancho, largo;
    panelBuscar.setVisible(false); 
    if(fraMenu.getTam()==2){ 
        //JOptionPane.showMessageDialog(this, "tam.."+ fraMenu.getTam());
        ancho=580; largo=280;       
    }
    else{
        //JOptionPane.showMessageDialog(this, "tam2.."+ fraMenu.getTam());
        ancho=585; largo=280;
    }
    this.setSize(ancho, largo);    
}

public void nuevo(){
    obtenetID();
    this.btnNuevo.setEnabled(false);
    this.btnGuardar.setEnabled(true);
//    this.txtId.setText("Auto");
    txtId.setText(String.valueOf(num));
    habilitarCampos(true);
    tamMod();
}

public void obtenetID(){
    num = 0;
    List<RangoHorario> lista = AbstractDAO.getListaEntidades(RangoHorario.class);
    for (Iterator<RangoHorario> it = lista.iterator(); it.hasNext();) {
        RangoHorario d = it.next();
        num= d.getId() + 1;
    }
    if(num==0){
        num=1;
    } 
}

public void obtenerTabla(){
   int id = getId();   
   RangoHorario h=AbstractDAO.getEntidad(id, RangoHorario.class);
   this.txtId.setText(String.valueOf(h.getId()));
   ftxtHrIni.setText(h.getHoraIni());
   ftxtHrFin.setText(h.getHoraFin());  
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
    List<RangoHorario> lista = null;   
    if (op==1){ 
        int cod = Integer.parseInt(txtIdBuscar.getText());
        lista=AbstractDAO.getListaEntidadesXid(RangoHorario.class, cod);
    }
    else {
        lista=AbstractDAO.getListaEntidades(RangoHorario.class);              
    }
    
    for (Iterator<RangoHorario> it = lista.iterator(); it.hasNext();) {
            RangoHorario h = it.next();
            model.addRow(new Object[]{
                h.getId(), h.getHoraIni(), h.getHoraFin()
            });
        } 
    if(lista.isEmpty())JOptionPane.showMessageDialog(this, "<html><font size=5>Esta búsqueda no arrojo resultados..");
}

public void eliminar(){
    int seleccion = JOptionPane.showConfirmDialog(null,"<html><font size=5>¿Desea eliminar el Registro?", "Eliminación de Registro.", JOptionPane.YES_NO_OPTION);//Obtnemos la selección del usuario
    if(seleccion == 1){
        JOptionPane.showMessageDialog(null, "<html><font size=5>Registro no Eliminado...");
        arranque();
    }
    else{
        int id = getId();      
        RangoHorario h=AbstractDAO.getEntidad(id, RangoHorario.class);
        AbstractDAO.borrarEntidad(h);        
        JOptionPane.showMessageDialog(null, "<html><font size=5 style=color:red;>Registro Eliminado...");
        arranque();
    }
}

public void editar(){
    this.btnGuardar.setEnabled(true);
    this.btnGuardar.setText("Actualizar");
    habilitarCampos(true);
    this.btnEliminar.setEnabled(false);
    this.btnEditar.setEnabled(false);
    this.jTable1.setEnabled(false);
    tamMod();
}

public void guardar(){
    
    if(!validar()){
        //JOptionPane.showMessageDialog(null, "Imposible guardar hay campos vacios.");
    }
    else{       
        if(this.btnGuardar.getText().equals("Guardar")){ 
            RangoHorario h = new RangoHorario();
            h.setHoraIni(String.valueOf(this.ftxtHrIni.getText()));
            h.setHoraFin(String.valueOf(this.ftxtHrFin.getText()));
            AbstractDAO.almacenaEntidad(h);
            JOptionPane.showMessageDialog(null, "<html><font size=5>Registro guardado.");
            arranque();
        }
        else{//Es una Modificacion          
            int id = getId();          
            RangoHorario h = AbstractDAO.getEntidad(id, RangoHorario.class);
            h.setHoraIni(String.valueOf(this.ftxtHrIni.getText()));
            h.setHoraFin(String.valueOf(this.ftxtHrFin.getText()));
            AbstractDAO.almacenaEntidad(h);
            JOptionPane.showMessageDialog(null, "<html><font size=5>Registro actualizado.");
            arranque();
        }
    }
}

public boolean validar(){
    String tit="Atención"; String msj; 
    boolean res=true;
        
    if((this.ftxtHrIni.getText().trim()).length()==1)
      {   msj="<html><font size=5 style=color:red;>Hora de Inicio. Dato Requerido";
          JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
          ftxtHrIni.grabFocus();
          return false;
      }

    if((this.ftxtHrFin.getText().trim()).length()==1)
    {   msj="<html><font size=5 style=color:red;>Hora de Fin. Dato Requerido. ";
        JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
        ftxtHrFin.grabFocus();
        return false;
    }
    
    String stFecha1, stFecha2; 
     stFecha1=ftxtHrIni.getText();
     stFecha2=ftxtHrFin.getText();
     SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
     Date fecha1 = sdf.parse(stFecha1 , new ParsePosition(0));
     Date fecha2 = sdf.parse(stFecha2 , new ParsePosition(0)); 
     
     if (!fecha1.before(fecha2)){ 
         msj="<html><font size=5 style=color:red;>Hora de Inicio debe ser menor que hora de fin.";
         JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
         ftxtHrIni.grabFocus();
         return false;
     }
     if (fecha1.equals(fecha2)){ 
         msj="<html><font size=5 style=color:red;>Hora de Inicio debe ser menor que hora de fin.";
         JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
         ftxtHrIni.grabFocus();
         return false;
     }
     
     boolean op = conexion.getInstance().verificarRango(ftxtHrIni.getText(), ftxtHrFin.getText());
     if (op){ 
         msj="<html><font size=5 style=color:red;>Ya existe un Rango Horario con estos datos.";
         JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
         ftxtHrIni.setText(null);
         ftxtHrFin.setText(null);
         ftxtHrIni.grabFocus();
         return false;
     }
    
    return res;
}



}
