//PAQUETE
package primerpractica; // esta linea declara que el codigo pertenece al paquete Primerpractica

//IMPORTACION
import javax.swing.JOptionPane; // esta importa la clase JOptionPane de la biblioteca javax.swing, JOptionPane permite crear ventanas simples para interactuar con el usuario

//DECLARACION DE LA CLASE
public class PrimerPractica { /* La palabra clave "public" es un modificador de acceso que indica que la clase es accesible desde cualquier otro código,
 la palabra clave "class" se utiliza para declarar una nueva clase, "PrimerPractica" es el nombre de la clase.
    
define el contenedor principal del programa, contiene el método main, su nombre debe coincidir con el archivo .java
*/
    
//METODO MAIN
    public static void main(String[] args) {
        /*
     "static" Indica que el método pertenece a la clase y no a una instancia específica,
    "void" Indica que el método no devuelve ningún valor,
    "main" Nombre del método principal que ejecuta al iniciar el programa,
    "String" "args" Parámetro que recibe argumentos de línea de comandos */
        JOptionPane.showMessageDialog(null, "clase 1"); //VENTANA DE DIÁLOGO
        /*
        muestra un mensaje al usuario, usa la clase importada "import javax.swing.JOptionPane;" , es ejecutado por el método main de la "public static void main(String[] args)"
        */
    }
    
}
