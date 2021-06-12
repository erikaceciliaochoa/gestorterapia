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
public class MotivosComunesR {
    private String motivo;
    private int cant;
    private String promedio;

    public MotivosComunesR(String motivo, int cant, String promedio) {
        this.motivo = motivo;
        this.cant = cant;
        this.promedio = promedio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }


    
    
    
}
