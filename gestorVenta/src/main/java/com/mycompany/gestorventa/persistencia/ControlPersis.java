/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorventa.persistencia;

import com.mycompany.gestorventa.entidades.Persona;
import com.mycompany.gestorventa.entidades.Producto;
import com.mycompany.gestorventa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlPersis {
    PersonaJpaController personaJpa = new PersonaJpaController();
    ProductoJpaController productJpa = new ProductoJpaController();
                //FUNCIONES OCUPADAS EN LA GESTION DE EMPLEADOS
   //busca una lista de usuarios
    public List<Persona> traerUsuarios() {
        return personaJpa.findPersonaEntities();
    }
    //Crea un usuario
    public void crearUsuario(Persona varPersona) {
        personaJpa.create(varPersona);
    }
    //elimina un usuario buscado por id
    public void eliminarUsuario(int id) {
        try {
            personaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //buscar un usuario por id
    public Persona obtenerUsuario(int id) {
        return personaJpa.findPersona(id);
    }
    //modifica los datos de un usuario
    public void modificarUsuario(Persona varPersona) {
        try {
            personaJpa.edit(varPersona);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
                //FUNCIONES OCUPADAS EN LA GESTION DE PRODUCTOS
    //crea un producto
    public void crearProducto(Producto varProducto) {
        productJpa.create(varProducto);
    }
    //busca un producto por nombre
    public Producto buscarProducto(String nombre) {
        return productJpa.buscarProducto(nombre);
    }
    //modifica los datos de un producto
    public void modificarProducto(Producto producto) {
        try {
            productJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //elimina un producto por id
    public void eliminarProducto(int id) {
        try {
            productJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
            //FUNCIONES OCUPADAS EN LA VENTA
    //Busca todos los productos
    public List<Producto> buscarProductos() {
        return productJpa.findProductoEntities();
    }
    //Busca por nombre los productos
    public List<Producto> buscadorProductos(String producto) {
        return productJpa.buscadorProductos(producto);
    }
    //Buscar por id un producto para recuperar su precio unitario
    public Producto buscarProducto(int id) {
        return productJpa.findProducto(id);
    }

}
