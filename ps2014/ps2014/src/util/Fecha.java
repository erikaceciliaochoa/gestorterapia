/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Fecha {
    
    private Calendar fecha;// = Calendar.getInstance();

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    
    //ESTE MÉTODO HACE QUE TODAS LAS FECHAS TENGAN EL FORMATO DD/MM/AAAA PARA PODER COMPARARLAS 
    //Y QUE NO DE ERROR.
    public String formatearFechas(Calendar c){
        return String.format("%1$td/%1$tm/%1$tY", c.getTime());
    }
    
    //ESTE MÉTODO HACE FALTA PARA COMPARAR LAS FECHAS DEL CONTROL JDATECHOOSER CON LA ACTUAL, 
    //PORQUE UNA ES DE TIPO DATE Y LA OTRA TIPO CALENDAR
    public Date convertirCalendaDate(Calendar c){
        c=Calendar.getInstance();
        Date date=c.getTime();
        return date;
    }
    
    //ESTE METODO DA LA FECHA DEL SISTEMA, CON EL FORMATO DD/MM/AAAA
    public String getFechaActual(){
        Calendar c=Calendar.getInstance();
        return formatearFechas(c);
    }
    
//    public Calendar DateToCalendar(Date date){ 
//      Calendar cal = Calendar.getInstance();
//      cal.setTime(date);
//      return cal;
//    }
//    
//    public Calendar convertDateToCalendar(Date date){
//        Calendar cal;
//        DateFormat format=new SimpleDateFormat("yyyy-mm-dd");
//        format.format(date);
//        cal=format.getCalendar();
//        
//        return cal;
//    }
    
    //*********************usados en paciente
    public String retornarString(Calendar fecha){
        String retorno=null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (fecha != null) {
        retorno = sdf.format(fecha.getTime());
        }
        return retorno;
    }
    public String retornarStringHora(Calendar fecha){
            String retorno=null;
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            if (fecha != null) {
            retorno = sdf.format(fecha.getTime());
            }
            return retorno;
    } 
    
    public Calendar retornarCalendar(String fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = getFechaLocal();    
        try {
            cal.setTime(sdf.parse(fecha));
        } catch (ParseException ex) {
          //JOptionPane.showMessageDialog(null, "Error; compruebe formato de fecha: " + ex);  
        }
        return cal;
    }
    
    public Calendar getCalendar(String fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = getFechaLocal();    
        try {
            cal.setTime(sdf.parse(fecha));
        } catch (ParseException ex) {
          //JOptionPane.showMessageDialog(null, "Error; compruebe formato de fecha: " + ex);  
        }
        return cal;
    }
    
    //*********************usados
    
    public Calendar getFechaLocal(){
        Calendar c=Calendar.getInstance();
        return c;
    }
    
    public String getString(){
        String retorno=null;
        fecha=getFechaLocal();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (fecha != null) {
        retorno = sdf.format(fecha.getTime());
        }
        return retorno;
    }
    public String getStringHora(){
            String retorno=null;
            fecha=getFechaLocal();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            if (fecha != null) {
            retorno = sdf.format(fecha.getTime());
            }
            return retorno;
    } 
    
    public int getAnio(){
        int retorno=0;
        fecha=getFechaLocal();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        if (fecha != null) {
        retorno=Integer.parseInt(sdf.format(fecha.getTime()));
        }
        return retorno;
    }
    public int getMes(){
        int retorno=0;
        fecha=getFechaLocal();
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        if (fecha != null) {
        retorno=Integer.parseInt(sdf.format(fecha.getTime()));
        }
        return retorno;
    }
    
    public String getStringXfecha(Date fecha){
        String retorno=null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (fecha != null) {
        retorno = sdf.format(fecha.getTime());
        }
        return retorno;
    }
    
    public String getStringXHora(Date hr){
        String retorno=null;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        if (fecha != null) {
        retorno = sdf.format(fecha.getTime());
        }
        return retorno;
    }
    
    public int getDayOfTheWeek(Date d){
	GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(d);
        int nroDia=cal.get(Calendar.DAY_OF_WEEK);
	return 	nroDia;	
    }
    
    public String getStringDiaSemana(int nrodia){
      String[] dias={"Domingos","Lunes","Martes", "Miércoles","Jueves","Viernes","Sábados"};
      String nomDia=dias[nrodia - 1];
      return nomDia;     
    }
    
//    private static void obtenerDiaSemana(){
//      String[] dias={"Domingo","Lunes","Martes", "Miércoles","Jueves","Viernes","Sábado"};
//        Date hoy=new Date();
//      int numeroDia=0;
//      Calendar cal= Calendar.getInstance();
//      cal.setTime(hoy);
//      numeroDia=cal.get(Calendar.DAY_OF_WEEK);
//      System.out.println("hoy es "+ dias[numeroDia - 1]);
//    }
    
//     public static void enviar_mes(){
//        String[] meses={"Enero","Febrero","Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
//        java.util.Date date = new java.util.Date();
//        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("MM");
//        String mes = sdf.format(date);
//        int cual_es_el_mes=Integer.parseInt(mes);
//        mes=meses[cual_es_el_mes- 1];
//        JOptionPane.showMessageDialog(null,mes);
//
//    }
    
    public int edad(String fecha_nac) {     //fecha_nac debe tener el formato dd/MM/yyyy  
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String hoy = formato.format(fechaActual);
        String[] dat1 = fecha_nac.split("/");
        String[] dat2 = hoy.split("/");
        int anios,mes; anios=mes=0;
        try{
            anios = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
            mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
            if (mes < 0) {
              anios = anios - 1;
            } else if (mes == 0) {
              int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
              if (dia > 0) {
                anios = anios - 1;
              }
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha:");
    //                NumberFormatException
        }
        return anios;
    }
    

    
//    public String getFormatedCalendar(String fecha){
//        
////        String cal = getFechaLocal();
//        String retorno=null;
//        fecha=getFechaLocal();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        if (fecha != null) {
//        retorno = sdf.format(fecha.getTime());
//        }
//        return retorno;
//    }
    
    public String getFormatedFechaToCalendar(String fechaElegida){
        String retorno=fechaElegida;
        Calendar fechaFormated=retornarCalendar(fechaElegida);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (fechaFormated != null) {
        retorno = sdf.format(fechaFormated.getTime());
        }
        return retorno;
    }
    
//    public Calendar getFormatedCalendarByDate(Date fecha){
//        
//    
//    }
    
    public Date getCalendarToDate(String fechaElegida){
        Date retDate=new Date();;
        Calendar fechaFormated=retornarCalendar(fechaElegida);
        if (fechaFormated != null) {
        retDate = fechaFormated.getTime();
        }
        return retDate;
    }
    
        //    public int calcularEdad(Date fechaNac, Date pFecha){
//
//          Calendar fecha = new GregorianCalendar();
//          fecha.setTime(fechaNac);
//          int diaNacio = fecha.get(Calendar.DATE);
//          int mesNacio = fecha.get(Calendar.MONTH)+1;
//          int anioNacio = fecha.get(Calendar.YEAR);
//
//          fecha.setTime(pFecha);
//          int anioFecha = fecha.get(Calendar.YEAR);
//          int mesFecha = fecha.get(Calendar.MONTH)+1;
//          int diaFecha = fecha.get(Calendar.DATE);
//
//          int difAno = anioFecha - anioNacio;
//          int difMes = mesFecha - mesNacio;
//          int difDia = diaFecha - diaNacio;
//
//          if(difMes <0){
//             difAno-=1;
//          }
//          else {
//              if(difMes == 0) {
//                   if(difDia < 0)
//                   {
//                     difAno-=1;
//                   }  
//              }
//          }
//         return difAno;
//      }
    
    
    //        int año = SelectorFecha.getCalendar().get(Calendar.YEAR);
//        int mes = SelectorFecha.getCalendar().get(Calendar.MONTH) + 1;
//        int dia = SelectorFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
//        txtDía.setText("" + dia);
//        txtMes.setText("" + mes);
//        txtAño.setText("" + año);
        
//        Calendar min = Calendar.getInstance();    
//        min.set(Calendar.YEAR,1970);    
//        min.set(Calendar.MONTH,1);    
//        min.set(Calendar.DATE,1);
//        txtData.setMinSelectableDate(min.getTime());    
//
//        Calendar max = Calendar.getInstance();    
//        max.set(Calendar.YEAR,3000);    
//        max.set(Calendar.MONTH,12);    
//        max.set(Calendar.DATE,31);    
//        txtData.setMaxSelectableDate(max.getTime()); 
        
        public boolean checkFecha(JDateChooser txtData){  
            boolean resp = true;  
            
            if (txtData.getDate()!=null) {  
                System.out.println("true data !null");  
                Calendar min = Calendar.getInstance();    
                min.set(Calendar.YEAR,1900);    
                min.set(Calendar.MONTH,1);    
                min.set(Calendar.DATE,1);               

                Calendar max = Calendar.getInstance();    
                max.set(Calendar.YEAR,3000);    
                max.set(Calendar.MONTH,12);    
                max.set(Calendar.DATE,31);    

                if (txtData.getDate().getTime()>=min.getTime().getTime()) {//maior que a data minima  
                    System.out.println("true data min");  
                    if (txtData.getDate().getTime()<=max.getTime().getTime()) {//menor que a data máxima  
                        System.out.println("true data max");  
                        resp = true;  
                    }else{  
//                        System.out.println("false data max"); 
                        resp = false;  
                    }  
                }else{  
                    System.out.println("false data min");  
                    resp = false;  
                }  
            }else{  
                System.out.println("false data null");  
                resp = false;  
            }  
            return resp;  
        } 
    
//    public String getFormatedHoraToCalendar(String fechaElegida){
//        String retorno=fechaElegida;
//        fecha=getFechaLocal();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        if (fecha != null) {
//        retorno = sdf.format(fecha.getTime());
//        }
//        return retorno;
//    }
    
    
    //jDateChooser1.getDateEditor().getUiComponent().addKeyListener(new java.awt.event.KeyListener() {
//        @Override
//        public void keyTyped(java.awt.event.KeyEvent e){
//               
//            try{
//           
//            if(Color.RED == jDateChooser1.getDateEditor().getUiComponent().getForeground() ){
//            System.out.println("No valido");
//            }else{
//            System.out.println("valido");
//           
//           
//            }
//         }catch(UnsupportedOperationException uop){
//             System.out.println(uop.getMessage());
//         }
//       
//            }
//           
//            @Override
//            public void keyPressed(KeyEvent e) {
//                try{
//                   
//         }catch(UnsupportedOperationException uop){
//             System.out.println(uop.getMessage());
//         }
//           
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                try{
//                   
//         }catch(UnsupportedOperationException uop){
//             System.out.println(uop.getMessage());
//         }
//            }
//        });
    
    
//    System.out.println("Datos iniciales:");
//  // Fecha / Hora
//  String stFecha1 = "22/01/2011 14:36"; 
//  String stFecha2 = "22/01/2011 14:35";
//  String stFecha3 = "22/02/2011 14:36";
//   
//  System.out.println("Fecha/Hora-1:"+stFecha1);
//  System.out.println("Fecha/Hora-2:"+stFecha2);
//  System.out.println("Fecha/Hora-3:"+stFecha3);
// 
//  System.out.println();
//  System.out.println();
// 
//  // Utilizando Date y SimpleDateFormat
//   
//  System.out.println();
//  System.out.println("Utilizando Date:");
//  System.out.println();
//   
//  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//  
//  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null
//  Date fecha1 = sdf.parse(stFecha1 , new ParsePosition(0));
//  
//  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null
//  Date fecha2 = sdf.parse(stFecha2 , new ParsePosition(0));
// 
//  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null
//  Date fecha3 = sdf.parse(stFecha3 , new ParsePosition(0));
// 
//   
//  // Comparaciones
//   
//  if ( fecha1.before(fecha2) ) System.out.println(" Fecha1 es anterior a fecha2.");
//  else System.out.println(" Fecha1 NO es anterior a fecha2.");
//  
//  if ( fecha1.before(fecha3) ) System.out.println(" Fecha1 es anterior a fecha3.");
//  else System.out.println(" Fecha1 NO es anterior a fecha3.");
//   
//  if ( fecha2.before(fecha3) ) System.out.println(" Fecha2 es anterior a fecha3.");
//  else System.out.println(" Fecha2 NO es anterior a fecha3.");
//   
//   
//   
//  // Utilizando Calendar.
//   
//  System.out.println();
//  System.out.println("Utilizando GregorianCalendar:"); 
//  System.out.println();
//   
//  // Con las mismas fechas, creamos los Calendar's
//   
//  Calendar cal1 = new GregorianCalendar();
//  cal1.setTime(fecha1);
//   
//  Calendar cal2 = new GregorianCalendar();
//  cal2.setTime(fecha2);
//   
//  Calendar cal3 = new GregorianCalendar();
//  cal3.setTime(fecha3);
//   
// 
//  // Comparaciones
//   
//  if ( cal1.before(cal2) ) System.out.println(" Cal1 es anterior a cal2.");
//  else System.out.println(" Cal1 NO es anterior a cal2.");
//  
//  if ( cal1.before(cal3) ) System.out.println(" Cal1 es anterior a Cal3.");
//  else System.out.println(" Cal1 NO es anterior a cal3.");
//   
//  if ( cal2.before(cal3) ) System.out.println(" Cal2 es anterior a Cal3.");
//  else System.out.println(" Cal2 NO es anterior a cal3."); 
//   
//   
//  // Tanto para Date como para Calendar/GregorianCalendar
//  // podemos hacer una comparación "numérica", obteniendo
//  // la representación de la fecha/hora en milisegundos.
//  // Por convenio, esta cuenta se inicia en el 01/01/1970 a las 0:00:00 GMT
//   
//  System.out.println();
//  System.out.println("En milisegundos:"); 
//  System.out.println(); 
//  System.out.println(" Milisegundos de fecha1:"+fecha1.getTime());
//  System.out.println(" Milisegundos de fecha2:"+fecha2.getTime());
//  System.out.println(" Milisegundos de fecha3:"+fecha3.getTime());
//  System.out.println(" Milisegundos de cal1:  "+cal1.getTimeInMillis());
//  System.out.println(" Milisegundos de cal2:  "+cal2.getTimeInMillis());
//  System.out.println(" Milisegundos de cal3:  "+cal3.getTimeInMillis());

    
    
    
}
