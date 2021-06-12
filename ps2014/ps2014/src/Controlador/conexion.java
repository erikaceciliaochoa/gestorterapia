/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.odt.DiagnosticosXCant;
import Modelo.odt.DiagnosticosXPac;
import Modelo.odt.FechasDiagnostico;
import Modelo.odt.MotivosXPac;
import Modelo.odt.PruebasXPac;
import Modelo.odt.TratamientosXPac;
import Modelo.odt.TurnoXPac;
import Reportes.DeudoresR;
import Reportes.DiagnosticoXPacR;
import Reportes.HorarioR;
import Reportes.InasistenciasR;
import Reportes.MotivosComunesR;
import Reportes.PacientesR;
import Reportes.PruebasXPacR;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import util.Encriptador;
import util.Fecha;

/**
 *
 * @author usuario
 */
public class conexion {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private static conexion instancia;
    
    private conexion()
    { }

    public static conexion getInstance() {
     if (instancia == null) {
         instancia = new conexion();
     }
     return instancia;
    }

    public void abrirConexion() 
       { 
           try
             {	
    //            String userName = "sa";
    //            String password = "sa";
    //            String url = "jdbc:sqlserver://localhost:1433;database=Plan_Fallos";//

                //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "1234");

               } catch (Exception e) {
                   System.out.println("Error en conexión " + e.getMessage());
                   JOptionPane.showMessageDialog(null, "Error en conexión.");
               }
       }

       public void cerrarConexion()
       { 
           try {	
               con.close();
           } catch (SQLException e) {
               System.out.println("Error al cerrar conexión" + e.getSQLState());
           }
       }
       
       
       public List<DiagnosticosXCant> getDiagnosticos(int cod)  
       {  
           List diagnosticoList=null;
           diagnosticoList = new ArrayList();
           int cant;
           String nombre, paciente;

           try{
               abrirConexion();
                st=con.createStatement();
                
                String sql= "select d.des,  count(t.num) cant, concat_ws(', ', p.apellido, p.nombre) paciente " + 
                "from turno t, diagnostico d, paciente p " +
                "where t.diagnostico_id=d.id " +
                "and t.paciente_id=p.id " +
                "and t.paciente_id= "+ cod +" " +
                "group by d.des ";
                
                 rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  cant=rs.getInt("cant");   
                  nombre=rs.getString("des");
                  paciente=rs.getString("paciente");

                  diagnosticoList.add(new DiagnosticosXCant(nombre, cant, paciente));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return diagnosticoList; 
       }
       
       public List<DiagnosticosXCant> getDiagnosticosXnom(String nomApe)  
       {  
           List diagnosticoList=null;
           diagnosticoList = new ArrayList();
           int cant;
           String nombre, paciente;

           try{
               abrirConexion();
                st=con.createStatement();
                
                String sql= "select d.des,  count(t.num) cant, concat_ws(', ', p.apellido, p.nombre) paciente " + 
                "from turno t, diagnostico d, paciente p " +
                "where t.diagnostico_id=d.id " +
                "and t.paciente_id=p.id " +
                "and concat_ws(' ', nombre, apellido) LIKE '%"+ nomApe +"%'" +
                " group by d.des ";
                
                 rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  cant=rs.getInt("cant");   
                  nombre=rs.getString("des");
                  paciente=rs.getString("paciente");

                  diagnosticoList.add(new DiagnosticosXCant(nombre, cant, paciente));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return diagnosticoList; 
       }
       
       public List<FechasDiagnostico> geFechasDiagnostico(int codpac, String diagnostico)  
       {  
           List diagnosticoList=null;
           diagnosticoList = new ArrayList();
           String descDiagnostico, nomDiagnostico;
           Date fechas;

           try{
               abrirConexion();
               st=con.createStatement();
               
               String sql= "select t.fecha fecha, d.des nombre, t.descDiagnostico descripcion " + 
                "from turno t, diagnostico d, paciente p " +
                "where t.diagnostico_id=d.id " +
                "and t.paciente_id=p.id " +
                "and t.paciente_id= "+ codpac +" " +
                "and d.des LIKE '%"+ diagnostico +"%'" +
                " group by t.fecha";
                
               rs=st.executeQuery(sql);
                 
               while(rs.next())
               { 
                  fechas=rs.getDate("fecha");   
                  descDiagnostico=rs.getString("descripcion");
                  nomDiagnostico=rs.getString("nombre");

                  diagnosticoList.add(new FechasDiagnostico(fechas, nomDiagnostico, descDiagnostico));
               }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return diagnosticoList; 
       }
       
   public int getCodPacienteXnom(String nomApe)
    {
        int codPac = 0;
        try
        {
           abrirConexion();
           st=con.createStatement();
         
           String sql= "select id " + 
                "from paciente p " +
                "where  concat_ws(', ', apellido, nombre) LIKE '%"+ nomApe +"%'";
                
           rs=st.executeQuery(sql);

           while(rs.next())
           {   codPac=rs.getInt("id"); }

        }catch(Exception e)
        {
            System.out.println("Error en la consulta *" + e.getMessage());
        }finally
        {
           try{ cerrarConexion();}
           catch(Exception e)
           { System.out.println("Error al cerrar conexion *" + e.getMessage());}
        }
        return codPac;
    }
   
   public List<MotivosXPac> getMotivosXPac(int cod, int op)  
       {  
           List motivoList=null;
           motivoList = new ArrayList();
           int nroMot, nroTurno;
           String motivo, obsTurno, sql;
           Date fecha;
           try{
               abrirConexion();
                st=con.createStatement();
                
                if (op==1){
                    sql= "select t.motivo_id nroMotivo, m.des motivo, t.observaciones obs, t.fecha fecha, t.num nroTurno " + 
                    "from turno t, motivo m " +
                    "where t.paciente_id= "+ cod +" " +
                    "and t.motivo_id=m.id ";               
                }else{
                    sql= "select t.prueba_id nroMotivo, m.des motivo, t.observaciones obs, t.fecha fecha, t.num nroTurno " + 
                    "from turno t, motivo m " +
                    "where t.paciente_id= "+ cod +" " +
                    "and t.motivo_id=m.id " +
                    " and t.observaciones not like '' ";                  
                }

                 rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  nroMot=rs.getInt("nroMotivo");   
                  motivo=rs.getString("motivo");
                  obsTurno=rs.getString("obs");
                  fecha=rs.getDate("fecha");
                  nroTurno=rs.getInt("nroTurno"); 
                  
                  motivoList.add(new MotivosXPac(nroMot, motivo, obsTurno, fecha, nroTurno));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return motivoList; 
       }
    
   
      public List<PruebasXPac> getPruebasXPac(int cod, int op)  
       {  
           List pruebaList=null;
           pruebaList = new ArrayList();
           int nroPru, nroTurno;
           String prueba, resultado, sql;
           Date fecha;
           try{
               abrirConexion();
                st=con.createStatement();
                
                if (op==1){
                    sql= "select t.prueba_id nroPrueba, p.des prueba, t.rdoPrueba resultado, t.fecha fecha, t.num nroTurno " + 
                    "from turno t, prueba p " +
                    "where t.paciente_id= "+ cod +" " +
                    "and t.prueba_id=p.id ";               
                }else{
                    sql= "select t.prueba_id nroPrueba, p.des prueba, t.rdoPrueba resultado, t.fecha fecha, t.num nroTurno " + 
                    "from turno t, prueba p " +
                    "where t.paciente_id= "+ cod +" " +
                    "and t.prueba_id=p.id " +
                    " and t.rdoPrueba not like '' ";                  
                }

                 rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  nroPru=rs.getInt("nroPrueba");   
                  prueba=rs.getString("prueba");
                  resultado=rs.getString("resultado");
                  fecha=rs.getDate("fecha");
                  nroTurno=rs.getInt("nroTurno"); 
                  
                  pruebaList.add(new PruebasXPac(nroPru, prueba, resultado, fecha, nroTurno));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<DiagnosticosXPac> getDiagnosticosXPac(int cod, int op)  
       {  
           List diagnosticoList=null;
           diagnosticoList = new ArrayList();
           int nroDiag;
           String diagnostico, descripcion, sql;
           Date fecha;
           try{
               abrirConexion();
                st=con.createStatement();
//                d.id
                if (op==1){
                    sql= "select t.num nroDiag, d.des diagnostico, t.descDiagnostico descDiagnostico, t.fecha fecha " + 
                    "from turno t, diagnostico d " +
                    "where t.paciente_id= "+ cod +" " +
                    " and t.diagnostico_id=d.id ";               
                }else{
                    sql= "select t.num nroDiag, d.des diagnostico, t.descDiagnostico descDiagnostico, t.fecha fecha " + 
                    "from turno t, diagnostico d " +
                    "where t.paciente_id= "+ cod +" " +
                    "and t.diagnostico_id=d.id " +
                    "and t.descDiagnostico not like '' ";                  
                }
                
                 rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  nroDiag=rs.getInt("nroDiag");   
                  diagnostico=rs.getString("diagnostico");
                  descripcion=rs.getString("descDiagnostico");
                  fecha=rs.getDate("fecha");
                  
                  diagnosticoList.add(new DiagnosticosXPac(nroDiag, diagnostico, descripcion, fecha));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return diagnosticoList; 
       }
  
  public List<TratamientosXPac> getTratamientosXPac(int cod, int op)  
       {  
           List tratList=null;
           tratList = new ArrayList();
           int nro;
           String nombre, descripcion, sql;
           Date fecha;
           try{
               abrirConexion();
                st=con.createStatement();
//                t.tratamiento_id
                if (op==1){
                    sql= "select t.num nro, tr.des nombre, t.descTratamiento descripcion, t.fecha fecha " + 
                    "from turno t, tratamiento tr " +
                    "where t.paciente_id= "+ cod +" " +
                    " and t.tratamiento_id=tr.id ";               
                }else{
                    sql= "select t.num nro, tr.des nombre, t.descTratamiento descripcion, t.fecha fecha " + 
                    "from turno t, tratamiento tr " +
                    "where t.paciente_id= "+ cod +" " +
                    "and t.tratamiento_id=tr.id " +
                    "and t.descTratamiento not like '' ";                  
                }
                        
                rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  nro=rs.getInt("nro");   
                  nombre=rs.getString("nombre");
                  descripcion=rs.getString("descripcion");
                  fecha=rs.getDate("fecha");
                  
                  tratList.add(new TratamientosXPac(nro, nombre, descripcion, fecha));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return tratList; 
       }
  
  public String getFechaTurnosXPac(int cod, int op)  
       {  
           Fecha f=new Fecha();
//           Calendar cal = Calendar.getInstance();
           String sql, rdo;
           Date fechaT;
//           fechaT=f.convertirCalendaDate(cal);
           fechaT=null;
           rdo="NO EXISTE";
           sql="";
           try{
               abrirConexion();
                st=con.createStatement();
                
                if (op==1){ //PRIMER TURNO q asistio
                    sql= "SELECT fecha " + 
                    "FROM turno " +
                    "WHERE paciente_id= "+ cod +" " +
                    " AND estatusAsistio=0 AND estatusTurno=0 ORDER BY fecha ASC LIMIT 1 ";        
                }else if (op==2){ //ÚLTIMO TURNO q asistio
                    sql= "SELECT fecha " + 
                    "FROM turno " +
                    "WHERE paciente_id= "+ cod +" " +
                    " AND estatusAsistio=0 AND estatusTurno=0 ORDER BY fecha DESC LIMIT 1 ";                  
                }else if (op==3) { //PROXIMO TURNO q NO asistio y es mayor a hoy. si es mayor q hoy debria ser un turno cancelado
                    sql= "SELECT fecha " + 
                    "FROM turno " +
                    "WHERE paciente_id= "+ cod +" " +
                    " AND estatusAsistio=1 AND estatusTurno=0 AND fecha > CURDATE() ORDER BY fecha DESC LIMIT 1 ";                 
                }          
                rs=st.executeQuery(sql);
                 
                while(rs.next())
                {         
                  fechaT=rs.getDate("fecha");
                }
                if(fechaT!=null)
                    rdo=f.getStringXfecha(fechaT);
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return rdo; 
       }
  
  
  public List<PruebasXPacR> getPruebasXPacR()  
       {  
           List pruebaList=null;
           Fecha f = new Fecha();
           pruebaList = new ArrayList();
           String paciente, horario, prueba, resultado, fecha, sql;
           Date fech;
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select concat_ws(', ', p.apellido, p.nombre) paciente, pr.des prueba, t.rdoPrueba resultado, t.fecha fecha, t.hora hora " + 
               "from turno t, paciente p, prueba pr " +
               "where t.paciente_id=p.id " +
               "and t.prueba_id=pr.id " + 
               " group by concat_ws(', ', p.apellido, p.nombre), pr.des, t.rdoPrueba, t.fecha, t.hora "; 

               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  paciente=rs.getString("paciente");   
                  prueba=rs.getString("prueba");
                  resultado=rs.getString("resultado");
                  fech=rs.getDate("fecha");
                  fecha=f.getStringXfecha(fech); 
                  horario=rs.getString("hora"); 

                  pruebaList.add(new PruebasXPacR(paciente, prueba, resultado, fecha, horario));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<PruebasXPacR> getPruebasXPacR2(int ord,String tipoOrd,int cantReg,int anio,int mes,int idP,int idPru,int ED,int EH,String f1,String f2,String s)  
       {  
           List listaResultado=null;
           Fecha f = new Fecha();
           listaResultado = new ArrayList();
           String paciente, horario, prueba, resultado, fecha, sql;
           Date fech;
           sql="";
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select concat_ws(', ', p.apellido, p.nombre) paciente, pr.des prueba, t.rdoPrueba resultado, t.fecha fecha, t.hora hora " + 
               "from turno t, paciente p, prueba pr " +
               "where t.paciente_id=p.id " +
               "and t.prueba_id=pr.id ";
               if(idP!=0) sql+= " and t.paciente_id = " + idP;
               if(idPru!=0) sql+= " and t.prueba_id = " + idPru;
               if(mes!=0) sql+= " and month(t.fecha) = " + mes;
               if(anio!=0) sql+= " and year(t.fecha) = " + anio;
               if(!f1.isEmpty() && !f2.isEmpty()) sql+= " and t.fecha>= '" + f1 + "' and t.fecha<='" + f2 + "'" ; 
               if(ED!=0 && EH!=0) sql+= " AND p.edad>= "+ ED + " AND p.edad<="+ EH ; 
               if(!s.isEmpty()) sql+= " and p.sexo like '%" + s + "%'" ;
               sql+=" group by concat_ws(', ', p.apellido, p.nombre), pr.des, t.rdoPrueba, t.fecha, t.hora ";
               if(ord==1) sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;
               else sql+=" order by 1," + ord + " " + tipoOrd +" LIMIT " + cantReg;

               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  paciente=rs.getString("paciente");   
                  prueba=rs.getString("prueba");
                  resultado=rs.getString("resultado");
                  fech=rs.getDate("fecha");
                  fecha=f.getStringXfecha(fech); 
                  horario=rs.getString("hora"); 

                  listaResultado.add(new PruebasXPacR(paciente, prueba, resultado, fecha, horario));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return listaResultado; 
       }
  
  public List<MotivosComunesR> getMotivosComunesR()  
       {  
           List pruebaList=null;
           pruebaList = new ArrayList();
           int c, p, tot;
           String motivo, cant, porc, sql;

           try{
               abrirConexion();
               st=con.createStatement();
               
               sql="select count(*) cant from turno t, motivo m where t.motivo_id=m.id";
               rs=st.executeQuery(sql);
               rs.next();
               tot=rs.getInt("cant");
                              
               sql= "select m.des motivo, count(m.des) cant, round(count(*)/" + tot + "*100) promedio " + 
               "from turno t, motivo m " +
               "where t.motivo_id=m.id " +
               "group by m.des " + 
               " order by 2 desc "; 

                rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  motivo=rs.getString("motivo");   
                  c=rs.getInt("cant");
//                  cant= String.valueOf(c);
                  p=rs.getInt("promedio");
                  porc=String.valueOf(p) + " %";

                  pruebaList.add(new MotivosComunesR(motivo, c, porc));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<MotivosComunesR> getMotivosComunesR2(String nom, int ord, String tipoOrd, int cantReg, int anio, int mes)  
       {  
           List listaResultado=null;
           listaResultado = new ArrayList();
           int c, p, tot;
           String motivo, cant,porc, sql;

           try{
               abrirConexion();
               st=con.createStatement();
               
               sql="select count(*) cant from turno t, motivo m where t.motivo_id=m.id ";
               rs=st.executeQuery(sql);
               rs.next();
               tot=rs.getInt("cant");
               
               sql= "select m.des motivo, count(m.des) cant, round(count(*)/" + tot + "*100) promedio " + 
               "from turno t, motivo m " +
               "where t.motivo_id=m.id ";
               if(!nom.isEmpty()) sql+= " and m.des like '%" + nom + "%'" ;
               if(mes!=0) sql+= " and month(t.fecha) = " + mes;
               if(anio!=0) sql+= " and year(t.fecha) = " + anio;
               sql+= " group by m.des ";
               if(ord==1) sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;
               else sql+=" order by 1," + ord + " " + tipoOrd +" LIMIT " + cantReg;        

               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  motivo=rs.getString("motivo");   
                  c=rs.getInt("cant");
//                  cant= String.valueOf(c);
                  p=rs.getInt("promedio");
                  porc=String.valueOf(p) + " %";

                  listaResultado.add(new MotivosComunesR(motivo, c, porc));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return listaResultado; 
       }
  
  public List<DeudoresR> getDeudoresR()  
       {  
           List pruebaList=null;
           pruebaList = new ArrayList();
           int c, p;
           String paciente, deuda, desde, hasta, sql;
           Date fecD, fecH;

           try{
               abrirConexion();
               st=con.createStatement();

               sql= "select concat_ws(', ', p.apellido, p.nombre) paciente, sum(t.monto) deuda, min(t.fecha) desde , max(t.fecha) hasta " + 
               "from turno t, paciente p " +
               "where t.paciente_id=p.id " +
               "and t.estatusAsistio=0 " + 
               "and t.estatusPago=1 " +
               " group by concat_ws(', ', p.apellido, p.nombre) " ; 

               rs=st.executeQuery(sql);
                 
               while(rs.next())
               { 
                  Fecha f = new Fecha();
                  paciente=rs.getString("paciente");   
                  c=rs.getInt("deuda");
                  deuda= String.valueOf(c);
                  fecD = rs.getDate("desde");
                  desde=f.getStringXfecha(fecD);
                  fecH = rs.getDate("hasta");
                  hasta=f.getStringXfecha(fecH);;

                  pruebaList.add(new DeudoresR(paciente, deuda, desde, hasta));
               }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<DeudoresR> getDeudoresR2(int ord,String tipoOrd,int cantReg,int anio,int mes,int idP,int MI,int MF,String opA,int opCant,String f1,String f2)  
       {  
           List pruebaList=null;
           pruebaList = new ArrayList();
           int c, p;
           String paciente, deuda, desde, hasta, sql;
           Date fecD, fecH;

           try{
               abrirConexion();
               st=con.createStatement();

               sql= "select concat_ws(', ', p.apellido, p.nombre) paciente, sum(t.monto) deuda, min(t.fecha) desde , max(t.fecha) hasta " + 
               "from turno t, paciente p " +
               "where t.paciente_id=p.id " +
               "and t.estatusAsistio=0 " + 
               "and t.estatusPago=1 ";
               if(idP!=0) sql+= " and t.paciente_id = " + idP;
               if(mes!=0) sql+= " and month(t.fecha) = " + mes;
               if(anio!=0) sql+= " and year(t.fecha) = " + anio;
               if(!f1.isEmpty() && !f2.isEmpty()) sql+= " and t.fecha>= '" + f1 + "' and t.fecha<='" + f2 + "'" ; 
               if(MI!=0 && MF!=0) sql+= " AND t.monto>= "+ MI + " AND t.monto<="+ MF ; 
               if(!opA.isEmpty()) sql+= " and t.monto " + opA + " " + opCant;        
               sql+=" group by concat_ws(', ', p.apellido, p.nombre) " ;
               if(ord==1) sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;
               else sql+=" order by 1," + ord + " " + tipoOrd +" LIMIT " + cantReg;

//               System.out.println("consulta * " + sql);
               
               rs=st.executeQuery(sql);
                 
               while(rs.next())
               { 
                  Fecha f = new Fecha();
                  paciente=rs.getString("paciente");   
                  c=rs.getInt("deuda");
                  deuda= String.valueOf(c);
                  fecD = rs.getDate("desde");
                  desde=f.getStringXfecha(fecD);
                  fecH = rs.getDate("hasta");
                  hasta=f.getStringXfecha(fecH);;

                  pruebaList.add(new DeudoresR(paciente, deuda, desde, hasta));
               }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<DiagnosticoXPacR> getDiagnosticoXPacR()  
       {  
           List pruebaList=null;
           Fecha f = new Fecha();
           pruebaList = new ArrayList();
           String paciente, diagnostico, observaciones, fecha, sql;
           Date fech;
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select concat_ws(', ', p.apellido, p.nombre) paciente, d.des diagnostico, t.descDiagnostico observaciones, t.fecha fecha " + 
               "from turno t, diagnostico d, paciente p " +
               "where t.diagnostico_id = d.id " +
               "and t.paciente_id=p.id " + 
               " group by concat_ws(', ', p.apellido, p.nombre) "; 

               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  paciente=rs.getString("paciente");   
                  diagnostico=rs.getString("diagnostico");
                  observaciones=rs.getString("observaciones");
                  fech=rs.getDate("fecha");
                  fecha=f.getStringXfecha(fech); 

                  pruebaList.add(new DiagnosticoXPacR(paciente, diagnostico, observaciones, fecha));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }

  public List<DiagnosticoXPacR> getDiagnosticoXPacR2(int ord,String tipoOrd,int cantReg,int anio,int mes,int idP,int idDiag,String obs)  
       {  
           List pruebaList=null;
           Fecha f = new Fecha();
           pruebaList = new ArrayList();
           String paciente, diagnostico, observaciones, fecha, sql;
           Date fech;
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select concat_ws(', ', p.apellido, p.nombre) paciente, d.des diagnostico, t.descDiagnostico observaciones, t.fecha fecha " + 
               "from turno t, diagnostico d, paciente p " +
               "where t.diagnostico_id = d.id " +
               "and t.paciente_id=p.id ";
               if(idP!=0) sql+= " and t.paciente_id = " + idP;
               if(idDiag!=0) sql+= " and t.diagnostico_id = " + idDiag;
               if(!obs.isEmpty()) sql+= " and t.descDiagnostico like '%" + obs + "%'" ;
               if(mes!=0) sql+= " and month(t.fecha) = " + mes;
               if(anio!=0) sql+= " and year(t.fecha) = " + anio;
               sql+=" group by concat_ws(', ', p.apellido, p.nombre) ";         
               if(ord==1) sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;
               else sql+=" order by 1," + ord + " " + tipoOrd +" LIMIT " + cantReg;         
               

               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  paciente=rs.getString("paciente");   
                  diagnostico=rs.getString("diagnostico");
                  observaciones=rs.getString("observaciones");
                  fech=rs.getDate("fecha");
                  fecha=f.getStringXfecha(fech); 

                  pruebaList.add(new DiagnosticoXPacR(paciente, diagnostico, observaciones, fecha));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<InasistenciasR> getInasistenciasR()  
       {  
           List pruebaList=null;
           Fecha f = new Fecha();
           pruebaList = new ArrayList();
           String paciente, horario, fecha,obs, sql;
           Date fech;
           int nro;
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select t.num, concat_ws(', ', p.apellido, p.nombre) paciente, t.fecha fecha, t.hora hora, t.observaciones obs " + 
               "from turno t, paciente p " +
               "where t.paciente_id=p.id ";
//               "and t.estatusAsistio=0 " + 
//               "and t.estatusPago=0 " +  
//               "and t.estatusTurno=0 ";       
//               " group by concat_ws(', ', p.apellido, p.nombre)"; 

//               and estatusAsistio=0 -- EstatusAsistio{ASISTIO, FALTO};
//               and estatusPago=0 -- EstatusPago{ABONADO, IMPAGO};
//               and estatusTurno=0 -- EstatusTurno{ACTIVO, INACTIVO};
               
               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  obs=rs.getString("obs");
                  paciente=rs.getString("paciente");   
                  fech=rs.getDate("fecha");
                  fecha=f.getStringXfecha(fech); 
                  horario=rs.getString("hora");

                  pruebaList.add(new InasistenciasR(paciente, fecha, horario,obs));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<InasistenciasR> getInasistenciasR2(int ord,String tipoOrd,int cantReg,int anio,int mes,int idP,int t,String f1,String f2)  
       {  
           List pruebaList=null;
           Fecha f = new Fecha();
           pruebaList = new ArrayList();
           String paciente, horario, fecha,obs, sql;
           Date fech; int tc,ta,ti;
           if(t==0){tc=1; ta=1; ti=1;} 
           else if(t==1){tc=0; ta=1; ti=0;}
           else if(t==2){tc=0; ti=0;}
           else if(t==3){tc=0; ta=0; ti=0;}
           
           
        //una sola variable 
        //t=0 //Turnos cancelados; tc=1; ta=1; ti=1;
        //t=1//Turnos Adeudados; tc=0; ta=1; ti=0;
        //t=2;//Inasistencias Paciente tc=0; ta=x; ti=1;
        //t=3; //Asistencia Paciente  tc=0; ta=0; ti=0;
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select t.num, concat_ws(', ', p.apellido, p.nombre) paciente, t.fecha fecha, t.hora hora, t.observaciones obs " + 
               "from turno t, paciente p " +
               "where t.paciente_id=p.id ";
//               "and t.estatusAsistio=" + ti +
//               " and t.estatusPago=" + ta + 
//               " and t.estatusTurno=" + tc;
               if(t==0){ sql+= "and t.estatusAsistio=1 and t.estatusPago=1 and t.estatusTurno=1";} 
               if(t==1){ sql+= "and t.estatusAsistio=0 and t.estatusPago=1 and t.estatusTurno=0";} 
               if(t==2){ sql+= "and t.estatusAsistio=1 and t.estatusTurno=0";} 
               if(t==3){ sql+= "and t.estatusAsistio=0 and t.estatusPago=0 and t.estatusTurno=0";} 
               if(idP!=0) sql+= " and t.paciente_id = " + idP;
               if(mes!=0) sql+= " and month(t.fecha) = " + mes;
               if(anio!=0) sql+= " and year(t.fecha) = " + anio;
               if(!f1.isEmpty() && !f2.isEmpty()) sql+= " and t.fecha>= '" + f1 + "' and t.fecha<='" + f2 + "'" ; 
//               sql+=" group by concat_ws(', ', p.apellido, p.nombre) ";         
               if(ord==2) sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;
               else sql+=" order by 2," + ord + " " + tipoOrd +" LIMIT " + cantReg;
               
               System.out.println("consulta * " + sql);
//               " group by concat_ws(', ', p.apellido, p.nombre)"; 

//               and estatusAsistio=0 -- EstatusAsistio{ASISTIO, FALTO};
//               and estatusPago=0 -- EstatusPago{ABONADO, IMPAGO};
//               and estatusTurno=0 -- EstatusTurno{ACTIVO, INACTIVO};
               
               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  obs=rs.getString("obs");
                  paciente=rs.getString("paciente");   
                  fech=rs.getDate("fecha");
                  fecha=f.getStringXfecha(fech); 
                  horario=rs.getString("hora");

                  pruebaList.add(new InasistenciasR(paciente, fecha, horario, obs));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return pruebaList; 
       }

  public List<HorarioR> getHorarioR2(int ord,String tipoOrd,int cantReg,String dia)  
       {  
           List pruebaList=null;
//           Fecha f = new Fecha();
           pruebaList = new ArrayList();
           String d, e, desde, hasta, sql;
//           int idDia;
//           idDia=Integer.parseInt(dia);
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= " select d.id, d.des dia, d.estatus estado ,rh.horaIni desde, rh.horaFin hasta " +
               "from horariocab hc, horariodet hd, dialaboral d, rangohorario rh " +
               "where hd.horarioCab_id=hc.id " +
               "and hd.rangoHorario_id = rh.id " +
               "and hc.diaLaboral_id=d.id ";
//               if(idDia!=0) sql+= " and d.id = " + idDia;
               if(!dia.isEmpty()) sql+= " and d.des like '%" + dia + "%'" ;
               sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;
//               if(ord==1) sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;
//               else sql+=" order by 1," + ord + " " + tipoOrd +" LIMIT " + cantReg;
               
               System.out.println("consulta * " + sql);
               
               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  d=rs.getString("dia");
                  e=rs.getString("estado"); 
                  if(Integer.valueOf(e)==0) e="Día laboral";
                  else e="Día no laboral";
                  desde=rs.getString("desde");
                  hasta=rs.getString("hasta");
//                  desde=f.getStringXHora(rs.getDate("desde"));
//                  hasta=f.getStringXHora(rs.getDate("hasta")); 

                  pruebaList.add(new HorarioR(d, e, desde, hasta));
                }
           }
           catch(Exception ex)
           { System.out.println("Error en la consulta * " + ex.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception ex)
                { System.out.println("Error al cerrar conexion *" + ex.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<HorarioR> getHorarioR()  
       {  
           List pruebaList=null;
//           Fecha f = new Fecha();
           pruebaList = new ArrayList();
           String d, e, desde, hasta, sql;
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= " select d.des dia, d.estatus estado ,rh.horaIni desde, rh.horaFin hasta " +
               "from horariocab hc, horariodet hd, dialaboral d, rangohorario rh " +
               "where hd.horarioCab_id=hc.id " +
               "and hd.rangoHorario_id = rh.id " +
               "and hc.diaLaboral_id=d.id ";   
               
               System.out.println("consulta * " + sql);   
               
               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  d=rs.getString("dia");
                  e=rs.getString("estado"); 
                  desde=rs.getString("desde");
                  hasta=rs.getString("hasta"); 
                  
//                  desde=f.getStringXHora(rs.getDate("desde"));
//                  hasta=f.getStringXHora(rs.getDate("hasta")); 

                  pruebaList.add(new HorarioR(d, e, desde, hasta));
                }
           }
           catch(Exception ex)
           { System.out.println("Error en la consulta * " + ex.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception ex)
                { System.out.println("Error al cerrar conexion *" + ex.getMessage());}
           }
           return pruebaList; 
       }
  
  public List<PacientesR> getPacR(int ord,String tipoOrd,int cantReg,int anio,int mes,String nomP,String nomProf,int ED,int EH,String s,String ec)  
       {  
           List listaResultado=null;
           Fecha f = new Fecha();
           listaResultado = new ArrayList();
           String id, des, fechaNac, edad, fechaAlta, sql;
           int e;
           Date fech;
           try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select p.id id, concat_ws(', ', p.apellido, p.nombre) des, p.fechaNac fechaNac, p.edad edad, p.fechaIngreso fechaAlta " + 
               "from paciente p, ocupacion o " +
               "where p.ocupacion_id=o.id ";
               if(mes!=0) sql+= " and month(p.fechaNac) = " + mes;
               if(anio!=0) sql+= " and year(p.fechaNac) = " + anio;
               if(ED!=0 && EH!=0) sql+= " AND p.edad>= "+ ED + " AND p.edad<="+ EH ; 
               if(!s.isEmpty()) sql+= " and p.sexo like '%" + s + "%'" ;
               if(!ec.isEmpty()) sql+= " and p.estadoCivil like '%" + ec + "%'" ;
               if(!nomProf.isEmpty()) sql+= " and o.des like '%" + nomProf + "%'" ;
               if(!nomP.isEmpty()) sql+= " and concat_ws(' ', p.apellido, p.nombre) like '%" + nomP + "%'" ;      
               sql+= " order by " + ord + " " + tipoOrd + " LIMIT " + cantReg;

//               System.out.println("consulta * " + sql);
               
               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  id=rs.getString("id");   
                  des=rs.getString("des");
                  fech=rs.getDate("fechaNac");
                  fechaNac=f.getStringXfecha(fech);
                  e=rs.getInt("edad");
                  edad=String.valueOf(e);
//                  System.out.println("consulta * " + e+edad);
                  fech=rs.getDate("fechaAlta");
                  fechaAlta=f.getStringXfecha(fech);
//                  System.out.println("consulta * " + id+des+fechaNac+edad+fechaAlta);
                  listaResultado.add(new PacientesR(id, des, fechaNac, edad, fechaAlta));
                }
           }
           catch(Exception ex)
           { System.out.println("Error en la consulta * " + ex.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception ex)
                { System.out.println("Error al cerrar conexion *" + ex.getMessage());}
           }
           return listaResultado; 
       }

  public boolean verificarUsuario(String usu, String pass){
      boolean rdo=false; String sql; int c=0;
      pass = Encriptador.Encriptar(pass);
      try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select * " + 
               "from usuario " +
               "where usu like '%"+ usu + "%'" +
               " and pass like '%" + pass + "%'" ;
               
               rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                    c++;
                }
                if(c!=0) rdo=true;
           }
           catch(Exception ex)
           { System.out.println("Error en la consulta * " + ex.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception ex)
                { System.out.println("Error al cerrar conexion *" + ex.getMessage());}
           }
  
      return rdo;
  }
  
  public boolean verificarRango(String hri, String hrf){
      boolean rdo=false; String sql; int c=0;
      try{
               abrirConexion();
               st=con.createStatement();
               
               sql= "select * " + 
               "from rangoHorario " +
               "where horaIni like '%"+ hri + "%'" +
               " and horaFin like '%" + hrf + "%'" ;
               
               rs=st.executeQuery(sql);
                 
                while(rs.next()) { 
                    c++;
                }
                if(c!=0) rdo=true;
           }
           catch(Exception ex)
           { System.out.println("Error en la consulta * " + ex.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception ex)
                { System.out.println("Error al cerrar conexion *" + ex.getMessage());}
           }
  
      return rdo;
  }
  
public List<TurnoXPac> getTurnosXPac(String nom)  
       {  
           List list=null;
           list = new ArrayList();
           Fecha f=new Fecha();
           int nro, a,pa,tu; boolean aa,paa,tuu;
           String pac, hr, fe, sql;
           Date fecha;
           try{
               abrirConexion();
                st=con.createStatement();
//                t.tratamiento_id
//                if (op==1){
                    sql= "select t.num nro, concat_ws(', ', p.apellido, p.nombre) des, t.fecha fecha, t.hora hora, "
                            + " t.estatusAsistio a ,t.estatusPago pa,t.estatusTurno  tu " + 
                    "from turno t, paciente p " +
                    "where t.paciente_id=p.id " +
                    " and concat_ws(' ', p.apellido, p.nombre) like '%" + nom + "%'" ;                 
//                }
                        
                rs=st.executeQuery(sql);
                 
                while(rs.next())
                { 
                  nro=rs.getInt("nro");   
                  pac=rs.getString("des");
                  fecha=rs.getDate("fecha");
                  fe=f.getStringXfecha(fecha);
                  hr=rs.getString("hora");
                  a=rs.getInt("a");
                  if(a==0) aa=true;
                  else aa=false;
                  pa=rs.getInt("pa");
                  if(pa==0) paa=true;
                  else paa=false;
                  tu=rs.getInt("tu");
                  if(tu==1) tuu=true;
                  else tuu=false;
                  
//                  int num, Calendar fecha, String hora, boolean asistio, boolean pago, boolean cancelo
                  list.add(new TurnoXPac(nro, pac, fe, hr, aa, paa, tuu));
                }
           }
           catch(Exception e)
           { System.out.println("Error en la consulta * " + e.getMessage());}

           finally
           { 
               try{ cerrarConexion();}
               catch(Exception e)
                { System.out.println("Error al cerrar conexion *" + e.getMessage());}
           }
           return list; 
       }
  
  
//___________________________________________________________________________________ Soy una barra separadora :)
/* METODO PARA REALIZAR UNA CONSULTA A LA BASE DE DATOS
 * INPUT:
 *      table => nombre de la tabla donde se realizara la consulta, puede utilizarse tambien INNER JOIN
 *      fields => String con los nombres de los campos a devolver Ej.: campo1,campo2campo_n
 *      where => condicion para la consulta
 * OUTPUT: un object[][] con los datos resultantes, sino retorna NULL
 */
    public Object [][] select(String table, String fields, String where){
        
      int registros = 0;
      String colname[] = fields.split(",");

      //Consultas SQL
      String sql ="SELECT " + fields + " FROM " + table;
      String sql2 = "SELECT count(*) as total FROM " + table;
      if(where!=null)
      {
          sql+= " WHERE " + where;
          sql2+= " WHERE " + where;
      }
      //obtenemos la cantidad de registros existentes en la tabla
      try{
          abrirConexion();
          st=con.createStatement();
//         PreparedStatement pstm = con.prepareStatement(q2);
//         ResultSet res = pstm.executeQuery();
          rs=st.executeQuery(sql2);
//         rs = pstm.executeQuery();
         rs.next();
         registros = rs.getInt("total");
         System.out.println("registros: " + registros + " \nSql2: "+sql2);
//         rs.close();
      }catch(SQLException e){
         System.out.println(e);
      } finally
           { 
               try{ cerrarConexion();}
               catch(Exception ex)
                { System.out.println("Error al cerrar conexion *" + ex.getMessage());}
           }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][fields.split(",").length];
    //realizamos la consulta sql y llenamos los datos en la matriz "Object"
      try{
          abrirConexion();
          st=con.createStatement();
          rs=st.executeQuery(sql);
//         PreparedStatement pstm = con.prepareStatement(q);
//         ResultSet res = pstm.executeQuery();
//         rs=pstm.executeQuery();
         int i = 0;
         while(rs.next()){
            for(int j=0; j<=fields.split(",").length-1;j++){
                data[i][j] = rs.getString( colname[j].trim() );
            }
            i++;         
         }
         System.out.println("data: " + data + " \nSql: "+sql);
//         rs.close();
          }catch(SQLException e){
         System.out.println(e);
        } finally
           { 
               try{ cerrarConexion();}
               catch(Exception ex)
                { System.out.println("Error al cerrar conexion *" + ex.getMessage());}
           }
    return data;
 }
//___________________________________________________________________________________ Soy una barra separadora :)
    
  

}
