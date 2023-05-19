Ejercicio 5
1. Se implementa en la clase Directorio: "Directorio implements Serializable"
esto es para poder serializar la clase y deserializarla.

2. se crea el método escribirArchivoSerializado el cual recibe por parametro la ruta completa del archivo
y los datos. se hace uso ObjectOutputStream y writeObject para poder serializar el archivo.

3. se crea el método leerArchivoSerializado pasándole como parámetro la ruta completa del archivo a leer, se hace uso
de ObjectInputStream y FileInputStream que nos permite realizar la deserialización del archivo.
