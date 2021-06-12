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
import javax.persistence.ManyToOne;

/**
 *
 * @author usuario
 */

@Entity
public class HorarioDet implements Serializable {
    private int id;
    private RangoHorario rangoHorario; //fk
    private HorarioCab horarioCab; //fk
    
    

    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Column(name="rangoHorario_id")
    @ManyToOne
    public RangoHorario getRangoHorario() {
        return rangoHorario;
    }

    public void setRangoHorario(RangoHorario rangoHorario) {
        this.rangoHorario = rangoHorario;
    }

//    @Column(name="horarioCab_id")
    @ManyToOne
    public HorarioCab getHorarioCab() {
        return horarioCab;
    }

    public void setHorarioCab(HorarioCab horarioCab) {
        this.horarioCab = horarioCab;
    }
    
    
    
}
