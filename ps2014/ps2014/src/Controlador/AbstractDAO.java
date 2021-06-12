/*
 * AbstractDAO.java
 *
 * Creada el 24/07/2010, 01:22:33 PM
 *
 * Clase Java desarrollada por Alex para el blog http://javatutoriales.blogspot.com/ el día 24/07/2010
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 *
 */

package Controlador;

import util.HibernateUtil;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * @author usuario
 */
public abstract class AbstractDAO
{
    private Session sesion;

    protected void iniciaOperacion()
    {
        sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.getTransaction().begin();
    }

    protected void terminaOperacion()
    {
        sesion.getTransaction().commit();
        sesion.close();
    }

    protected void manejaExcepcion(HibernateException he) throws HibernateException
    {
        sesion.getTransaction().rollback();
//        throw he;
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    protected Session getSession()
    {
        return sesion;
    }

    public static void almacenaEntidad(Object entidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        try
        {
            dummy.iniciaOperacion();
            dummy.getSession().saveOrUpdate(entidad);
            dummy.getSession().flush();
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }
    }

    public static <T> T getEntidad(Serializable id, Class<T> claseEntidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        T objetoRecuperado = null;

        try
        {
            dummy.iniciaOperacion();
            objetoRecuperado = (T) dummy.getSession().get(claseEntidad, id);
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return objetoRecuperado;
    }
    

    public static <T> List<T> getListaEntidades(Class<T> claseEntidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName()).list();
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
    
    public static <T> List<T> getListaEntidadesByDesc(Class<T> claseEntidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " order by 1 desc").list();
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
    
    
    
    public static void borrarEntidad(Object entidad) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        try
        {
            dummy.iniciaOperacion();
            dummy.getSession().delete(entidad);
            dummy.getSession().flush();
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }
    }
    
    public static <T> List<T> getListaEntidadesXnom(Class<T> claseEntidad, String nom) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where des like '%"+ nom +"%'").list();
            //lista = (List<Motivo>)st.createQuery("From Motivo where des like '%"+ nom +"%'").list();
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
    
    public static <T> List<T> getListaEntidadesXnom2(Class<T> claseEntidad, String nom) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where usu like '%"+ nom +"%'").list();
            //lista = (List<Motivo>)st.createQuery("From Motivo where des like '%"+ nom +"%'").list();
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
    
    public static <T> List<T> getListaEntidadesXid(Class<T> claseEntidad, int id) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where id="+ id).list();
            //lista = (List<Motivo>)st.createQuery("From Motivo where id="+ cod).list();
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
    
    //Metodo para devolver la cantidad de filas de la tabla
    //asi se si esta vacia la tabla
    
    public static <T> List<T> getListaEntidadesXPAC(Class<T> claseEntidad, int id, int op) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            
            switch(op){
                case 1:
                    listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where paciente_id="+ id + " and estatusAsistio=1").list();
                    break;
                case 2:
                    listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where paciente_id="+ id + " and estatusPago=1").list();
                    break;
                case 3:
                    listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where paciente_id="+ id + " and estatusTurno=1").list();
                    break;
                case 4:
                    listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where paciente_id="+ id + " and conclusion is not null").list();
                    break;
                default:
                    listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where paciente_id="+ id).list();
                    break;
            }       
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
    
//    public static <T> List<T> getListaEntidadesXFechas(Class<T> claseEntidad, Calendar f1, Calendar f2, int op) throws HibernateException
//    {
//        AbstractDAO dummy = new AbstractDAO(){};
//        Query query=null;
//        List<T> listaResultado = null;
//
//        try
//        {
//            dummy.iniciaOperacion();
//            if(op==0) query = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " t WHERE t. fecha>=? and t. fecha<=? and t.estatusAsistio=0");
//            else if(op==1) query = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " t WHERE t. fecha>=? and t. fecha<=? and t.estatusAsistio=1");
////            Query query = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " t WHERE t. fecha>=? and t. fecha<=? and t. estatusAsistio=? ");
//            query.setParameter(0, f1);
//            query.setParameter(1, f2);
////            query.setParameter(2, op);
//            listaResultado = query.list();
//            
//        }
//        catch (HibernateException he)
//        {
//            dummy.manejaExcepcion(he);
//        }
//        finally
//        {
//            dummy.terminaOperacion();
//        }
//
//        return listaResultado;
//    }
    
    public static <T> List<T> getListaEntidadesXFechas(Class<T> claseEntidad, int codPac,Calendar f1, Calendar f2, int op) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};
        Query query=null;
        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            
            if(claseEntidad.getSimpleName().equals("Seguimiento")){
                query = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " t WHERE t. fecha>=? and t. fecha<=? and paciente_id="+ codPac);
            } else if(claseEntidad.getSimpleName().equals("Turno")){
                if(op==0) query = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " t WHERE t. fecha>=? and t. fecha<=? and t.estatusAsistio=0 and paciente_id="+ codPac);
                else if(op==1) query = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " t WHERE t. fecha>=? and t. fecha<=? and t.estatusAsistio=1 and paciente_id="+ codPac);
            }
            
            query.setParameter(0, f1);
            query.setParameter(1, f2);

            listaResultado = query.list();
            
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
    
    
    
    //INFORME ===================================================
  public static <T> List<T> getReporte(Class<T> claseEntidad, String nom,int ord, String tipoOrd, int cantReg) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};
        Query query=null;
        List<T> listaResultado = null;

        try
        {            
            dummy.iniciaOperacion();
            if(nom.isEmpty())
                query= dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " ORDER BY " + ord);
            else
                query= dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where des like '%"+ nom +"%'  ORDER BY " + ord);
//            " where des like '%"+ nom +"%'"
            
            query.setMaxResults(cantReg);

            listaResultado = query.list();
            
            if(tipoOrd.contains("DESC")){
                Collections.reverse(listaResultado);
            }
//            LIMIT 10 OFFSET 20 --Equivalent to LIMIT 20, 10
//            // SQL: SELECT * FROM table LIMIT start, maxRows;
//            Query q = session.createQuery("FROM table");
//            q.setFirstResult(start);
//            q.setMaxResults(maxRows);
            
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
//            System.out.println("Error en la consulta * " + he.getMessage());
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
  
  
  //OBTENER CANT REGISTROS!!
//  public void obtenetID(){
//        numSeg = 0;
//        List<Seguimiento> lista = AbstractDAO.getListaEntidades(Seguimiento.class);
//        for (Iterator<Seguimiento> it = lista.iterator(); it.hasNext();) {
//            Seguimiento seg = it.next();
//            numSeg = seg.getNum() + 1;
//        }
//        if(numSeg==0){
//            numSeg=1;
//        } 
//    }
  
  public static <T> List<T> getReportePac(Class<T> claseEntidad, String nom,int ord, String tipoOrd, int cantReg) throws HibernateException
    {
        AbstractDAO dummy = new AbstractDAO(){};
        Query query=null;
        List<T> listaResultado = null;

        try
        {            
            dummy.iniciaOperacion();
            if(nom.isEmpty())
                query= dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " ORDER BY " + ord);
            else
                query= dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName() + " where des like '%"+ nom +"%'  ORDER BY " + ord);
//            " where des like '%"+ nom +"%'"
            
            query.setMaxResults(cantReg);

            listaResultado = query.list();
            
            if(tipoOrd.contains("DESC")){
                Collections.reverse(listaResultado);
            }
//            LIMIT 10 OFFSET 20 --Equivalent to LIMIT 20, 10
//            // SQL: SELECT * FROM table LIMIT start, maxRows;
//            Query q = session.createQuery("FROM table");
//            q.setFirstResult(start);
//            q.setMaxResults(maxRows);
            
        }
        catch (HibernateException he)
        {
            dummy.manejaExcepcion(he);
//            System.out.println("Error en la consulta * " + he.getMessage());
        }
        finally
        {
            dummy.terminaOperacion();
        }

        return listaResultado;
    }
  
  
    
}
