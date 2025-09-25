/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.testeos;

import com.company.testeos.dto.CapturaUsuarios;
import com.company.testeos.dto.CreaExcel;
import com.company.testeos.model.Usuario;
import java.util.List;

/**
 *
 * @author moleculax
 */
public class UsuariosApp {

    public static void main(String[] args) {
        // Limpiar pantalla antes de iniciar
        limpiarPantalla();

        // Capturar datos de usuarios
        CapturaUsuarios datosIntro = new CapturaUsuarios();
        List<Usuario> usuar = datosIntro.getDatos();

        // Generar Excel con los usuarios
        CreaExcel generaExcel = new CreaExcel();
        generaExcel.generaLibroTrabajo(usuar);
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

} //END Class
