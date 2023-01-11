# RetoKruger
App para el reto Kruger donde se solicita una aplicación para llevar un registro del inventario del estado de
vacunación de los empleados. Se esta desarrollando esta apicacion para optar por el programa Junior Training program

1 tecnologias utilizadas:

 Spring Boot 2.5.14
 Spring Data JPA
 Spring Security
 Swagger 3.0.0
 Swagger ui 3.0.0
 PostgreSQL/ PgAdmin4 v6.14.
 java 17 
 IDE Intellij Idea
 ( en la carpeta build.gradle se encuentran todas las dependencias, cabe destacar que si no se ejecuta el proyecto en un entorno nuevo con las mismas versiones que el 
 original pueden crearse incongruencias o errores al momento de ejecutarlo, debido a las constantes actualizaciones de spring / java)
 
 
2 Proceso de creacion/Instalacion
 
Pasos
- Se debe crear la Base de datos con el nombre retokruger en postgresql
- luego puedes crear ambas tablas y agregarle algunos usuarios apoyandote en los archivos llenado de datos bd.txt y construccion de BD.txt
-Crear el usuario "elige el nombre" con contraseña "elige el nombre" en el postgresql y fijarte en el proyecto en el apartado de sources/application.properties es donde debes completar la informacion para poder establecer una conexion con la abse de datos
- cabe destacar que se utilizo el IDE Intellij idea, con armado tipo gradle, para la creacion del proyecto, solo es necesario abrir el proyecto y ya se comenzaria a instalar todas las dependencias con el gradle automatiamente
-para la seguridad, en el spring security tambien se indica en el appliaction.properties el usuario y contraseña deseado para que accedas a las diferentes secciones de la Api por tu localhost
- ya con esto deberias poder ejecutar tu proyecto sin ningun tipo de problema

- En la documentacion Swagger podras encontrar informacion mas detallada de los controladores y modelos de la aplicacion, el link de acceso es http://localhost:8090/swagger-ui/index.html, sin embargo recuerda q puede cambiar el puerto que utilizas en el application.properties y ahi tendrias que fijarte en acomodar el link antes compartido, a continuacion algunos ejemplos de como aparece la documentacion:
- ![image](https://user-images.githubusercontent.com/41609652/211692143-7f6b2aa2-c015-4bf1-acb8-8c40dabb71f3.png)

- En esta aplicacion encontraras los diferentes metodos para la creacion,lectura,borrado y actualizacion de usuarios, incluyendo busquedas por tipo de vacuna del usuario, estado,fecha de vacunacion, entre otros metodos
- Modelo de Datos
- ![modelo de datos](https://user-images.githubusercontent.com/41609652/211698258-d69cc3f4-42f7-4db7-9eab-dfde6e503361.png)

- se recomienda utilizar la aplicacion postman, para realizar las distintas consultas de la aplicacion, ya que es un entorno mas comodo visualmente para el usuario

-Como nota final se resalta que el proyecto esta sujeto a cambios, que permitan mejorar la aplicacion a futuro. Gracias





