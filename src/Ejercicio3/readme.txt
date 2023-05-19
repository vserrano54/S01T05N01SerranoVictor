Se copio toda la clase Directorio del Ejercicio 2 en el Ejercicio 3

1.se crearon tres nuevas variables privadas de tipo String: direccionDirectorio, datosParaGuardar y Datos con sus respectivos getter y setter.

2. En el método listarArbol se le asigna a la variable Dato de tipo String todo lo que se va imprimiendo tanto de los directorios como de
los archivos, realizando un salto de línea por cada ítem que se va imprimiendo.

3. se creó el método crearArchivo el cual recibe como parámetro la ruta del directorio y el nombre del archivo
se concatenan para tener completa la ruta del archivo y se crea el archivo.

4. se creó el método escribirArchivo en la clase Directorio el cual recibe como parámetro la ruta completa del archivo donde se va a guardar y
los datos que se van a guardar, se hace uso de la instancian de FileWriter la cual nos permite escribir carácter en un archivo
también se hace uso de5PrintWriter que nos permite crear y escribir un archivo

4. La clase principal tiene lo mismo que la clase Principal del ejercicio anterior, pero se le agrego
código para guardar los datos del directorio que se ingreso para su evaluación.

se asignan los datos leídos en la clase Directorio en la variable datos: "directorio.AsignarDatos()"

se crea un archivo llamando al método crearDirectorio de la clase Directorio: directorio.crearArchivo(nombreDirectorio, "ArchivoNuevo.txt");
pasándole como parámetro el directorio que se ingresó a evaluar y un String ArchivoNuevo.txt, para que cree el archivo con ese nombre.

se llama al método escribirArchivo de la clase Directorio pasando como 







