/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Paciente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author usuario
 */
public class PacientesDAO extends AbstractDAO {
    
    
    public List<Paciente> getPacientesXnonApe(String nomApe) throws HibernateException
    {
        List<Paciente> listaPacientes = null;

        try
        {
            iniciaOperacion();

            Query query = getSession().createQuery("FROM Paciente WHERE concat_ws(' ', nombre, apellido) LIKE '%"+ nomApe +"%'");       
            listaPacientes = query.list();

        }catch(HibernateException he)
        {
            he.printStackTrace();
            manejaExcepcion(he);
        }finally
        {
            terminaOperacion();
        }

        return listaPacientes;
    }
    
    public Paciente getPacienteXnom(String nomApe) throws HibernateException
    {
        Paciente paciente = null;

        try
        {
            iniciaOperacion();

            Query query = getSession().createQuery("FROM Paciente WHERE concat_ws(' ', nombre, apellido) LIKE '%"+ nomApe +"%'");       
            paciente = (Paciente)query.uniqueResult();

        }catch(HibernateException he)
        {
            he.printStackTrace();
            manejaExcepcion(he);
        }finally
        {
            terminaOperacion();
        }

        return paciente;
    }
    
}
