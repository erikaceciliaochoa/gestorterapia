/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DiaLaboral;
import Modelo.HorarioCab;
import Modelo.HorarioDet;
import Modelo.RangoHorario;
import Modelo.odt.HorarioXDia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author usuario
 */
public class HorarioDAO extends AbstractDAO {
    
    
    public DiaLaboral getDiaLaboralXnom(String des) throws HibernateException
    {
        DiaLaboral diaLaboral = null;

        try
        {
            iniciaOperacion();
            Query query = getSession().createQuery("FROM DiaLaboral u WHERE u. des = :des");
            query.setParameter("des", des);

            diaLaboral = (DiaLaboral)query.uniqueResult();
        }
        catch (HibernateException he)
        {
            manejaExcepcion(he);
        }
        finally
        {
            terminaOperacion();
        }

        return diaLaboral;
    }
    
    public List<Object[]> getHorariosXdia(String dia) throws HibernateException
    {
        List<Object[]> listaHorarios = null;
//        List<RangoHorario> listaHorarios = null;

        try
        {
            iniciaOperacion();

//            Query query = getSession().createQuery("FROM HorarioCab where dia like '%"+ dia +"%'");       
//            listaHorarios = query.list();
            
            
            Query query = getSession().createQuery("SELECT distinct rh.id, rh.horaIni, rh.horaFin " +
                                                    "  from HorarioCab hc, HorarioDet hd, DiaLaboral d, RangoHorario rh" +
                                                    "  where hd.id=hc.id" +
                                                    "  and d.estatus=0" +
                                                    "  and d.des like '%"+ dia +"%'");
//            select distinct rh.horaIni, rh.horaFin
//from HorarioCab hc, HorarioDet hd, DiaLaboral d, RangoHorario rh
//where hd.horarioCab_id = hc.id
//and hd.rangoHorario_id = rh.id
//and hc.diaLaboral_id=d.id
//and d.estatus=0
//and d.des like 'Viernes'
//            Query query = getSession().createQuery("SELECT distinct rh.id, rh.horaIni, rh.horaFin " +
//                                                    "  from HorarioCab hc, HorarioDet hd, DiaLaboral d, RangoHorario rh" +
//                                                    "  where hd.horarioCab_id = hc.id" +
//                                                    "  and hd.rangoHorario_id = rh.id" +
//                                                    "  and hc.diaLaboral_id = d.id" +
//                                                    "  and d.estatus=0" +
//                                                    "  and d.des like '%"+ dia +"%'");
            
//            Query query=getSession().createQuery("SELECT u.des FROM DiaLaboral u WHERE u.id =1");
            //select dialaboral0_.id as id7_, dialaboral0_.des as des7_, dialaboral0_.estatus as estatus7_ from DiaLaboral dialaboral0_ where dialaboral0_.id=1
            
            listaHorarios = query.list();

        }catch(HibernateException he)
        {
            he.printStackTrace();
            manejaExcepcion(he);
        }finally
        {
            terminaOperacion();
        }

        return listaHorarios;
    }
    
    public List<DiaLaboral> getDiasLaborales(int estado) throws HibernateException
    {
        List<DiaLaboral> diaLaboral = null;

        try
        {
            iniciaOperacion();
            Query query = getSession().createQuery("FROM DiaLaboral u WHERE estatus="+estado);
//            Query query = getSession().createQuery("FROM DiaLaboral u WHERE u.estatus = ? ");
//            query.setParameter(0, DiaLaboral.Estatus.ACTIVO);
//            query.setParameter(0, estado);
            
//            Query query = getSession().createQuery("FROM DiaLaboral u WHERE u. des = :des");
//            query.setParameter("des", des);

            diaLaboral = query.list();
        }
        catch (HibernateException he)
        {
            manejaExcepcion(he);
        }
        finally
        {
            terminaOperacion();
        }

        return diaLaboral;
    }
    
    
    public List<RangoHorario> getRangosHorariosXini(String hrIni) throws HibernateException
    {
        List<RangoHorario> listaRangoHorarios = null;

        try
        {
            iniciaOperacion();
            Query query = getSession().createQuery("FROM RangoHorario where horaIni like '%"+ hrIni +"%'");       
            listaRangoHorarios = query.list();

        }catch(HibernateException he)
        {
            he.printStackTrace();
            manejaExcepcion(he);
        }finally
        {
            terminaOperacion();
        }

        return listaRangoHorarios;
    }
    

    public List<HorarioXDia> getHorarios(String dia) throws HibernateException
    {
//        List<List> listaRangoHorarios = null;
        List horarioList=null;
//        List<HorarioXDia> listaHorarioXDia = null;

        try
        {
            iniciaOperacion();

            horarioList = new ArrayList();

            Query query = getSession().createQuery("From HorarioCab order by 1");

            List<HorarioCab> lista = query.list();
            int idDet=0;
            int idCab=0;
            for (Iterator<HorarioCab> it = lista.iterator(); it.hasNext();) {
                HorarioCab horarioCab = it.next();
                idCab++;
                String diaLaboral = horarioCab.getDiaLaboral().getDes();
//                JOptionPane.showMessageDialog(null, diaLaboral);
                boolean act=horarioCab.getDiaLaboral().getEstatus()==DiaLaboral.Estatus.ACTIVO;

                if(diaLaboral.contains(dia) && act){
                    List<HorarioDet> horarioDets = horarioCab.getHorarioDets();
                    //Navegamos por la lista de detalles utilizando también iterator.
                    for (Iterator<HorarioDet> it1 = horarioDets.iterator(); it1.hasNext();) {
                        idDet++;
                        HorarioDet horarioDet = it1.next();
                        //and hd.rangoHorario_id = rh.id
                        //ordena el idCab segun el dia no por order en q se registraron!!por eso da dif.
                        //por eso order by 1
//                        ventaList.add(new HorarioXDia(idCab, idDet, diaLaboral, horarioDet.getRangoHorario().getHoraIni(), horarioDet.getRangoHorario().getHoraFin() ));
                        horarioList.add(new HorarioXDia(idCab, idDet, diaLaboral, horarioDet.getRangoHorario().getId(), horarioDet.getRangoHorario().getHoraIni(), horarioDet.getRangoHorario().getHoraFin() ));
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
//        return listaRangoHorarios;
        return horarioList;
    }
    
    
}
