/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tarea implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String descripTarea;
    private String notaAdic;
    private int hora;
    private String dia;
    private String grupo;

    public Tarea() {
        
    }

    public Tarea(int id, String descripTarea, String notaAdic, int hora, String dia, String grupo) {
        this.id = id;
        this.descripTarea = descripTarea;
        this.notaAdic = notaAdic;
        this.hora = hora;
        this.dia = dia;
        this.grupo = grupo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripTarea() {
        return descripTarea;
    }

    public void setDescripTarea(String descripTarea) {
        this.descripTarea = descripTarea;
    }

    public String getNotaAdic() {
        return notaAdic;
    }

    public void setNotaAdic(String notaAdic) {
        this.notaAdic = notaAdic;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
    }
    