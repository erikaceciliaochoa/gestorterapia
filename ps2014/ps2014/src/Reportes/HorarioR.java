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
public class HorarioR {
    private String dia;
    private String estado;
    private String HrDesde;
    private String HrHasta;

    public HorarioR(String dia, String estado, String HrDesde, String HrHasta) {
        this.dia = dia;
        this.estado = estado;
        this.HrDesde = HrDesde;
        this.HrHasta = HrHasta;
    }

    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHrDesde() {
        return HrDesde;
    }

    public void setHrDesde(String HrDesde) {
        this.HrDesde = HrDesde;
    }

    public String getHrHasta() {
        return HrHasta;
    }

    public void setHrHasta(String HrHasta) {
        this.HrHasta = HrHasta;
    }
    
    
    
}
