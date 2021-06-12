/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author usuario
 */

@Entity
public class RangoHorario implements Serializable {
//    private List<HorarioDet> horarioDets = new ArrayList<HorarioDet>();
    private int id;
    private String horaIni;
    private String horaFin;
    public static int cantidad=0;
    
    public RangoHorario() {
        cantidad ++;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length=50)
    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    @Column(length=50)
    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
//    //no lo deberia tener!!! esta referencia daba ERROR!!!
////    @OneToMany(mappedBy = "rangoHorario",cascade= CascadeType.ALL)
//    @OneToMany(mappedBy = "rangoHorario")
//    public List<HorarioDet> getHorarioDets() {
//        return horarioDets;
//    }
//
//    public void setHorarios(List<HorarioDet> horarioDet) {
//        this.horarioDets = horarioDet;
//    }
//    
//    public void addHorarios(HorarioDet horarioDet)
//    {
//        this.horarioDets.add(horarioDet); //Agrega un horario a la colección.
//        horarioDet.setRangoHorario(this); //setea el horario q le pertece al RangoHorario.
//    }
    
    
}
