Ejercicio 1
1.	Cree una clase llamada Directorio y una variable privada de tipo 
	File llamada directorio.

2.	Con su debido constructor que recibe un dato String por parámetro, 
	el cual es la ruta completa del directorio a examinar y el getter 
	y setter de la variable privada directorio.
	
3.	Cree un método llamado validarDirectorio() de tipo boolean el cual 
	hace uso del método exists() que es un método de la clase File el cual 
	comprueba si existe o no el directorio, también se hace uso del método isDirectory() 
	de la clase File el cual comprueba si es o no directorio.
	
4.	Cree un método llamado listarDirectorio(), en el cual se hace uso de una 
	variable de arreglo de tipo String, primeramente se valida si es directorio 
	con el método validarDirectorio(), si no es directorio valido o no existe se 
	imprime el siguiente mensaje en consola: no es un directorio valido, pero si 
	es Directorio valido y existe se asigna la lista de todas las rutas de directorios 
	que se encontraron en la  variable de arreglo de tipo String llamada nombreArchivos,
	luego se ordena alfabéticamente los directorios encontrados con la expresión Arrays.sort 
	pasándole como parámetro el arreglo de rutas, por último se recorre el arreglo con un ciclo 
	for-each imprimiendo cada directorio que se encuentra.
	
5.	Se crea la clase llamada Principal que contiene el método main como punto de 
	inicio del programa, dentro del método main se solicita que ingrese la ruta 
	de directorio a verificar para imprimir todos sus subdirectorios, se instancia
	la clase Directorio en la variable directorio de tipo Directorio pasándolo como
	parámetro la ruta solicitada anteriormente, usado la instancia de Directorio creada 
	se llama al método listarDirectorio() para imprimir por consola la lista de directorios
	que se encontraron.
	
	Fin del Programa.
