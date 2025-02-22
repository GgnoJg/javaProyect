//DECLARACION DEL PAQUETE
package primerpractica;//"package" Palabra clave que indica el inicio de la declaración del paquete, "primerpractica" nombre del paquete que actúa como contenedor

// IMPORTACION
import javax.swing.JOptionPane;//Importar la funcionalidad para crear ventanas de diálogo, "javax.swing" es la biblioteca que contiene componentes de interfaz gráfica, "JOptionPane" Clase para crear diálogos

//DECLARACIÓN DE LA CLASE
public class Main2 { //DefinE la clase principal del programa
    /*
    "public" Modificador que permite acceso desde cualquier parte, "class" Palabra clave para definir una nueva clase,
    "Main2" Nombre de la clase que debe coincidir con el archivo Main2.java
    */

//MÉTODO MAIN
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "clase 2");
        /*
         "JOptionPane" es la clase para crear diálogos, "showMessageDialog" Método para mostrar un mensaje, "null" Indica que no hay ventana padre,
        "clase 2": mensaje que se mostrará al usuario
        Usa la clase importada "import javax.swing.JOptionPane;" y es ejecutado dentro del método main " public static void main(String[] args)"
        */
    }
    
}
    
