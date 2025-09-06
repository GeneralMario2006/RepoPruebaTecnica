# Prueba Técnica Java Jr 

## Instrucciones para ejecutar la aplicación

### 1. Requisitos
- **Java JDK 21** (puedes descargarlo desde https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
- **MySQL** u otro gestor de bases de datos compatible.
- Archivo SQL con la base de datos incluido en el repositorio.

---

### 2. Configuración de Java en el sistema
1. Instalar Java JDK.
2. Configurar variables de entorno:

**Windows:**
Nota: la ruta de la variable de entorno es de donde se instalo el jdk de java
JAVA_HOME = C:\Ruta\al\jdk
PATH = %JAVA_HOME%\bin;%PATH%

Verificar la instalación:

Copiar código
java -version

3. Configuración de la base de datos
Crear la base de datos ejecutando el archivo database.sql incluido en el repositorio.

Actualizar el archivo application.properties con los datos de conexión de tu base:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/NOMBRE_BASE
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update

4. Ejecutar la aplicación
En la ruta Tienda-Prueba-Tecnica\Tienda-Prueba-Tecnica
Dara click derecho, abrirá la terminal y ejecutara:
.\mvnw clean install
y luego :
.\mvnw spring-boot:run

La aplicación correrá en http://localhost:8080 (por defecto).

5. Uso de la aplicación
La aplicación tiene una página web que (se encuentra en src/main/resources/PruebaTecnica/prueba-tecnica.html :
Debe ser ejecutada desde visual studio code con OpenLiveServer

Lista los nombres de productos vendidos.

Permite filtrar por categoría.

Solo muestra categorías con ventas del año 2019.

Por defecto, no muestra registros hasta que se seleccione una categoría.

6. Estructura del repositorio
src/ → Código fuente de Spring Boot.
src/main/resources/PruebaTecnica/prueba-tecnica.htm -> Frontend.

src/main/resource/InformacionBD/Prueba-Tecnica-SQL.sql → Creación de tablas y datos de prueba.
En esta ruta también se encuentra toda la información de la base de datos.

src/main/resource/application.properties -> Archivo a modificar para el usuario y contraseña de la base de datos.

README.md → Esta documentación.
