/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util.arbol;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author usuario
 */
public class DirectoryRenderer extends DefaultTreeCellRenderer {
    private final int iconSize;
    private final ImageIcon open;
    private final ImageIcon closed;
    
    /**
     * Crea una nueva instancia de DirectoryRenderer
     * @param iconSize El alto y ancho de los iconos que se van a utilizar.
     */
    public DirectoryRenderer(int iconSize) {
        this.iconSize = iconSize;
        
        /** Cargo las imagenes */
        Image imgOpen = Toolkit.getDefaultToolkit().getImage(
                DirectoryRenderer.class.getResource("images/open.png"));
        Image imgClosed = Toolkit.getDefaultToolkit().getImage(
                DirectoryRenderer.class.getResource("images/closed.png"));

        open = new ImageIcon(imgOpen.getScaledInstance(
                iconSize, iconSize, Image.SCALE_SMOOTH));
        closed = new ImageIcon(imgClosed.getScaledInstance(
                iconSize, iconSize, Image.SCALE_SMOOTH));
    }

    /**
     * El metodo que dibuja cada uno de los elementos del JTree.
     * @param tree El JTree a dibujar
     * @param value El valor del objeto a dibujar
     * @param sel Si esta seleccionado o no
     * @param expanded Si esta expandido o no
     * @param leaf Si es nodo hoja (no tiene hijos)
     * @param row El numero de fila
     * @param hasFocus Si esta seleccionado
     * @return El componente a dibujar
     */
    @Override
    public Component getTreeCellRendererComponent(
            JTree tree, Object value, boolean sel, boolean expanded, 
            boolean leaf, int row, boolean hasFocus) {
        
        /** Mando a llamar el super metodo para que se dibuje */
        super.getTreeCellRendererComponent(
                tree, value, sel, expanded, leaf, row, hasFocus);
        
        /** 
         * Si esta expandido entonces pongo el icono abierto, si no pongo el 
         * icono cerrado
         */
        if (expanded)
            setIcon(open);
        else 
            setIcon(closed);
        
        return this;
    }
    
}
