/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.conexion;
import Reportes.MotivosComunesR;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import util.Fecha;
import util.modalInternalFrame;

/**
 *
 * @author usuario
 */
public class iFraMotMasComunes extends modalInternalFrame {
    private boolean ordMot,orCant,ordPorc,asc,desc,todos,algunos;
    int anio,mes;
    Fecha f;
    /**
     * Creates new form iFraMotMasComunes
     */
    public iFraMotMasComunes() {
        initComponents();
        grupoBotones();
        ordMot=orCant=ordPorc=asc=desc=todos=algunos=false;
        anio=mes=0;
        f=null;
        SLetras(txtMotivo);
        SNroEntero(this.txtCant);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGpOrdenar = new javax.swing.ButtonGroup();
        btnGpOrdenarTipo = new javax.swing.ButtonGroup();
        btnGpMostrar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        chooserMes = new com.toedter.calendar.JMonthChooser();
        chkMes = new javax.swing.JCheckBox();
        lblAnio = new javax.swing.JLabel();
        chooserAnio = new com.toedter.calendar.JYearChooser();
        chkAnio = new javax.swing.JCheckBox();
        lblPaciente = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        chkMotivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        panelMostrar = new javax.swing.JPanel();
        rbtXRegistros = new javax.swing.JRadioButton();
        rbtMostrarTodos = new javax.swing.JRadioButton();
        txtCant = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        panelOrdenar = new javax.swing.JPanel();
        rbtMotivo = new javax.swing.JRadioButton();
        rbtCant = new javax.swing.JRadioButton();
        rbtPorcentaje = new javax.swing.JRadioButton();
        panelTipo = new javax.swing.JPanel();
        rbtAsc = new javax.swing.JRadioButton();
        rbtDesc = new javax.swing.JRadioButton();

        setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        setClosable(true);
        setTitle("Problemas más comunes por los que se inicia Terapia");

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 24))); // NOI18N

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFecha.setText(" Fecha:");
        lblFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFecha.setEnabled(false);
        lblFecha.setOpaque(true);

        lblMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMes.setText(" Mes:");
        lblMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMes.setEnabled(false);
        lblMes.setOpaque(true);

        chooserMes.setEnabled(false);
        chooserMes.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        chkMes.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        chkMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMesActionPerformed(evt);
            }
        });

        lblAnio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAnio.setText(" Año:");
        lblAnio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAnio.setEnabled(false);
        lblAnio.setOpaque(true);

        chooserAnio.setEnabled(false);

        chkAnio.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        chkAnio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnioActionPerformed(evt);
            }
        });

        lblPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPaciente.setText(" Motivo: ");
        lblPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente.setEnabled(false);
        lblPaciente.setOpaque(true);

        txtMotivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMotivo.setEnabled(false);

        chkMotivo.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        chkMotivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMotivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooserMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkMes)
                        .addGap(16, 16, 16)
                        .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chooserAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMotivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAnio)
                    .addComponent(chkMotivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooserAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooserMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkMes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/note.png"))); // NOI18N
        jLabel1.setText("Motivos por los que se inicia Terapia");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        panelMostrar.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        panelMostrar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Mostrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 24))); // NOI18N

        rbtXRegistros.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        rbtXRegistros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtXRegistros.setText("Listrar ");
        rbtXRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtXRegistrosActionPerformed(evt);
            }
        });

        rbtMostrarTodos.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        rbtMostrarTodos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtMostrarTodos.setText("Listar todos.");
        rbtMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMostrarTodosActionPerformed(evt);
            }
        });

        txtCant.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCant.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("registros.");

        btnVer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Preview.png"))); // NOI18N
        btnVer.setText("VER");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarLayout = new javax.swing.GroupLayout(panelMostrar);
        panelMostrar.setLayout(panelMostrarLayout);
        panelMostrarLayout.setHorizontalGroup(
            panelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbtXRegistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(70, 70, 70)
                .addComponent(rbtMostrarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMostrarLayout.setVerticalGroup(
            panelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarLayout.createSequentialGroup()
                .addGroup(panelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtXRegistros)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(rbtMostrarTodos)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOrdenar.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        panelOrdenar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Ordenar por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 24))); // NOI18N

        rbtMotivo.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        rbtMotivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtMotivo.setText("Motivo");
        rbtMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMotivoActionPerformed(evt);
            }
        });

        rbtCant.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        rbtCant.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtCant.setText("Cantidad");
        rbtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCantActionPerformed(evt);
            }
        });

        rbtPorcentaje.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        rbtPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtPorcentaje.setText("Porcentaje");
        rbtPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPorcentajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOrdenarLayout = new javax.swing.GroupLayout(panelOrdenar);
        panelOrdenar.setLayout(panelOrdenarLayout);
        panelOrdenarLayout.setHorizontalGroup(
            panelOrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtMotivo)
                .addGap(10, 10, 10)
                .addComponent(rbtCant)
                .addGap(10, 10, 10)
                .addComponent(rbtPorcentaje)
                .addGap(152, 152, 152))
        );
        panelOrdenarLayout.setVerticalGroup(
            panelOrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenarLayout.createSequentialGroup()
                .addGroup(panelOrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMotivo)
                    .addComponent(rbtCant)
                    .addComponent(rbtPorcentaje))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        panelTipo.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        panelTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tipo de Ordenamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 24))); // NOI18N

        rbtAsc.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        rbtAsc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtAsc.setText("Ascendente");
        rbtAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAscActionPerformed(evt);
            }
        });

        rbtDesc.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        rbtDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtDesc.setText("Descendente");
        rbtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTipoLayout = new javax.swing.GroupLayout(panelTipo);
        panelTipo.setLayout(panelTipoLayout);
        panelTipoLayout.setHorizontalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtAsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtDesc))
        );
        panelTipoLayout.setVerticalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addGroup(panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAsc)
                    .addComponent(rbtDesc))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(panelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
//        informe();
        if(validar()){
//            this.dispose();
            informe(); //segun opcion es la tabla que se muestra
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void rbtXRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtXRegistrosActionPerformed
        algunos=rbtXRegistros.isSelected();
        todos = !algunos;
        if(algunos)
        txtCant.setEnabled(true);
    }//GEN-LAST:event_rbtXRegistrosActionPerformed

    private void rbtMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMostrarTodosActionPerformed
        todos = this.rbtMostrarTodos.isSelected();
        algunos=!todos;
        txtCant.setEnabled(false);
    }//GEN-LAST:event_rbtMostrarTodosActionPerformed

    private void rbtMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMotivoActionPerformed
        ordMot = this.rbtMotivo.isSelected();
        orCant=ordPorc = !ordMot;
    }//GEN-LAST:event_rbtMotivoActionPerformed

    private void rbtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCantActionPerformed
        orCant = this.rbtCant.isSelected();
        ordMot=ordPorc = !orCant;
    }//GEN-LAST:event_rbtCantActionPerformed

    private void rbtAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAscActionPerformed
        asc = this.rbtAsc.isSelected();
        desc = !this.rbtAsc.isSelected();
    }//GEN-LAST:event_rbtAscActionPerformed

    private void rbtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDescActionPerformed
        desc = this.rbtDesc.isSelected();
        asc = !this.rbtDesc.isSelected();
    }//GEN-LAST:event_rbtDescActionPerformed

    private void rbtPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPorcentajeActionPerformed
       ordPorc = this.rbtCant.isSelected();
       ordMot= orCant= !ordPorc ;
    }//GEN-LAST:event_rbtPorcentajeActionPerformed

    private void chkMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMesActionPerformed
        if(this.chkMes.isSelected()){
            this.chooserMes.setEnabled(true);
            this.lblMes.setEnabled(true);
            lblFecha.setEnabled(true);
            int mes=chooserMes.getMonth();
//            JOptionPane.showMessageDialog(this, "Mes: " + mes);
        }else{
            this.chooserMes.setEnabled(false);
//            chooserMes.setMonth(06);//funcion q devuelva el mes actual!!
            f=new Fecha();
            chooserMes.setMonth(f.getMes()-1);
            this.lblMes.setEnabled(false);
            lblFecha.setEnabled(false);
        }
    }//GEN-LAST:event_chkMesActionPerformed

    private void chkAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnioActionPerformed
        if(this.chkAnio.isSelected()){
            this.chooserAnio.setEnabled(true);
            this.lblAnio.setEnabled(true);
            lblFecha.setEnabled(true);
            int anio=chooserAnio.getYear();
//            JOptionPane.showMessageDialog(this, "Año: " + anio);
        }else{
            this.chooserAnio.setEnabled(false);
            this.lblAnio.setEnabled(false);
//            chooserAnio.setYear(2014); //funcion q devuelva el año actual!!
            f=new Fecha();
            chooserAnio.setYear(f.getAnio());
            lblFecha.setEnabled(false);
        }
    }//GEN-LAST:event_chkAnioActionPerformed

    private void chkMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMotivoActionPerformed
        if(this.chkMotivo.isSelected()){
            this.txtMotivo.setEnabled(true);
            this.lblPaciente.setEnabled(true);
        }else{
            this.txtMotivo.setEnabled(false);
            this.txtMotivo.setText(null);
            this.lblPaciente.setEnabled(false);
        }
    }//GEN-LAST:event_chkMotivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGpMostrar;
    private javax.swing.ButtonGroup btnGpOrdenar;
    private javax.swing.ButtonGroup btnGpOrdenarTipo;
    private javax.swing.JButton btnVer;
    private javax.swing.JCheckBox chkAnio;
    private javax.swing.JCheckBox chkMes;
    private javax.swing.JCheckBox chkMotivo;
    private com.toedter.calendar.JYearChooser chooserAnio;
    private com.toedter.calendar.JMonthChooser chooserMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JPanel panelMostrar;
    private javax.swing.JPanel panelOrdenar;
    private javax.swing.JPanel panelTipo;
    private javax.swing.JRadioButton rbtAsc;
    private javax.swing.JRadioButton rbtCant;
    private javax.swing.JRadioButton rbtDesc;
    private javax.swing.JRadioButton rbtMostrarTodos;
    private javax.swing.JRadioButton rbtMotivo;
    private javax.swing.JRadioButton rbtPorcentaje;
    private javax.swing.JRadioButton rbtXRegistros;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables

    private void grupoBotones(){
        this.btnGpOrdenar=new ButtonGroup();
        this.btnGpOrdenar.add(this.rbtMotivo);
        this.btnGpOrdenar.add(this.rbtCant);
        this.btnGpOrdenar.add(this.rbtPorcentaje);
        //rbtPorcentaje
        btnGpOrdenar.clearSelection();
        this.btnGpOrdenarTipo=new ButtonGroup();
        this.btnGpOrdenarTipo.add(this.rbtDesc);
        this.btnGpOrdenarTipo.add(this.rbtAsc);
        btnGpOrdenarTipo.clearSelection();
        btnGpMostrar=new ButtonGroup();
        btnGpMostrar.add(this.rbtMostrarTodos);
        btnGpMostrar.add(this.rbtXRegistros);
        btnGpMostrar.clearSelection();
    }
    
    
    public void informe(){
    try {
        int c, campo; String nom, ord;
        campo=1; ord="ASC";
        if(!txtCant.getText().isEmpty()){
            c=Integer.parseInt(txtCant.getText());
        }else c=cantReg();
        if(!txtMotivo.getText().isEmpty()){
            nom=txtMotivo.getText();
        }else nom=""; 
        
        if((ordMot && asc && todos) || (ordMot && asc && algunos)){campo=1; ord="ASC";}
        if((ordMot && desc && todos) || (ordMot && desc && algunos)){campo=1; ord="DESC";}
        if((orCant && desc && todos) || (orCant && desc && algunos)){campo=2; ord="DESC";}
        if((orCant && asc && todos) || (orCant && asc && algunos)) {campo=2; ord="ASC";}
        if((ordPorc && desc && todos) || (ordPorc && desc && algunos)){campo=3; ord="DESC";}
        if((ordPorc && asc && todos) || (ordPorc && asc && algunos)) {campo=3; ord="ASC";}

        List inasistenciasList = new ArrayList();
//        JOptionPane.showMessageDialog(this, "Mes: " + mes + "Anio: " + anio);
        List<MotivosComunesR> lista = conexion.getInstance().getMotivosComunesR2(nom, campo, ord, c, anio,mes);
        
        if(!lista.isEmpty()){
            for (Iterator<MotivosComunesR> it = lista.iterator(); it.hasNext();) {
                    MotivosComunesR t = it.next();
                    String motivo, promedio; int cant;
                    motivo=t.getMotivo(); 
                    cant=t.getCant(); 
                    promedio=t.getPromedio();

                    inasistenciasList.add(new MotivosComunesR(motivo, cant, promedio));
                }
            JasperReport report  = (JasperReport)JRLoader.loadObject(ClassLoader.getSystemResource("Reportes/ReportGrafMotivos.jasper"));
            JasperPrint fillReport = JasperFillManager.fillReport(report, null,new JRBeanCollectionDataSource(inasistenciasList));
            JasperViewer jviewer = new JasperViewer(fillReport,false);
            jviewer.setTitle("Motivos de inicio de terapia.");
            jviewer.setVisible(true); 
            this.dispose();
        }else{
//            this.dispose();
            JOptionPane.showMessageDialog(this, "<html><font size=5>No hay información suficiente para generar el documento.");
        }  
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "<html><font size=5 style=color:red;>Error cargando reporte." + e);
    }
}
    
 public int cantReg(){
        int num = 0;
        List<MotivosComunesR> lista = conexion.getInstance().getMotivosComunesR();
        for (Iterator<MotivosComunesR> it = lista.iterator(); it.hasNext();) {
            MotivosComunesR t = it.next();
            num = num + 1;
        }
        if(num==0){
            num=1;
        }
        return num;
    }   
 
public boolean validar(){
    String tit="Atención"; String msj; 
    boolean res=true;
    
    if(!this.chkAnio.isSelected())
        anio=0;
    else
        anio=chooserAnio.getYear();
    if(!this.chkMes.isSelected())
        mes=0;
    else
        mes=this.chooserMes.getMonth()+1;
    
    if(this.chkMotivo.isSelected() && (txtMotivo.getText().trim()).length()==0){
      msj="<html><font size=5 style=color:red;>Nombre motivo. Dato Requerido.";
      JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
      txtMotivo.grabFocus();
      return false;
    }  
    
    if(!this.rbtMotivo.isSelected() && !this.rbtCant.isSelected() && !this.rbtPorcentaje.isSelected()){
      msj="<html><font size=5 style=color:red;>Ordenar por.. Dato Requerido.";
      JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
      rbtMotivo.grabFocus();
      return false;
    }
        
    if(!this.rbtAsc.isSelected() && !this.rbtDesc.isSelected()){
      msj="<html><font size=5 style=color:red;>Tipo de Ordenenamiento.. Dato Requerido.";
      JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
      rbtAsc.grabFocus();
      return false;
    }
    if(!this.rbtXRegistros.isSelected() && !this.rbtMostrarTodos.isSelected()){
      msj="<html><font size=5 style=color:red;>Opción de muestra. Dato Requerido.";
      JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
      rbtXRegistros.grabFocus();
      return false;
    }
    if(this.rbtXRegistros.isSelected() && (txtCant.getText().trim()).length()==0){
      msj="<html><font size=5 style=color:red;>Cant de registros a mostrar. Dato Requerido.";
      JOptionPane.showMessageDialog(this, msj,tit,JOptionPane.WARNING_MESSAGE);
      txtCant.grabFocus();
      return false;
    }

    return res;
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

 


}
