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
public class MotivosXPac {
    
    //nroMot, motivo, obsTurno, fecha, nroTurno
    private int nroMot;   
    private String motivo;
    private String obsTurno;
    private Date fecha;
    private int nroTurno;

    public MotivosXPac(int nroMot, String motivo, String obsTurno, Date fecha, int nroTurno) {
        this.nroMot = nroMot;
        this.motivo = motivo;
        this.obsTurno = obsTurno;
        this.fecha = fecha;
        this.nroTurno = nroTurno;
    }

    public int getNroMot() {
        return nroMot;
    }

    public void setNroMot(int nroMot) {
        this.nroMot = nroMot;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObsTurno() {
        return obsTurno;
    }

    public void setObsTurno(String obsTurno) {
        this.obsTurno = obsTurno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(int nroTurno) {
        this.nroTurno = nroTurno;
    }
    
    
    
}
