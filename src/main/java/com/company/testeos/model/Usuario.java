/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.testeos.model;

/**
 *
 * @author moleculax
 */
public class Usuario {
    
    String name;
    String usuario;
    String password;
    String telefono;
    String email;
    String sexo;

    public Usuario(String name, String usuario, String password, String telefono, String email, String sexo) {
        this.name = name;
        this.usuario = usuario;
        this.password = password;
        this.telefono = telefono;
        this.email = email;
        this.sexo = sexo;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
    
    
    
} // END Class
