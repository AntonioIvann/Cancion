import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class Cancion { // Declara una clase pública llamada Cancion

    // Declara dos variables de instancia (atributos) de tipo String: titulo y autor
    String titulo;
    String autor;

    // Constructor predeterminado vacío
    public Cancion() {
    }

    // Constructor con parámetros para inicializar titulo y autor
    public Cancion(String titulo, String autor) {
        this.titulo = titulo; // Asigna el valor del parámetro titulo al atributo titulo de la instancia actual
        this.autor = autor; // Asigna el valor del parámetro autor al atributo autor de la instancia actual
    }

    // Método getter para obtener el valor del atributo titulo
    public String getTitulo() {
        return titulo;
    }

    // Método getter para obtener el valor del atributo autor
    public String getAutor() {
        return autor;
    }

    // Método setter para establecer el valor del atributo titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo; // Establece el valor del atributo titulo con el valor del parámetro titulo
    }

    // Método setter para establecer el valor del atributo autor
    public void setAutor(String autor) {
        this.autor = autor; // Establece el valor del atributo autor con el valor del parámetro autor
    }

    // Método toString para devolver una representación en cadena del objeto Cancion
    @Override
    public String toString() {
        return "Cancion " + "titulo=" + titulo + ", autor=" + autor;
    }

    // Método para crear una canción pidiendo al usuario que ingrese el título y el autor
    public void crearCancion() {
        Scanner leer = new Scanner(System.in); // Crea un objeto Scanner llamado leer para leer la entrada del usuario

        // Solicita al usuario que ingrese el título de la canción
        System.out.println("Ingrese el titulo de la cancion");
        titulo = leer.nextLine(); // Lee la entrada del usuario y la asigna al atributo titulo

        // Solicita al usuario que ingrese el autor de la canción
        System.out.println("Ingrese el autor");
        autor = leer.nextLine(); // Lee la entrada del usuario y la asigna al atributo autor
    }
}
