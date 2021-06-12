/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.odt;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class FechasDiagnostico {   
    private Date fechas;
    private String diagnostico; //nombre
    private String desDiagnostico; //descripcion

    public FechasDiagnostico(Date fechas, String diagnostico, String desDiagnostico ) {
        this.diagnostico = diagnostico;
        this.fechas = fechas;
        this.desDiagnostico=desDiagnostico;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date  getFechas() {
        return fechas;
    }

    public void setFechas(Date  fechas) {
        this.fechas = fechas;
    }

    public String getDesDiagnostico() {
        return desDiagnostico;
    }

    public void setDesDiagnostico(String desDiagnostico) {
        this.desDiagnostico = desDiagnostico;
    }
    
    
}
