/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author moleculax
 */
package com.company.testeos.dto;

import com.company.testeos.model.Usuario;
import java.util.ArrayList;
import java.util.List; // Es buena práctica usar la interfaz List
import java.util.Scanner;

public class CapturaUsuarios {

    public  List<Usuario> getDatos() {
        Scanner scanner = new Scanner(System.in);
        // Usamos List<Usuario> porque es más flexible y se beneficia de polimorfismo
        List<Usuario> listaUsuarios = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n========================================");
            System.out.println("        NUEVO REGISTRO DE USUARIO       ");
            System.out.println("========================================");
            System.out.print("👉 Nombre     : ");
            String name = scanner.nextLine();

            System.out.print("👉 Usuario    : ");
            String usuario = scanner.nextLine();

            System.out.print("👉 Clave      : ");
            String password = scanner.nextLine();

            System.out.print("👉 Teléfono   : ");
            String telefono = scanner.nextLine();

            System.out.print("👉 Email      : ");
            String email = scanner.nextLine();

            System.out.print("👉 Sexo (M/F) : ");
            String sexo = scanner.nextLine();

            // Crear un nuevo objeto Usuario con los datos capturados
            Usuario nuevoUsuario = new Usuario(name, usuario, password, telefono, email, sexo);

            // Añadir el objeto a la lista
            listaUsuarios.add(nuevoUsuario);

            System.out.print("\n¿Deseas introducir otro usuario? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        
        return listaUsuarios;
    
    }
    
   
}