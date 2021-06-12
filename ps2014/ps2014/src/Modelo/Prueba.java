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
public class Prueba implements Serializable  {
    
    private int id;
    private String des;
    public static int cantidad=0;
    
    public Prueba() {
        cantidad ++;
        id=0;
        des="";
    }

    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
  
    public void setId(int id) {
        this.id = id;
    }

    @Column(length=80)
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
    
}
