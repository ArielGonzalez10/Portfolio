/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;


import entidad.Tarea;
import java.util.List;
import persistencia.ControlPersis;


public class TareaServicios {
    ControlPersis persistencia = new ControlPersis();
    
    public void crearTarea(Tarea pTarea){
        persistencia.crearTarea(pTarea);
    }
    
    public void modificarTarea(Tarea pTarea){
        persistencia.modificarTarea(pTarea);
    }
    
    public void eliminarTarea(int pId){
        persistencia.eliminarTarea(pId);
    }

    public List<Tarea> buscarEntidades() {
        return persistencia.bucarTareas();
    }
    
  
}
