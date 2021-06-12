/*
 * ContactosDAO.java
 *
 * Creada el 26-ago-2010, 14:36:47
 *
 * Clase Java desarrollada por Alex para el blog http://javatutoriales.blogspot.com/ el día 26-ago-2010
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 *
 */

package Controlador;

import Modelo.Motivo;
import util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com
 * @date 26-ago-2010
 */
public class dao
{  
    private Session sesion; 
    private Transaction tx;  

    public long guardaMotivo(Motivo motivo) throws HibernateException 
    { 
        long id = 0;  

        try 
        { 
            iniciaOperacion(); 
            id = (Long) sesion.save(motivo); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  

        return id; 
    }  

    public void actualizaMotivo(Motivo motivo) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.update(motivo); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public void eliminaMotivo(Motivo motivo) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.delete(motivo); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public Motivo getMotivo(long idMotivo) throws HibernateException 
    { 
        Motivo motivo = null;  
        try 
        { 
            iniciaOperacion(); 
            motivo = (Motivo) sesion.get(Motivo.class, idMotivo); 
        } finally 
        { 
            sesion.close(); 
        }  

        return motivo; 
    }  

    public List<Motivo> getListaMotivos() throws HibernateException 
    { 
        List<Motivo> listaMotivos = null;  

        try 
        { 
            iniciaOperacion(); 
            listaMotivos = sesion.createQuery("from Motivo").list(); 
        } finally 
        { 
            sesion.close(); 
        }  

        return listaMotivos; 
    }  

    private void iniciaOperacion() throws HibernateException 
    { 
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }  

    private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 
}
