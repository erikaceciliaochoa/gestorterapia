/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reportes;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class PruebasXPacR {
    private String paciente;
    private String prueba;
    private String resultado;
    private String fecha;
    private String horario;

    public PruebasXPacR(String paciente, String prueba, String resultado, String fecha, String horario) {
        this.paciente = paciente;
        this.prueba = prueba;
        this.resultado = resultado;
        this.fecha = fecha;
        this.horario = horario;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
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
