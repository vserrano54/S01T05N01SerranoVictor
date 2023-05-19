Ejercicio 2
   Se copio todo el ejercicio 1 y se modificó para que se recorra e imprima recursivamente 
   cada directorio que este contenido dentro de la ruta especificada por parámetro, también se
   agrego la funcionalidad que imprima la última fecha de actualización de cada archivo y que se 
   imprima la unidad de disco a la cual pertenece la rtua especificada.
   
   1. Se renombro el método listarDirectorio() por listarArbol el cual recibe un parámetro de tipo File
   se crearon y agregaron la variable ultimaModificacion de tipo long, fecha de tipo Date, 
   formatoFecha de tipo SimpleDateFormat y fechaModificacion de tipo String
   
   2. se crea una variable de arreglo de tipo File y se le asigna la lista de todos los archivos y directorios
   que contiene la ruta especificada, se comprueba que el arreglo no es nulo y que tiene al menos 
   un indice asignado.
   
   3.si el arreglo no es nulo y tiene al menos un elemento se ordena con la expresion Arrays.sort() pasándole como
   parámetro la lista de directorios y archivos, se recorre la lista con un ciclo for y se verifica
   si el elemento i de la lista es un directorio, si es un directorio se manada a consola e imprime anteponiéndole un guion
   y espacio para diferenciarlo cuando es un directorio o es un archivo.
   
   4. De lo contrario si no es un directorio: se asigna a la variable ultimaModificacion usando el método lastModified de la lista
   en el índice determinado "listFile[i].lastModified()", se asigna a la variable fecha la instanciación como fecha de ultimaModificacion: 
   "fecha = new Date(ultimaModificacion)", se establece un formato de fecha en la variable formatoFecha:
   "formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")", se asigna a la variable fechaModificacion
   la variable fecha estableciéndole el formato creado anteriormente: "fechaModificacion = formatoFecha.format(fecha)",
   se manda a impresión en consola el nombre del archivo concatenandole la fecha de modificación.
   
   5. Se comprueba nuevamente si es un directorio y si es un directorio se manda a 
   llamar el método asi mismo aplicando la recursividad solicitada pasando como parámetro el directorio
   actual donde apunta el índice i. "listarArbol(listFile[i])"
   
   6. si no es un directorio continuo con el recorrido del ciclo de forma normal incrementando el índice hasta terminar la lista.
   
   7. La clase Principal tiene el mismo contenido del ejercicio anterior pero se le agregó 
   una variable de tipo String llamada unidadDisco a la cual se le asigna el código: "directorio.getDirectorio().toPath().getRoot().toString()"
   el cual nos permite obtener la unidad de disco a la que pertenece la ruta ingresada.

   
   
   
   
					