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
public class PruebasXPac {
    //nroPru, prueba, resultado, fecha, nroTurno
    private int nroPru;   
    private String prueba;
    private String resultado;
    private Date fecha;
    private int nroTurno;

    public PruebasXPac(int nroPru, String prueba, String resultado, Date fecha, int nroTurno) {
        this.nroPru = nroPru;
        this.prueba = prueba;
        this.resultado = resultado;
        this.fecha = fecha;
        this.nroTurno = nroTurno;
    }

    public int getNroPru() {
        return nroPru;
    }

    public void setNroPru(int nroPru) {
        this.nroPru = nroPru;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
