/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author usuario
 */

@Entity
public class HorarioCab implements Serializable {
    private List<HorarioDet> horarioDets = new ArrayList<HorarioDet>();
    private int id;
    private DiaLaboral diaLaboral; //fk

      
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Column(name=diaLaboral_id)
    @ManyToOne
    public DiaLaboral getDiaLaboral() {
        return diaLaboral;
    }

    public void setDiaLaboral(DiaLaboral diaLaboral) {
        this.diaLaboral = diaLaboral;
    }
    
//     @OneToMany(mappedBy = "horarioCab",cascade= CascadeType.ALL)
    @OneToMany(mappedBy = "horarioCab", cascade = CascadeType.ALL)
    public List<HorarioDet> getHorarioDets() {
        return horarioDets;
    }

    public void setHorarioDets(List<HorarioDet> horarioDets) {
        this.horarioDets = horarioDets;
    }
    
    public void addHorarioDet(HorarioDet horarioDet)
    {
        this.horarioDets.add(horarioDet); //Agrega un detallehorario a la colección.
        horarioDet.setHorarioCab(this); //setea el detalleHorario q le pertece al HorarioCab.
    }
    
    public void deleteHorarioDet(HorarioDet horarioDet)
    {
        this.horarioDets.remove(horarioDet); //quita un detallehorario a la colección.
        horarioDet.setHorarioCab(this); //setea el detalleHorario q le pertece al HorarioCab.
    }

    
}
