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
public class DiagnosticosXPac {
    private int nroDiag;   
    private String diagnostico;
    private String descripcion;
    private Date fecha;

    public DiagnosticosXPac(int nroDiag, String diagnostico, String descripcion, Date fecha) {
        this.nroDiag = nroDiag;
        this.diagnostico = diagnostico;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    

    public int getNroDiag() {
        return nroDiag;
    }

    public void setNroDiag(int nroDiag) {
        this.nroDiag = nroDiag;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
