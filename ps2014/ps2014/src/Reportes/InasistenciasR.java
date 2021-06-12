/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reportes;

/**
 *
 * @author usuario
 */
public class InasistenciasR {
    private String paciente;
    private String fecha;
    private String horario;
    private String observaciones;

//    private int cantidad;
//    private long importe;
//    nroTurno, paciente, fecha, horario
    public InasistenciasR(String paciente, String fecha, String horario, String observaciones) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.horario = horario;
        this.observaciones=observaciones;
    }  

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
    
}
