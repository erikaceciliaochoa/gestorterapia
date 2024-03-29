/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.AbstractDAO;
import Controlador.PacientesDAO;
import Modelo.Diagnostico;
import Modelo.Motivo;
import Modelo.Ocupacion;
import Modelo.Paciente;
import Modelo.Prueba;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class dlgSeleccion extends javax.swing.JDialog {

    private DefaultTableModel model;
    PacientesDAO pacientesDAO=null;
    private int opcion=0;
//    iFraAgenda ia=new iFraAgenda();
    
    /**
     * Creates new form dlgSeleccion
     */
    public dlgSeleccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        grupoBotones();
        habilitarBusqueda(true);
        SLetras(this.txtNombreBuscar);
        SNroEntero(this.txtIdBuscar);
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
        txtNombreBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        rbtNro = new javax.swing.JRadioButton();
        rbtNombre = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opciones de Búsqueda");
        setResizable(false);

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
        rbtNombre.setText("Nombre");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap()
                .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        switch (opcion){
            case 1:
                cargarMotivo();
                break;
            case 2:               
                cargarPaciente();
                break;
            case 3:               
                cargarPrueba();
                break;
            case 4:               
                cargarProfesion();
                break;
            case 5:               
                cargarDiag();
                break;    
            default:
                break;
        
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(validar()){
            switch (opcion){
                case 1://MOTIVO              
                    defaultTableModel();
                    if(this.rbtNro.isSelected())
                            cargarTablaMotivo(1);
                    else
                        cargarTablaMotivo(2); 
                    break;
                case 2://PACIENTE              
                    tableModelPac();
                    if(this.rbtNro.isSelected())
                        cargarTablaPac(1);
                    else
                        cargarTablaPac(2);
                    break;
                case 3://PRUEBA              
                    defaultTableModel();
                    if(this.rbtNro.isSelected())
                        cargarTablaPrueba(1);
                    else
                        cargarTablaPrueba(2);
                    break;
                case 4://PROFESION/OCUPACION              
                    defaultTableModel();
                    if(this.rbtNro.isSelected())
                        cargarTablaProfesion(1);
                    else
                        cargarTablaProfesion(2);
                    break;
                case 5://DIAGNOSTICO             
                    defaultTableModel();
                    if(this.rbtNro.isSelected())
                        cargarTablaDiag(1);
                    else
                        cargarTablaDiag(2);
                    break;    
                default:
                    break;

            } 
        }    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbtNroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNroActionPerformed

        habilitarBusqueda(true);
    }//GEN-LAST:event_rbtNroActionPerformed

    private void rbtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNombreActionPerformed

        habilitarBusqueda(false);
    }//GEN-LAST:event_rbtNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgSeleccion dialog = new dlgSeleccion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JRadioButton rbtNombre;
    private javax.swing.JRadioButton rbtNro;
    private javax.swing.JTextField txtIdBuscar;
    private javax.swing.JTextField txtNombreBuscar;
    // End of variables declaration//GEN-END:variables

    

public void defaultTableModel(){
    this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
    this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 18));
    jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
    jTable1.setRowHeight(30);
    model = (DefaultTableModel) this.jTable1.getModel();
    model.setNumRows(0);
}

public void tableModelPac(){
    this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
    this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 18));
    jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
    jTable1.setRowHeight(30);
//    this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
    model = (DefaultTableModel)this.jTable1.getModel();
    model.setNumRows(0);
}

private void grupoBotones(){
        this.buttonGroup1=new ButtonGroup();
        this.buttonGroup1.add(rbtNro);
        this.buttonGroup1.add(rbtNombre);
    }

public void cargarTablaPac(int op){
    List<Paciente> lista = null;
    if (op==1){ 
        int cod = Integer.parseInt(txtIdBuscar.getText());    
        lista=AbstractDAO.getListaEntidadesXid(Paciente.class, cod);
    }
    else {
        String nom = txtNombreBuscar.getText();
        pacientesDAO = new PacientesDAO();
        lista=pacientesDAO.getPacientesXnonApe(nom);
        //lista = (List<Paciente>)st.createQuery("FROM Paciente WHERE concat_ws(' ', nombre, apellido) LIKE '%"+ nom +"%'").list();
    }
    for (Iterator<Paciente> it = lista.iterator(); it.hasNext();) {
            Paciente pac = it.next();
            model.addRow(new Object[]{
                pac.getId(),pac.getApellido() + ", " + pac.getNombre()
            });
        }
    
    if(lista.isEmpty())JOptionPane.showMessageDialog(this, "<html><font size=5>Esta búsqueda no arrojo resultados..");
}

public void cargarTablaMotivo(int op){
    List<Motivo> lista = null;   
    if (op==1){ 
        int cod = Integer.parseInt(txtIdBuscar.getText());
        lista=AbstractDAO.getListaEntidadesXid(Motivo.class, cod);
    }
    else {
        String nom = txtNombreBuscar.getText();
        lista=AbstractDAO.getListaEntidadesXnom(Motivo.class, nom);              
    }
    
    for (Iterator<Motivo> it = lista.iterator(); it.hasNext();) {
            Motivo m = it.next();
            model.addRow(new Object[]{
                m.getId(), m.getDes()
            });
        } 
    if(lista.isEmpty())JOptionPane.showMessageDialog(this, "<html><font size=5>Esta búsqueda no arrojo resultados..");
}

public void cargarTablaPrueba(int op){
    List<Prueba> lista = null;   
    if (op==1){ 
        int cod = Integer.parseInt(txtIdBuscar.getText());
        lista=AbstractDAO.getListaEntidadesXid(Prueba.class, cod);
    }
    else {
        String nom = txtNombreBuscar.getText();
        lista=AbstractDAO.getListaEntidadesXnom(Prueba.class, nom);              
    }
    
    for (Iterator<Prueba> it = lista.iterator(); it.hasNext();) {
            Prueba m = it.next();
            model.addRow(new Object[]{
                m.getId(), m.getDes()
            });
        } 
    if(lista.isEmpty())JOptionPane.showMessageDialog(this, "<html><font size=5>Esta búsqueda no arrojo resultados..");
}

public void cargarTablaProfesion(int op){
    List<Ocupacion> lista = null;   
    if (op==1){ 
        int cod = Integer.parseInt(txtIdBuscar.getText());
        lista=AbstractDAO.getListaEntidadesXid(Ocupacion.class, cod);
    }
    else {
        String nom = txtNombreBuscar.getText();
        lista=AbstractDAO.getListaEntidadesXnom(Ocupacion.class, nom);              
    }
    
    for (Iterator<Ocupacion> it = lista.iterator(); it.hasNext();) {
            Ocupacion m = it.next();
            model.addRow(new Object[]{
                m.getId(), m.getDes()
            });
        } 
    if(lista.isEmpty())JOptionPane.showMessageDialog(this, "<html><font size=5>Esta búsqueda no arrojo resultados..");
}

public void cargarTablaDiag(int op){
    List<Diagnostico> lista = null;   
    if (op==1){ 
        int cod = Integer.parseInt(txtIdBuscar.getText());
        lista=AbstractDAO.getListaEntidadesXid(Diagnostico.class, cod);
    }
    else {
        String nom = txtNombreBuscar.getText();
        lista=AbstractDAO.getListaEntidadesXnom(Diagnostico.class, nom);              
    }
    
    for (Iterator<Diagnostico> it = lista.iterator(); it.hasNext();) {
            Diagnostico m = it.next();
            model.addRow(new Object[]{
                m.getId(), m.getDes()
            });
        } 
    if(lista.isEmpty())JOptionPane.showMessageDialog(this, "<html><font size=5>Esta búsqueda no arrojo resultados..");
}

private int getId(){
    int selectedRow = this.jTable1.getSelectedRow();
    Object valueAt = model.getValueAt(selectedRow, 0);
    int id = Integer.parseInt(valueAt.toString());
    return id;
}

public void cargarPaciente(){
    if(this.jTable1.isEnabled()){
        int idPac = getId();
        Paciente pac = AbstractDAO.getEntidad(idPac, Paciente.class);

        int cant=fraMenu.getEscritorio().getAllFrames().length;
//        JOptionPane.showMessageDialog(this, "CANT ifra.." +cant);
        JInternalFrame internalFrames[] = fraMenu.getEscritorio().getAllFrames();
        for (int i=0; i<cant; i++) {
            if(internalFrames[i].getTitle().equals("Pruebas realizadas por paciente")){
                iFraPruebasxPac ia;
                ia=(iFraPruebasxPac)internalFrames[i];
                ia.setModal(false);
                ia.setPaciente( idPac, pac.getApellido() + ", " + pac.getNombre());
                ia.show();
                ia.setVisible(true);
                this.dispose();
            } else if(internalFrames[i].getTitle().equals("Listado Consultas que poseen diagnóstico")){
                iFraRConsuDiagnosticos ia;
                ia=(iFraRConsuDiagnosticos)internalFrames[i];
                ia.setModal(false);
                ia.setPaciente( idPac, pac.getApellido() + ", " + pac.getNombre());
                ia.show();
                ia.setVisible(true);
                this.dispose();
            } else if(internalFrames[i].getTitle().equals("Pacientes que no abonaron la consulta")){
                iFraRPacDeudores ia;
                ia=(iFraRPacDeudores)internalFrames[i];
                ia.setModal(false);
                ia.setPaciente( idPac, pac.getApellido() + ", " + pac.getNombre());
                ia.show();
                ia.setVisible(true);
                this.dispose();
            } else if(internalFrames[i].getTitle().equals("Consultas por Fecha y Paciente")){
                iFraRInasistencias ia;
                ia=(iFraRInasistencias)internalFrames[i];
                ia.setModal(false);
                ia.setPaciente( idPac, pac.getApellido() + ", " + pac.getNombre());
                ia.show();
                ia.setVisible(true);
                this.dispose();
            } else if(internalFrames[i].getTitle().equals("Historico de Paciente")){
                iFraTerapia ia;
                ia=(iFraTerapia)internalFrames[i];
                ia.setModal(false);
                ia.setPaciente( idPac, pac.getApellido() + ", " + pac.getNombre());
                ia.show();
                ia.setVisible(true);
                this.dispose();
            }else if(internalFrames[i].getTitle().equals("Seguimiento de Diagnóstico")){
                iFraSeguimiento ia;
                ia=(iFraSeguimiento)internalFrames[i];
                ia.setModal(false);
//                ia.setVisible(true);
                this.dispose();
                ia.setPaciente( idPac, pac.getApellido() + ", " + pac.getNombre());
                ia.show();
                
            }//
        }
    }    
}

public void cargarMotivo(){
    if(this.jTable1.isEnabled()){
        int idPac = getId();
        Motivo m = AbstractDAO.getEntidad(idPac, Motivo.class);
        
        int cant=fraMenu.getEscritorio().getAllFrames().length;
//        JOptionPane.showMessageDialog(this, "CANT ifra.." +cant);
        JInternalFrame internalFrames[] = fraMenu.getEscritorio().getAllFrames();
        for (int i=0; i<cant; i++) {
            if(internalFrames[i].getTitle().equals("Pruebas realizadas por paciente")){
                iFraPruebasxPac ia;
                ia=(iFraPruebasxPac)internalFrames[i];
                ia.setModal(false);
                ia.setPrueba( idPac, m.getDes());
                ia.show();
                ia.setVisible(true);
                this.dispose();
//                JOptionPane.showMessageDialog(this, "Se encontro el ifra..");
            }
        }
    }    
}

public void cargarPrueba(){
    if(this.jTable1.isEnabled()){
        int id = getId();
        Prueba p = AbstractDAO.getEntidad(id, Prueba.class);
        
        int cant=fraMenu.getEscritorio().getAllFrames().length;
//        JOptionPane.showMessageDialog(this, "CANT ifra.." +cant);
        JInternalFrame internalFrames[] = fraMenu.getEscritorio().getAllFrames();
        for (int i=0; i<cant; i++) {
            if(internalFrames[i].getTitle().equals("Pruebas realizadas por paciente")){
                iFraPruebasxPac ia;
                ia=(iFraPruebasxPac)internalFrames[i];
                ia.setModal(false);
                ia.setPrueba( id, p.getDes());
                ia.show();
                ia.setVisible(true);
                this.dispose();
//                JOptionPane.showMessageDialog(this, "Se encontro el ifra..");
            }
        }
    }    
}

public void cargarProfesion(){ //PEGA LOS DATOS EN DIALOG
    if(this.jTable1.isEnabled()){
        int id = getId();
        Ocupacion p = AbstractDAO.getEntidad(id, Ocupacion.class);
        
//        int cant=fraMenu.getEscritorio().getAllFrames().length;
//        JInternalFrame internalFrames[] = fraMenu.getEscritorio().getAllFrames();
//        for (int i=0; i<cant; i++) {
//            if(internalFrames[i].getTitle().equals("Pruebas realizadas por paciente")){
//                iFraPruebasxPac ia;
//                ia=(iFraPruebasxPac)internalFrames[i];
//        ia.setModal(false);
//                ia.setPrueba( id, p.getDes());
//                ia.show();
//                ia.setVisible(true);
//                this.dispose();
////                JOptionPane.showMessageDialog(this, "Se encontro el ifra..");
//            }
//        }
        
//        fraMenu.getEscritorio().get;
//        JOptionPane.showMessageDialog(this, "Titulo: " + JOptionPane.getRootFrame().getTitle());
////        JOptionPane.getRootFrame().getTitle();
//        Frame f = JOptionPane.getFrameForComponent(this);
//        JOptionPane.showMessageDialog(this, "Titulo2: " + JOptionPane.getRootFrame().getTitle());
//        dlgPacOpReporte dialog = new dlgPacOpReporte(f, true);
//        dialog.setProfesion(id, p.getDes());
////        dialog
////        dialog.setVisible(rootPaneCheckingEnabled);
//        dialog.setVisible(true);
//        this.dispose();
//        JOptionPane.showMessageDialog(this, "Titulo3: " + JOptionPane.getRootFrame().getTitle());
    }    
}

public void cargarDiag(){
    if(this.jTable1.isEnabled()){
        int id = getId();
        Diagnostico p = AbstractDAO.getEntidad(id, Diagnostico.class);
        
        int cant=fraMenu.getEscritorio().getAllFrames().length;
        JInternalFrame internalFrames[] = fraMenu.getEscritorio().getAllFrames();
        for (int i=0; i<cant; i++) {
            if(internalFrames[i].getTitle().equals("Listado Consultas que poseen diagnóstico")){
                iFraRConsuDiagnosticos ia;
                ia=(iFraRConsuDiagnosticos)internalFrames[i];
                ia.setModal(false);
                ia.setDiag( id, p.getDes());
                ia.show();
                ia.setVisible(true);
                this.dispose();
            }
        }
    }    
}

public void setOpcion(int op){
    opcion=op;
}

public void habilitarBusqueda(boolean op){
        this.txtNombreBuscar.setEnabled(!op);
        this.txtIdBuscar.setEnabled(op);
        this.txtIdBuscar.setText(null);
        this.txtNombreBuscar.setText(null);
        if(op){ this.txtIdBuscar.grabFocus(); this.rbtNro.setSelected(true);}
        if(!op){ this.txtNombreBuscar.grabFocus(); this.rbtNombre.setSelected(true);}
        defaultTableModel();
    }

public boolean validar(){
    
    boolean res=true;
  
    if(this.rbtNro.isSelected())
    {
        if(txtIdBuscar.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "<html><font size=5>Ingrese un Nro a buscar..");
            txtIdBuscar.grabFocus(); 
            return false;
        }
    }
    else{
        if(txtNombreBuscar.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "<html><font size=5>Ingrese un nombre a buscar..");
            txtNombreBuscar.grabFocus();
            return false;
        }
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
