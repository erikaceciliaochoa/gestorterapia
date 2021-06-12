/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import static Modelo.RangoHorario.cantidad;
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
public class Seguimiento implements Serializable {
    public static enum control{NO, SI, NS};  
    private int num;
    private Paciente paciente;//fk
    private Diagnostico diagnostico;//fk
//    private String descDiagnostico; //Necesito una tabla TurnoXDiagnostico
    private Calendar fecha; 
    private String hora;
    private String conclusion;
    private control estadoControl = control.NO;
    public static int cantidad=0;
    
    public Seguimiento() {
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

    @ManyToOne
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @ManyToOne
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

//    public String getDescDiagnostico() {
//        return descDiagnostico;
//    }
//
//    public void setDescDiagnostico(String descDiagnostico) {
//        this.descDiagnostico = descDiagnostico;
//    }

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

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public control getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(control estadoControl) {
        this.estadoControl = estadoControl;
    }
    
    
    
}
