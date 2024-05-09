public class MainCancion {
    
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        
        Cancion miCancion = new Cancion(); // Crea un objeto de la clase Cancion llamado miCancion
        
        miCancion.crearCancion(); // Llama al método crearCancion() del objeto miCancion para crear una canción
        
        System.out.println(miCancion.toString()); // Imprime la representación en cadena de la canción utilizando el método toString() y lo muestra en la consola
    }
}
