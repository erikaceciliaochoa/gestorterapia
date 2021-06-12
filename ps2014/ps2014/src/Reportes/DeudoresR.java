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
public class DeudoresR {
    private String paciente;
    private String deuda;
    private String desde;
    private String hasta;

    public DeudoresR(String paciente, String deuda, String desde, String hasta) {
        this.paciente = paciente;
        this.deuda = deuda;
        this.desde = desde;
        this.hasta = hasta;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDeuda() {
        return deuda;
    }

    public void setDeuda(String deuda) {
        this.deuda = deuda;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    
    
}
