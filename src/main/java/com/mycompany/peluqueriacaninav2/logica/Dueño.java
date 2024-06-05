
package com.mycompany.peluqueriacaninav2.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueño implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_dueño;
    private String Nombre;
    private String celDueño;

    public Dueño() {
    }

    public Dueño(int id_dueño, String Nombre, String celDueño) {
        this.id_dueño = id_dueño;
        this.Nombre = Nombre;
        this.celDueño = celDueño;
    }

    public int getId_dueño() {
        return id_dueño;
    }

    public void setId_dueño(int id_dueño) {
        this.id_dueño = id_dueño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCelDueño() {
        return celDueño;
    }

    public void setCelDueño(String celDueño) {
        this.celDueño = celDueño;
    }
    
    
}
