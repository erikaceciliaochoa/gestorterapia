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
public class HorarioXDia {
    
    //HorarioXDia(id, diaLaboral, horarioDet.getRangoHorario().getHoraIni(), horarioDet.getRangoHorario().getHoraFin() ));
    private int idCab;
    private int idDet;
    private String diaLaboral;
    private int idRango; //
    private String horaIni;
    private String horaFin;
    

    public HorarioXDia(int idCab, int idDet, String diaLaboral, int idRango, String horaIni, String horaFin) {
        this.idCab=idCab;
        this.idDet = idDet;
        this.diaLaboral = diaLaboral;
        this.idRango=idRango;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
    }

    public int getIdDet() {
        return idDet;
    }

    public void setId(int idDet) {
        this.idDet = idDet;
    }

    public String getDiaLaboral() {
        return diaLaboral;
    }

    public void setDiaLaboral(String diaLaboral) {
        this.diaLaboral = diaLaboral;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getIdCab() {
        return idCab;
    }

    public void setIdCab(int idCab) {
        this.idCab = idCab;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }
    
    

}
