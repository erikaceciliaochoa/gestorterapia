/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import java.awt.Component;
import java.awt.Frame;
import java.awt.TextField;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import util.modalInternalFrame;

/**
 *
 * @author usuario
 */
public class iFraReportes extends modalInternalFrame {
    
    /**
     * Creates new form iFraReportes
     */
    public iFraReportes() {
        initComponents();
//        grupoBotones();
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
        panelListados = new javax.swing.JPanel();
        lblPaciente = new javax.swing.JLabel();
        btnVerOcupacion = new javax.swing.JButton();
        lblPaciente1 = new javax.swing.JLabel();
        btnVerPac = new javax.swing.JButton();
        lblPaciente2 = new javax.swing.JLabel();
        lblPaciente3 = new javax.swing.JLabel();
        btnDiag = new javax.swing.JButton();
        lblPaciente4 = new javax.swing.JLabel();
        lblPaciente5 = new javax.swing.JLabel();
        btnVerPrue = new javax.swing.JButton();
        btnTrat = new javax.swing.JButton();
        btnVerMot = new javax.swing.JButton();
        lblPaciente12 = new javax.swing.JLabel();
        btnVer10 = new javax.swing.JButton();
        panelInformes = new javax.swing.JPanel();
        lblPaciente6 = new javax.swing.JLabel();
        btnVerPruebasXPaciente = new javax.swing.JButton();
        lblPaciente7 = new javax.swing.JLabel();
        btnVerMotivosTerapia = new javax.swing.JButton();
        lblPaciente8 = new javax.swing.JLabel();
        btnVerMorosos = new javax.swing.JButton();
        lblPaciente10 = new javax.swing.JLabel();
        lblPaciente11 = new javax.swing.JLabel();
        btnVerConsultasDiagn = new javax.swing.JButton();
        btnVerConsultasXDatePac = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        setClosable(true);
        setTitle("Reportes");
        setMaximumSize(new java.awt.Dimension(625, 624));

        panelListados.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        panelListados.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Listados simples", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(102, 102, 255))); // NOI18N

        lblPaciente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente.setText(" Ocupaciones/Profesiones: ");
        lblPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente.setOpaque(true);

        btnVerOcupacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerOcupacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerOcupacionActionPerformed(evt);
            }
        });

        lblPaciente1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente1.setText(" Pacientes: ");
        lblPaciente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente1.setOpaque(true);

        btnVerPac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPacActionPerformed(evt);
            }
        });

        lblPaciente2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente2.setText(" Motivos de Consulta: ");
        lblPaciente2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente2.setOpaque(true);

        lblPaciente3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente3.setText(" Tratamientos: ");
        lblPaciente3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente3.setOpaque(true);

        btnDiag.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagActionPerformed(evt);
            }
        });

        lblPaciente4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente4.setText(" Diagnósticos: ");
        lblPaciente4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente4.setOpaque(true);

        lblPaciente5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente5.setText(" Pruebas: ");
        lblPaciente5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente5.setOpaque(true);

        btnVerPrue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerPrue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerPrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPrueActionPerformed(evt);
            }
        });

        btnTrat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTratActionPerformed(evt);
            }
        });

        btnVerMot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerMot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMotActionPerformed(evt);
            }
        });

        lblPaciente12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente12.setText(" Horarios: ");
        lblPaciente12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente12.setOpaque(true);

        btnVer10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVer10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVer10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListadosLayout = new javax.swing.GroupLayout(panelListados);
        panelListados.setLayout(panelListadosLayout);
        panelListadosLayout.setHorizontalGroup(
            panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListadosLayout.createSequentialGroup()
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelListadosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPaciente12, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVer10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelListadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPaciente4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaciente5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaciente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaciente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaciente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerPrue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerMot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        panelListadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPaciente12, lblPaciente2, lblPaciente3, lblPaciente4, lblPaciente5});

        panelListadosLayout.setVerticalGroup(
            panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPaciente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerPac, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPaciente2)
                    .addComponent(btnVerMot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerPrue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPaciente12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVer10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelListadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDiag, btnTrat, btnVer10, btnVerMot, btnVerOcupacion, btnVerPac, btnVerPrue, lblPaciente, lblPaciente1, lblPaciente12, lblPaciente2, lblPaciente3, lblPaciente4, lblPaciente5});

        panelInformes.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        panelInformes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 102, 204))); // NOI18N

        lblPaciente6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente6.setText(" Pruebas realizadas por paciente: ");
        lblPaciente6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente6.setOpaque(true);

        btnVerPruebasXPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerPruebasXPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerPruebasXPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPruebasXPacienteActionPerformed(evt);
            }
        });

        lblPaciente7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente7.setText(" Motivos por los que se inicia terapia: ");
        lblPaciente7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente7.setOpaque(true);

        btnVerMotivosTerapia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerMotivosTerapia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerMotivosTerapia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMotivosTerapiaActionPerformed(evt);
            }
        });

        lblPaciente8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente8.setText(" Turnos por fecha y paciente: ");
        lblPaciente8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente8.setOpaque(true);

        btnVerMorosos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerMorosos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerMorosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMorososActionPerformed(evt);
            }
        });

        lblPaciente10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente10.setText(" Pacientes que no abonaron la consulta: ");
        lblPaciente10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente10.setOpaque(true);

        lblPaciente11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaciente11.setText(" Diagnósticos por paciente: ");
        lblPaciente11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPaciente11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPaciente11.setOpaque(true);

        btnVerConsultasDiagn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerConsultasDiagn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerConsultasDiagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsultasDiagnActionPerformed(evt);
            }
        });

        btnVerConsultasXDatePac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerConsultasXDatePac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/32_Check_boxes.png"))); // NOI18N
        btnVerConsultasXDatePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsultasXDatePacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInformesLayout = new javax.swing.GroupLayout(panelInformes);
        panelInformes.setLayout(panelInformesLayout);
        panelInformesLayout.setHorizontalGroup(
            panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPaciente6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerConsultasDiagn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerMorosos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerMotivosTerapia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerConsultasXDatePac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerPruebasXPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        panelInformesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPaciente10, lblPaciente11, lblPaciente6, lblPaciente7, lblPaciente8});

        panelInformesLayout.setVerticalGroup(
            panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerPruebasXPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPaciente7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerMotivosTerapia, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(39, 39, 39)
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPaciente8)
                    .addComponent(btnVerConsultasXDatePac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerConsultasDiagn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerMorosos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41))
        );

        panelInformesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnVerConsultasDiagn, btnVerConsultasXDatePac, btnVerMorosos, btnVerMotivosTerapia, btnVerPruebasXPaciente, lblPaciente10, lblPaciente11, lblPaciente6, lblPaciente7, lblPaciente8});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelListados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelListados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPrueActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgOpReportes dialog = new dlgOpReportes(f, true);
        dialog.setOpcion(4);
        dialog.show();
    }//GEN-LAST:event_btnVerPrueActionPerformed

    private void btnDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgOpReportes dialog = new dlgOpReportes(f, true);
        dialog.setOpcion(3);
        dialog.show();
    }//GEN-LAST:event_btnDiagActionPerformed

    private void btnVerPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPacActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgPacOpReporte dialog = new dlgPacOpReporte(f, true);
        dialog.show();
    }//GEN-LAST:event_btnVerPacActionPerformed

    private void btnVerOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerOcupacionActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgOpReportes dialog = new dlgOpReportes(f, true);
        dialog.setOpcion(1);
        dialog.show();
    }//GEN-LAST:event_btnVerOcupacionActionPerformed

    private void btnTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTratActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgOpReportes dialog = new dlgOpReportes(f, true);
        dialog.setOpcion(5);
        dialog.show();
    }//GEN-LAST:event_btnTratActionPerformed

    private void btnVerMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMotActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgOpReportes dialog = new dlgOpReportes(f, true);
        dialog.setOpcion(2);
        dialog.show();
    }//GEN-LAST:event_btnVerMotActionPerformed

    private void btnVerPruebasXPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPruebasXPacienteActionPerformed
        limpiarVentanas();
        iFraPruebasxPac v=new iFraPruebasxPac();
        v.setModal(true); 
        fraMenu.getEscritorio().add(v);
        centrarVentanas();
        v.show();
//        incluir(v);
    }//GEN-LAST:event_btnVerPruebasXPacienteActionPerformed

    private void btnVerMotivosTerapiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMotivosTerapiaActionPerformed
        limpiarVentanas();
        iFraMotMasComunes t=new iFraMotMasComunes();
        t.setModal(true); 
        fraMenu.getEscritorio().add(t);
        centrarVentanas();
        t.show();
//        incluir(t);
    }//GEN-LAST:event_btnVerMotivosTerapiaActionPerformed

    private void btnVerMorososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMorososActionPerformed
        limpiarVentanas();
        iFraRPacDeudores d=new iFraRPacDeudores();
        d.setModal(true); 
        fraMenu.getEscritorio().add(d);
        centrarVentanas();
        d.show();
//        incluir(d);
    }//GEN-LAST:event_btnVerMorososActionPerformed

    private void btnVerConsultasDiagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsultasDiagnActionPerformed
        limpiarVentanas();
        iFraRConsuDiagnosticos t=new iFraRConsuDiagnosticos();
        t.setModal(true); 
        fraMenu.getEscritorio().add(t);
        centrarVentanas();
        t.show();
//        incluir(t);
    }//GEN-LAST:event_btnVerConsultasDiagnActionPerformed

    private void btnVer10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer10ActionPerformed
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgOpHr dialog = new dlgOpHr(f, true);
        dialog.show();
    }//GEN-LAST:event_btnVer10ActionPerformed

    private void btnVerConsultasXDatePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsultasXDatePacActionPerformed
        limpiarVentanas();
        iFraRInasistencias d=new iFraRInasistencias();
        d.setModal(true); 
        fraMenu.getEscritorio().add(d);
        centrarVentanas();
        d.show();
//        incluir(d);
    }//GEN-LAST:event_btnVerConsultasXDatePacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiag;
    private javax.swing.JButton btnTrat;
    private javax.swing.JButton btnVer10;
    private javax.swing.JButton btnVerConsultasDiagn;
    private javax.swing.JButton btnVerConsultasXDatePac;
    private javax.swing.JButton btnVerMorosos;
    private javax.swing.JButton btnVerMot;
    private javax.swing.JButton btnVerMotivosTerapia;
    private javax.swing.JButton btnVerOcupacion;
    private javax.swing.JButton btnVerPac;
    private javax.swing.JButton btnVerPrue;
    private javax.swing.JButton btnVerPruebasXPaciente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblPaciente10;
    private javax.swing.JLabel lblPaciente11;
    private javax.swing.JLabel lblPaciente12;
    private javax.swing.JLabel lblPaciente2;
    private javax.swing.JLabel lblPaciente3;
    private javax.swing.JLabel lblPaciente4;
    private javax.swing.JLabel lblPaciente5;
    private javax.swing.JLabel lblPaciente6;
    private javax.swing.JLabel lblPaciente7;
    private javax.swing.JLabel lblPaciente8;
    private javax.swing.JPanel panelInformes;
    private javax.swing.JPanel panelListados;
    // End of variables declaration//GEN-END:variables

    
    
private void limpiarVentanas(){
    //Ocultar todos los frame menos iFraAdm
    int cant=fraMenu.getEscritorio().getAllFrames().length;
    JInternalFrame internalFrames[] = fraMenu.getEscritorio().getAllFrames();
    for (int i=0; i<cant; i++) {
//            fraMenu.getEscritorio().remove(i);         
        if(!internalFrames[i].getTitle().equals("Reportes")){
            internalFrames[i].dispose();
        }
    }
}  

public void incluir(JInternalFrame p){  
        p.setBorder(null);
        ((BasicInternalFrameUI) p.getUI()).setNorthPane(null);
        fraMenu.getEscritorio().add(p);
        centrarVentanas();
        p.show();
        
        JLabel [] options = new JLabel[1];
        options[0] = new JLabel("");
        
        JOptionPane.showInternalOptionDialog( 
            fraMenu.getEscritorio(),                             // the parent that the dialog blocks 
            p,//inputs,                       // the dialog message array 
            "", // the title of the dialog window 
            JOptionPane.PLAIN_MESSAGE,                 // option type 
            JOptionPane.PLAIN_MESSAGE,            // message type 
            null,                                       // optional icon, use null to use the default icon 
            options,                                    // options string array, will be made into buttons 
            options[0]                                  // option that should be made into a default button 
        ); 
}

public void arranque(){
//    grupoBotones();
//    this.panelInformes.setVisible(false);
//    this.panelListados.setVisible(false);
//    visible(panelListados, false);
//    visible(panelInformes, false);
//    this.setSize(300, 200);//ancho,largo
}

public void centrarVentanas(){
    int x,y;
    int cant=fraMenu.getEscritorio().getAllFrames().length;
    JInternalFrame internalFrames[] = fraMenu.getEscritorio().getAllFrames();
    for (int i=0; i<cant; i++) {         
        if(!internalFrames[i].getTitle().equals("Reportes")){
            x = (fraMenu.getEscritorio().getWidth()/2) - internalFrames[i].getWidth()/2;
            y = (fraMenu.getEscritorio().getHeight()/2) - internalFrames[i].getHeight()/2;
            internalFrames[i].setLocation(x, y);
        }

    }
}
    
    
private void grupoBotones(){
//        this.buttonGroup1=new ButtonGroup();
//        this.buttonGroup1.add(this.rbtListadosSimples);
//        this.buttonGroup1.add(this.rbtReportes);
//        this.buttonGroup1.clearSelection();
    }




public void visible(JPanel jPanel, boolean op){
    jPanel.setVisible(op);
    for (Component component : jPanel.getComponents()) {
        //Limpia todos los JTextField de un JPanel
        if (component instanceof JRadioButton) {
                ((JRadioButton) component).setVisible(op);
        } 
        if (component instanceof TextField) {
                ((TextField) component).setVisible(op);
        } 
        if (component instanceof JLabel) {
                ((JLabel) component).setVisible(op);
        } 
        if (component instanceof JFormattedTextField) {
                ((JFormattedTextField) component).setVisible(op);
        } 
    }      
}



}
