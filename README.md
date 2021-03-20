# APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES

Desarrolle una aplicación Web segura con los siguientes requerimientos:

1. Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
2. Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
3. Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

## Explicación y Resumen del Proyecto

Para crear los dos computadores se utilizará AWS, y estos tendrán un framework Spark, con el cual se podrá realizar un login desde la aplicación web.
Para este LoginService se tendrán que utilizar dos cosas principalmente, la KeyStore y la TrustStore, estas se generaran gracias al Keytool de java, el cual nos ayuda a generar estos certificados y llaves, cada una diferente para las dos máquinas. Estas llaves nos permitirán acceder a los servicios que esten previamente autorizados.

## Empezando e Instalando

Entramos a la carpeta donde queremos guardar nuestro repositorio, en este caso Desktop

`$ cd Desktop`

Clonamos el repositorio en la carpeta

`$ git clone https://github.com/Nikolas2001-13/AREP-Taller6`

Nos dirigimos a la carpeta que contiene el proyecto

`$ cd AREP-Taller6`

Compilamos con maven

`$ mvn package`

Correr proyecto

`mvn exec:java -D "exec.mainClass"="edu.eci.arep.demosecuritylife.HelloService"`

## Prerrequisitos
Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.
Tener conocimiento sobre AWS, Maven, GIT, Spark y GITHUB.
Keytool de java.

## Correr las Pruebas

Para correr las pruebas del programa habrá que ejecutar el comando

`$ mvn test`

## Documentacion

Para generar la documentación habrá que ejecutar el siguiente comando

`$ mvn javadoc:javadoc`

## Construido Con

* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - IDE

## Autor

* **Nikolás Bernal Giraldo** - [Nikolas2001-13](https://github.com/Nikolas2001-13) - Estudiante de la Escuela Colombiana de Ingeniería Julio Gravito

## Licencia

[LICENSE.md](http://www.gnu.org/licenses/gpl.html) 
