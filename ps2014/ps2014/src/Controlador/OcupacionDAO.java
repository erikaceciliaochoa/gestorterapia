/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Ocupacion;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author usuario
 */
public class OcupacionDAO extends AbstractDAO {
    
    public Ocupacion getOcupacion(String des) throws HibernateException
    {
        Ocupacion ocupacion = null;

        try
        {
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Ocupacion u WHERE u. des = :des");
            query.setParameter("des", des);

            ocupacion = (Ocupacion)query.uniqueResult();
        }
        catch (HibernateException he)
        {
            manejaExcepcion(he);
        }
        finally
        {
            terminaOperacion();
        }

        return ocupacion;
    }
    
}
