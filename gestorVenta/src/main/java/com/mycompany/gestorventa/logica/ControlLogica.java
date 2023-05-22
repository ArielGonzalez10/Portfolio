/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorventa.logica;

import com.mycompany.gestorventa.entidades.Persona;
import com.mycompany.gestorventa.entidades.Producto;
import com.mycompany.gestorventa.igu.Administrador;
import com.mycompany.gestorventa.igu.GestorProductos;
import com.mycompany.gestorventa.igu.Venta;
import com.mycompany.gestorventa.persistencia.ControlPersis;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class ControlLogica {
    ControlPersis varPersis;
    public ControlLogica(){
       varPersis = new ControlPersis();
    }
    
    public String validarUsuario(String usuario, String contrasenia,int codVerif) {
        
        String mensaje = "";
        
        List<Persona>listaEmpleados = varPersis.traerUsuarios();
        for(Persona empleado: listaEmpleados){
            if(empleado.getUsuario().equals(usuario)){
                if(empleado.getContraseña().equals(contrasenia)){
                    if(empleado.getCodValidacion() == codVerif){
                        mensaje = "El usuario y la contraseña son correctos,Bienvenido";
                        if(empleado.getCargo() == 2){
                            Venta varVenta = new Venta();
                            varVenta.setVisible(true);
                            varVenta.setLocationRelativeTo(null);
                        }else{
                            Administrador varAdministrador = new Administrador();
                            varAdministrador.setVisible(true);
                            varAdministrador.setLocationRelativeTo(null);
                        }
                       
                    }else{
                        mensaje = "El usuario, la contraseña y/o el cod de verificacion son incorrectas";
                    }
                    
                }
            }else{
                mensaje = "El usuario y/o la contraseña son incorrectas";
            }
        }
        return mensaje;
    }

    public void crearUsuario(String nombre, String apellido, String usuario, String contrasenia, int cargo, int codValidacion) {
        Persona varPersona = new Persona();
        varPersona.setApellido(apellido);
        varPersona.setNombre(nombre);
        varPersona.setCargo(cargo);
        varPersona.setContraseña(contrasenia);
        varPersona.setUsuario(usuario);
        varPersona.setCodValidacion(codValidacion);
        varPersis.crearUsuario(varPersona);
    }

    public void eliminarUsuario(int id) {
        varPersis.eliminarUsuario(id);
    }

    public Persona obtenerUsuario(int id) {
        Persona usuario = new Persona();
        usuario = varPersis.obtenerUsuario(id);
        return usuario;
    }

    public void modificarUsuario(Persona varPersona) {
        varPersis.modificarUsuario(varPersona);
    }

    public void crearProducto(Producto varProducto) {
        varPersis.crearProducto(varProducto);
    }

    public Producto buscarProducto(String nombre) {
        return varPersis.buscarProducto(nombre);
    }

    public void modificarProducto(Producto producto) {
        varPersis.modificarProducto(producto);
    }

    public void eliminarProducto(int id) {
        varPersis.eliminarProducto(id);
    }

    public List<Producto> buscarProductos() {
        return varPersis.buscarProductos();
    }

    public List<Producto> buscadorProductos(String producto) {
        return varPersis.buscadorProductos(producto);
    }

    public Producto buscarProducto(int id) {
        return varPersis.buscarProducto(id);
    }

}
