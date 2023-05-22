/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;


import entidad.Tarea;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ariel
 */
public class ControlPersis {
   
    TareaJpaController tareaJpa = new TareaJpaController();

    public void crearTarea(Tarea pTarea) {
        tareaJpa.create(pTarea);
    }

    public void modificarTarea(Tarea pTarea) {
        try {
            tareaJpa.edit(pTarea);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarTarea(int pId) {
        try {
            tareaJpa.destroy(pId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Tarea> bucarTareas() {
        return tareaJpa.findTareaEntities();
    }

}
