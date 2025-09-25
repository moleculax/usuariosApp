package com.company.testeos.dto;

import com.company.testeos.model.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreaExcel {

    private static final String FILE_NAME = "ListaDeUsuarios.xlsx";

    public void generaLibroTrabajo(List<Usuario> usuarios) {
        Workbook workbook = null;
        Sheet sheet = null;

        try {
            File file = new File(FILE_NAME);

            if (file.exists()) {
                // 🔹 Si ya existe, lo abrimos
                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheetAt(0); // Primera hoja
                fis.close();
            } else {
                // 🔹 Si no existe, lo creamos desde cero
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Datos de usuarios");

                // Encabezados
                Row headerRow = sheet.createRow(0);
                String[] columnHeaders = {"Nombre", "Usuario", "Password", "Teléfono", "Email", "Sexo"};

                CellStyle headerCellStyle = workbook.createCellStyle();
                Font headerFont = workbook.createFont();
                headerFont.setBold(true);
                headerFont.setColor(IndexedColors.WHITE.getIndex());
                headerCellStyle.setFont(headerFont);
                headerCellStyle.setFillForegroundColor(IndexedColors.BLUE_GREY.getIndex());
                headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                for (int i = 0; i < columnHeaders.length; i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(columnHeaders[i]);
                    cell.setCellStyle(headerCellStyle);
                }
            }

            // 🔹 Buscar la última fila ocupada
            int rowNum = sheet.getLastRowNum() + 1;

            // Agregar usuarios
            for (Usuario usuario : usuarios) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(usuario.getName().toUpperCase());
                row.createCell(1).setCellValue(usuario.getUsuario().toLowerCase());
                row.createCell(2).setCellValue(usuario.getPassword());
                row.createCell(3).setCellValue(usuario.getTelefono());
                row.createCell(4).setCellValue(usuario.getEmail().toLowerCase());
                row.createCell(5).setCellValue(usuario.getSexo().toUpperCase());
            }

            // Ajustar columnas
            for (int i = 0; i < 6; i++) {
                sheet.autoSizeColumn(i);
            }

            // Guardar archivo
            try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
                workbook.write(outputStream);
                System.out.println("✅ Usuarios agregados a " + FILE_NAME);
            }

        } catch (IOException e) {
            System.out.println("❌ Error trabajando con Excel: " + e.getMessage());
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
            } catch (IOException e) {
                System.out.println("❌ Error cerrando workbook: " + e.getMessage());
            }
        }
    }
}
