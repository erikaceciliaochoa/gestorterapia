/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author usuario
 */

@Entity
public class Turno implements Serializable{
    public static enum EstatusAsistio{ASISTIO, FALTO};
    public static enum EstatusPago{ABONADO, IMPAGO};
    public static enum EstatusTurno{ACTIVO, INACTIVO};
    private int num;
    private Paciente paciente;//fk
    private HorarioCab horario;//fk
    private Motivo motivo;//fk
//    private String descMotivo;
    private Prueba prueba;//fk
    private String rdoPrueba;
    private Diagnostico diagnostico;//fk
    private String descDiagnostico;
    private Tratamiento tratamiento;//fk
    private String descTratamiento;
    private Calendar fecha; //del turno
    private String hora; //del turno
    private long monto;
    private String observaciones;
    private Calendar fechaSolicitud;
    private String horaSolicitud;
    //estado: asistio o no a la consulta. lo integre en turno.
    private EstatusAsistio estatusAsistio = EstatusAsistio.FALTO;
    private EstatusPago estatusPago = EstatusPago.IMPAGO;
    private EstatusTurno estatusTurno = EstatusTurno.ACTIVO;
    
    public static int cantidad=0;
    
    public Turno() {
        cantidad ++;
    }
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public EstatusAsistio getEstatusAsistio()
    {
        return estatusAsistio;
    }

    public void setEstatusAsistio(EstatusAsistio estatusAsistio)
    {
        this.estatusAsistio = estatusAsistio;
    }

    @ManyToOne
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @ManyToOne
    public HorarioCab getHorario() {
        return horario;
    }

    public void setHorario(HorarioCab horario) {
        this.horario = horario;
    }

    @ManyToOne
    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    @ManyToOne
    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Calendar fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getHoraSolicitud() {
        return horaSolicitud;
    }

    public void setHoraSolicitud(String horaSolicitud) {
        this.horaSolicitud = horaSolicitud;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public EstatusPago getEstatusPago() {
        return estatusPago;
    }

    public void setEstatusPago(EstatusPago estatusPago) {
        this.estatusPago = estatusPago;
    }

    public EstatusTurno getEstatusTurno() {
        return estatusTurno;
    }

    public void setEstatusTurno(EstatusTurno estatusTurno) {
        this.estatusTurno = estatusTurno;
    }

//    public String getDescMotivo() {
//        return descMotivo;
//    }
//
//    public void setDescMotivo(String descMotivo) {
//        this.descMotivo = descMotivo;
//    }

    public String getRdoPrueba() {
        return rdoPrueba;
    }

    public void setRdoPrueba(String rdoPrueba) {
        this.rdoPrueba = rdoPrueba;
    }

    @ManyToOne
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescDiagnostico() {
        return descDiagnostico;
    }

    public void setDescDiagnostico(String descDiagnostico) {
        this.descDiagnostico = descDiagnostico;
    }

    @ManyToOne
    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDescTratamiento() {
        return descTratamiento;
    }

    public void setDescTratamiento(String descTratamiento) {
        this.descTratamiento = descTratamiento;
    }
    
    
    
    
}
