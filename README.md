# UsuariosApp

**UsuariosApp** es una aplicación de **consola** en Java que permite capturar información de usuarios y generar un archivo Excel (`.xlsx`) con los datos ingresados. Ideal para terminales Linux, macOS y Windows 10+.

![usuariosApp](img/pantalla.png)


---

## 🔹 Características

- Captura de datos de usuarios:
  - Nombre
  - Usuario
  - Clave 
  - Teléfono
  - Email
  - Sexo (M/F)
- Limpieza de pantalla antes de cada registro para mejor legibilidad.
- Excel generado con:
  - Encabezados estilizados (negrita y color)
  - Filas alternas con color (zebra)
  - Autoajuste de columnas
- Proyecto Maven sencillo, **sin interfaz gráfica**.
- Compatible con Java 25+.

---

## 🔹 Requisitos

- Java 25 o superior
- Maven 3.8+
- Terminal compatible con secuencias ANSI

---

## 🔹 Instalación

1. Clona el repositorio:

```bash
git clone <url-del-repositorio>
cd usuariosApp


 Compila la aplicacion 

mvn clean package

Ejecutala con:
mvn compile exec:java

o si lo prefiere con:
java -jar target/usuariosApp-1.0-SNAPSHOT-shaded.jar


```
``` Desarrollo 
 Emilio J. Gomez
 @moleculax
```
