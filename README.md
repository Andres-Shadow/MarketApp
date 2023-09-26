
# Market App

Es un proyecto simple sobre como realizar una base de un proyecto en SpringBoot, el backend tiene una arquitectura tipo layers o capas mientras que el frontend esta hecho con MVC orientado hacía el manejo de EndPoints en lugar de usar Beans.

## Cómo ejecutarlo

Para ejecutar este proeycto se tienen estos requisitos:

- Java 11 
- Docker instalado
- Gradle instalado

Es obligatorio el uso de Java 11 pues garantiza la estabilidad del proyecto, en cuanto a docker y gradle se pueden llegar a omitir en los siguientes casos:

Se puede omitir docker si se tiene instalado mysql en la máquina hots

Se puede omitir Gradle si se ejecuta el proeycto en InteliJ IDEA pues viene integrado.


### Dependencias

En caso de utilizar docker se debe utilizar el siguiente comando:

```
docker run --name mysql -e MYSQL_ROOT_PASSWORD=(una contraseña) -d mysql:latest
```

Posterior a esto se debe configurar la contraseña utilizada en el archivo Application.yaml en la carpeta:

Business/src/main/resources/application.yaml

# Ejecución del proyecto

Para ejecutar el proyecto se debe ir a la clase WebApplication úbicada en la siguiente ruta:

Web/src/main/java/co/uniquindio/sinfoci/WebApplication.java

#### Diclaimer

Todo el código del proyecto fue realizado en inglés pues facilita el compartir código con otros desarrolladores en cualquier parte del mundo, en caso de querer traducir el código haga un fork a su cuenta personal.
