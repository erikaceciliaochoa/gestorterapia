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
public class DiagnosticosXCant {
//    private int id;
    private String diagnostico;
    private int cant;
    private String paciente;

    public DiagnosticosXCant(String diagnostico, int cant, String paciente) {
        this.diagnostico = diagnostico;
        this.cant = cant;
        this.paciente = paciente;
    }
 
    
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    


    
}
