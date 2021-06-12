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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author usuario
 */

@Entity
public class DiaLaboral implements Serializable {
    
    public static enum Estatus{ACTIVO, INACTIVO};
    
    private List<HorarioCab> horarioCabs = new ArrayList<HorarioCab>();
    private int id; //nro del día
    private String des; //Nombre del día
    //Usar un arreglo
    private Estatus estatus = Estatus.INACTIVO;
    
    
    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length=50)
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

//    @OneToMany(mappedBy = "diaLaboral",cascade= CascadeType.ALL)
    @OneToMany(mappedBy = "diaLaboral",cascade= CascadeType.ALL)
    public List<HorarioCab> getHorarioCabs() {
        return horarioCabs;
    }

    public void setHorarioCabs(List<HorarioCab> horarioCabs) {
        this.horarioCabs = horarioCabs;
    }
    
    public void addHorarioCab(HorarioCab horarioCab)
    {
        this.horarioCabs.add(horarioCab); //Agrega un horario a la colección.
        horarioCab.setDiaLaboral(this); //setea el horario q le pertece al diaLaboral.
    }
    
//    public void addCompra(Compra compra)
//    {
//        this.compras.add(compra);
//        compra.setUsuario(this);
//    }
    
    public Estatus getEstatus()
    {
        return estatus;
    }

    public void setEstatus(Estatus estatus)
    {
        this.estatus = estatus;
    }
    
    
}
