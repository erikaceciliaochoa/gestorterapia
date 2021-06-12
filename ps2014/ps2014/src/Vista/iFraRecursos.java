/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import util.arbol.Directorio;
import util.arbol.DirectoryRenderer;
import util.arbol.FileRenderer;
import util.modalInternalFrame;

/**
 *
 * @author usuario
 */
public final class iFraRecursos extends modalInternalFrame 
implements TreeSelectionListener, TreeExpansionListener {

    DefaultListModel mdlFiles;

    /**
     * Creates new form iFraRecursos
     */
    public iFraRecursos() {
        initComponents();
//        construrtorArbol("/");
       //construrtorArbol("...");
        construrtorArbol("./Recursos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        treeDir = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstFiles = new javax.swing.JList();
        txtRuta = new javax.swing.JTextField();
        btnCrearArbol = new javax.swing.JButton();
        btnMostrarRR = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Recursos");

        treeDir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeDir.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeDir.setAutoscrolls(true);
        treeDir.setRowHeight(26);
        jScrollPane1.setViewportView(treeDir);

        lstFiles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstFilesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstFiles);

        txtRuta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCrearArbol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCrearArbol.setText("Mostrar Ruta");
        btnCrearArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArbolActionPerformed(evt);
            }
        });

        btnMostrarRR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMostrarRR.setText("Mostrar Recursos");
        btnMostrarRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRRActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Preview.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIconTextGap(10);
        btnBuscar.setInheritsPopupMenu(true);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRuta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearArbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarRR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscar, btnCrearArbol, btnMostrarRR});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarRR)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscar, btnCrearArbol, btnMostrarRR, txtRuta});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFilesMouseClicked
//        JOptionPane.showMessageDialog(this, lstFiles.getSelectedValue() + "-" 
//                + lstFiles.getSelectedIndex());
        
        if(!this.lstFiles.isSelectionEmpty()){
        int valor=JOptionPane.showConfirmDialog(this, "<html><font size=5>¿Desea abrir este archivo?","Mensaje",JOptionPane.YES_NO_OPTION);
            if(valor==JOptionPane.YES_OPTION){

                String nom=String.valueOf(lstFiles.getSelectedValue());
    //            String substring = nom.substring(nom.lastIndexOf('\\') + 1, nom.length());  
    //            JOptionPane.showMessageDialog(this, substring);
                try {
                    File file = new File(nom);
    //                JOptionPane.showMessageDialog(this, file);
                    Desktop.getDesktop().open(file);
                } catch(HeadlessException | IOException e) {
                }
            }
       }
    }//GEN-LAST:event_lstFilesMouseClicked

    private void btnCrearArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArbolActionPerformed
        if((txtRuta.getText().trim()).length()!=0){
            construrtorArbol(this.txtRuta.getText());}
        else{
            String msj="<html><font size=5 style=color:red;>Campo vacio. Debe escribir una Ruta.";
            JOptionPane.showMessageDialog(this, msj,"Atención",JOptionPane.WARNING_MESSAGE);
            txtRuta.grabFocus();
        } 
            
    }//GEN-LAST:event_btnCrearArbolActionPerformed

    private void btnMostrarRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRRActionPerformed
        this.txtRuta.setText("");
        construrtorArbol("./Recursos");
        
//        File f = Directorio.get();
//        File f=Directorio.getRuta();
//        this.txtRuta.setText(f.getAbsolutePath());
    }//GEN-LAST:event_btnMostrarRRActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nomArch="";
        String path="";
        
        /**llamamos el metodo que permite cargar la ventana*/
       JFileChooser file=new JFileChooser();
       file.showOpenDialog(this);
       
       /**abrimos el archivo seleccionado*/
       File abre=file.getSelectedFile();
       nomArch=file.getDescription(abre);  
       try {
//       if(!path.isEmpty()){
           path=abre.getAbsolutePath();

           int cant=path.length(); 
           path=path.substring(0, cant);

           int val=cant-nomArch.length();
           path=path.substring(0, val);

            this.txtRuta.setText(path);

           construrtorArbol(this.txtRuta.getText());
      
//       File fil = new File(nomArch);
    //                JOptionPane.showMessageDialog(this, file);
//           try {
    //                    File file = new File(nom);
        //                JOptionPane.showMessageDialog(this, file);
                    Desktop.getDesktop().open(abre);
                } catch(HeadlessException | IOException e) {
            }
//        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed
   
    
    public void construrtorArbol(String ruta){
    
        final int ICON_SIZE = 30;

//        File f = new File("./Recursos/");
        File f = new File(ruta);
//        File f = Directorio.get();

        DefaultMutableTreeNode top = new DefaultMutableTreeNode(f);
        populateNode(top, f);

        DefaultTreeModel modelo = new DefaultTreeModel(top);
        treeDir.setModel(modelo);
        treeDir.setCellRenderer(new DirectoryRenderer(ICON_SIZE)); //Clase
        treeDir.setPreferredSize(new Dimension(250, 200));
        treeDir.getSelectionModel().addTreeSelectionListener(this);
        treeDir.addTreeExpansionListener(this);
        
        mdlFiles = new DefaultListModel();
        lstFiles.setModel(mdlFiles);
        lstFiles.setCellRenderer(new FileRenderer(ICON_SIZE)); //Clase
        lstFiles.setPreferredSize(new Dimension(400, 200));
        lstFiles.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        lstFiles.setVisibleRowCount(-1);       
        
        
    }
    
    private boolean populateNode(DefaultMutableTreeNode node, File f) {
        node.removeAllChildren();
        return populateNode(node, f, 2);
    }
    
    private boolean populateNode(DefaultMutableTreeNode node, File f, int depth) {
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        
        if (files != null && depth > 0) {
            for (int i = 0; i < files.length; i++) {
                DefaultMutableTreeNode curr = 
                        new DefaultMutableTreeNode(files[i]);
                
                populateNode(curr, files[i], depth -1);
                node.add(curr);
            }
        }
        return true;
    }

    /**
     * Se ejecuta cuando cambia el valor seleccionado en la lista.
     * @param e El evento que sucedio
     */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = 
                (DefaultMutableTreeNode) treeDir.getLastSelectedPathComponent();
        
        if (node == null) return;
        
        File f = (File) node.getUserObject();
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        
        mdlFiles.removeAllElements();
        if (files != null) 
            for (int i = 0; i < files.length; i++) {
                mdlFiles.addElement(files[i]);
            }
    }    

    /**
     * Se ejecuta cuando se expande una carpeta
     * @param event El evento que sucedio
     */
    @Override
    public void treeExpanded(TreeExpansionEvent event) {
        TreePath path = event.getPath();
        DefaultMutableTreeNode node = 
                (DefaultMutableTreeNode) path.getLastPathComponent();
        
        if (node == null) return;
        
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        
        File f = (File) node.getUserObject();
        populateNode(node, f);
        
        JTree tree = (JTree) event.getSource();
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        model.nodeStructureChanged(node);
        
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    /**
     * Se ejecuta cuando se cierra una carpeta
     * @param event El evento que sucedio
     */
    @Override
    public void treeCollapsed(TreeExpansionEvent event) {
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearArbol;
    private javax.swing.JButton btnMostrarRR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstFiles;
    private javax.swing.JTree treeDir;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}