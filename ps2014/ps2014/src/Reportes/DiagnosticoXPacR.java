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
public class DiagnosticoXPacR {
    private String paciente;   
    private String diagnostico;
    private String observaciones;
    private String fecha;

    public DiagnosticoXPacR(String paciente, String diagnostico, String observaciones, String fecha) {
        this.paciente = paciente;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.fecha = fecha;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
