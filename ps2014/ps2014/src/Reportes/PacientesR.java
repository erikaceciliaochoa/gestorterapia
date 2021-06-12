/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reportes;

import Modelo.Ocupacion;
import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class PacientesR {
    private String id;
    private String des;  
    private String fechaNac;
    private String edad;
    private String fechaAlta;

    public PacientesR(String id, String des, String fechaNac, String edad, String fechaAlta) {
        this.id = id;
        this.des = des;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.fechaAlta = fechaAlta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    

    
}
