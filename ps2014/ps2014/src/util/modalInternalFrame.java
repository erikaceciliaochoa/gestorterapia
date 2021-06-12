/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.awt.AWTEvent;
import java.awt.ActiveEvent;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.MenuComponent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author usuario
 */
public class modalInternalFrame extends JInternalFrame {
    // indica si aquest es modal o no.
    private boolean modal;
    private final ImageIcon frameIcon;

    public modalInternalFrame() {
        this.frameIcon = new ImageIcon(this.getClass().getResource("img/icoApp.png"));
        this.modal = false;
        this.setFrameIcon(frameIcon);
    }
    
//    this.setFrameIcon(new ImageIcon(this.getClass().getResource("img/Blog_Artdesigner.png")));

    @Override
    public void show() {
        super.show();
        if (this.modal) {
            startModal();
        }
    }

    @Override
    public void setVisible(boolean value) {
        super.setVisible(value);
        if (modal) {
            if (value) {
                startModal();
            } else {
                stopModal();
            }
        }
    }

    private synchronized void startModal() {

        try {
            if (SwingUtilities.isEventDispatchThread()) {
                EventQueue theQueue =
                        getToolkit().getSystemEventQueue();
                while (isVisible()) {
                    AWTEvent event = theQueue.getNextEvent();
                    Object source = event.getSource();
                    boolean dispatch = true;

                    if (event instanceof MouseEvent) {
                        MouseEvent e = (MouseEvent) event;
                        MouseEvent m =
                                SwingUtilities.convertMouseEvent((Component) e.getSource(), e, this);
                        if (!this.contains(m.getPoint()) && e.getID() != MouseEvent.MOUSE_DRAGGED) {
                            dispatch = false;
                        }
                    }

                    if (dispatch) {
                        if (event instanceof ActiveEvent) {
                            ((ActiveEvent) event).dispatch();
                        } else if (source instanceof Component) {
                            ((Component) source).dispatchEvent(
                                    event);
                        } else if (source instanceof MenuComponent) {
                            ((MenuComponent) source).dispatchEvent(
                                    event);
                        } else {
                            System.err.println(
                                    "Unable to dispatch: " + event);
                        }
                    }
                }
            } else {
                while (isVisible()) {
                    wait();
                }
            }
        } catch (InterruptedException ignored) {
        }

    }

    private synchronized void stopModal() {
        notifyAll();
    }

    public void setModal(boolean modal) {
        this.modal = modal;
    }

    public boolean isModal() {
        return this.modal;
    }
    
}
