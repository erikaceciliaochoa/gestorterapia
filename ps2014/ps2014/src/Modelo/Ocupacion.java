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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author usuario
 */

@Entity
public class Ocupacion implements Serializable {
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    private int id;
    private String des;
    public static int cantidad=0;
    
    public Ocupacion() {
        cantidad ++;
        id=0;
        des="";
    }
    
    @Column(length=80)
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @OneToMany(mappedBy = "ocupacion",cascade= CascadeType.ALL)
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void addPaciente(Paciente paciente)
    {
        this.pacientes.add(paciente); //Agrega un paciente a la colección llamada pacientes.
        paciente.setOcupacion(this); //setea la ocupacion q le pertece al paciente.
    }
    
}
