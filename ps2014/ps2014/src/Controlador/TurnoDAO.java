/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Diagnostico;
import Modelo.Tratamiento;
import Modelo.Turno;
import Modelo.odt.DiagnosticosXCant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author usuario
 */
public class TurnoDAO extends AbstractDAO {
   
//select count(*) cant 
//from turno
//where fecha like '2014-05-12'
//and hora like '09:00 a 10:00'
    public Turno getCantTurno(String fecha, String hora) throws HibernateException
    {
//        int cant = 0;
        Turno turno = null;

        try
        {
            iniciaOperacion();
           
            Query query = getSession().createQuery("FROM Turno t "
                                                            + " WHERE t.fecha like '"+ fecha +"'"
                                                            + " AND t.hora like '"+ hora +"'");
                        
            turno =(Turno) query.uniqueResult();
        }
        catch (HibernateException he)
        {
            manejaExcepcion(he);
        }
        finally
        {
            terminaOperacion();
        }

        return turno;
    }
    
    public List<Turno> getTurnoXfecha(String fecha) throws HibernateException
    {
        List<Turno> listaTurnos = null;

        try
        {
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Turno t WHERE t.fecha LIKE '%"+ fecha +"%'");       
            listaTurnos = query.list();

        }catch(HibernateException he)
        {
            manejaExcepcion(he);
        }finally
        {
            terminaOperacion();
        }

        return listaTurnos;
    }
    
    
    public List<Turno> getTurnoXRangofecha(String f1, String f2) throws HibernateException
    {
        List<Turno> listaTurnos = null;

        try
        {
            iniciaOperacion();       
//             and t.estatusAsistio=1
            Query query = getSession().createQuery("FROM Turno t WHERE t. fecha>='"+ f1 +"' and t. fecha<='"+ f2+"'");
            //A diferencia de SQL, las condiciones se pasan como parámetros.
//            query.setParameter(0, f1);
//            query.setParameter(1, f2);
//            query.setParameter(2, ordenar);
            listaTurnos = query.list();
            
        }catch(HibernateException he)
        {
            manejaExcepcion(he);
//            System.out.printf("ErROR EN: "+Query);
        }finally
        {
            terminaOperacion();
        }

        return listaTurnos;
    }
    
    
    public Diagnostico getDiagnostico(String des) throws HibernateException
    {
        Diagnostico diagnostico = null;

        try
        {
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Diagnostico u WHERE u. des = :des");
            query.setParameter("des", des);

            diagnostico = (Diagnostico)query.uniqueResult();
        }
        catch (HibernateException he)
        {
            manejaExcepcion(he);
        }
        finally
        {
            terminaOperacion();
        }

        return diagnostico;
    }
    
    public Tratamiento getTratamiento(String des) throws HibernateException
    {
        Tratamiento tratamiento = null;

        try
        {
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Tratamiento u WHERE u. des = :des");
            query.setParameter("des", des);

            tratamiento = (Tratamiento)query.uniqueResult();
        }
        catch (HibernateException he)
        {
            manejaExcepcion(he);
        }
        finally
        {
            terminaOperacion();
        }

        return tratamiento;
    }
    
    //getDiagnosticosCant
//    select t.num, d.id, d.des, t.descDiagnostico, count(t.num) cant, t.paciente_id, p.nombre, p.apellido
//from turno t, diagnostico d, paciente p
//where t.diagnostico_id=d.id
//and t.paciente_id=p.id
//and t.paciente_id=1
    
    public List<DiagnosticosXCant> getListDiagnosticosCant(int paciente) throws HibernateException
    {
        List diagnosticoList=null;
        int idDiag=0;
        int idPac=0;
        try
        {
            iniciaOperacion();

            diagnosticoList = new ArrayList();

            Query query = getSession().createQuery("From Turno order by 1");

            List<Turno> lista = query.list();
            int cant=0;

            for (Iterator<Turno> it = lista.iterator(); it.hasNext();) {
                Turno turno = it.next();
//                int numTurno=turno.getNum();
                
                try{      
                    idDiag=turno.getDiagnostico().getId();
                    idPac=turno.getPaciente().getId();

                    if(idPac!=0 && paciente==idPac){
                        List<Diagnostico> diagnosticos = AbstractDAO.getListaEntidades(Diagnostico.class);
    //                    //Navegamos por la lista de detalles utilizando también iterator.
                        for (Iterator<Diagnostico> it1 = diagnosticos.iterator(); it1.hasNext();) {                                        
                            Diagnostico diagnostico = it1.next();
                            if(idDiag!=0 && idDiag==diagnostico.getId()){
                                cant++;
//                                diagnosticoList.add(new DiagnosticosXCant(diagnostico.getDes(), cant));
                                diagnosticoList.add(new DiagnosticosXCant(diagnostico.getDes(), cant, turno.getPaciente().getNombre() + " " + turno.getPaciente().getApellido() ));
                            }        
                        }
                    }        
                } catch(Exception e){}
                
            }  
        }catch(HibernateException he)
        {
            he.printStackTrace();
            manejaExcepcion(he);
        }finally
        {
            terminaOperacion();
        }
        
        return diagnosticoList;
    }
    
    public List<DiagnosticosXCant> getListDiagnosticosCantXnom(String paciente) throws HibernateException
    {
        List diagnosticoList=null;

        try
        {
            iniciaOperacion();

            diagnosticoList = new ArrayList();

            Query query = getSession().createQuery("From Turno order by 1");

            List<Turno> lista = query.list();
            int cant=0;

            for (Iterator<Turno> it = lista.iterator(); it.hasNext();) {
                Turno turno = it.next();
//                int numTurno=turno.getNum();
                int idDiag=turno.getDiagnostico().getId();
                String idPac=turno.getPaciente().getApellido() + " " + turno.getPaciente().getNombre() ;

                if(idPac.contains(paciente)){
                    List<Diagnostico> diagnosticos = AbstractDAO.getListaEntidades(Diagnostico.class);
//                    //Navegamos por la lista de detalles utilizando también iterator.
                    for (Iterator<Diagnostico> it1 = diagnosticos.iterator(); it1.hasNext();) {                                        
                        Diagnostico diagnostico = it1.next();
                        if(idDiag==diagnostico.getId()){
                            cant++;
//                            diagnosticoList.add(new DiagnosticosXCant(diagnostico.getDes(), cant));
                            diagnosticoList.add(new DiagnosticosXCant(diagnostico.getDes(), cant, turno.getPaciente().getNombre() + " " + turno.getPaciente().getApellido() ));
                        }        
                    }
                }
            }  
        }catch(HibernateException he)
        {
            he.printStackTrace();
            manejaExcepcion(he);
        }finally
        {
            terminaOperacion();
        }
        
        return diagnosticoList;
    }
    
    
    
    
    
}
