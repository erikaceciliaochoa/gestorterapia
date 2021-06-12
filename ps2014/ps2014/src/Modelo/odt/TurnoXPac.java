/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.odt;

/**
 *
 * @author usuario
 */
public class TurnoXPac {
//    public static enum EstatusAsistio{ASISTIO, FALTO};
//    public static enum EstatusPago{ABONADO, IMPAGO};
//    public static enum EstatusTurno{ACTIVO, INACTIVO};
    private int num;
    private String paciente;
    private String fecha; //del turno
    private String hora; //del turno
    private boolean asistio;
    private boolean pago;
    private boolean cancelo;

//    private EstatusAsistio estatusAsistio = EstatusAsistio.FALTO;
//    private EstatusPago estatusPago = EstatusPago.IMPAGO;
//    private EstatusTurno estatusTurno = EstatusTurno.ACTIVO;

    public TurnoXPac(int num, String paciente ,String fecha, String hora, boolean asistio, boolean pago, boolean cancelo) {
        this.num = num;
        this.paciente=paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.asistio = asistio;
        this.pago=pago;
        this.cancelo=cancelo;
    }
    
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isCancelo() {
        return cancelo;
    }

    public void setCancelo(boolean cancelo) {
        this.cancelo = cancelo;
    }


    
    
    
}
