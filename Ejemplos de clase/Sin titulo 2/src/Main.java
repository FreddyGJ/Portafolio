import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File archivo = new File("archivo.txt");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("Archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura");
        }
    }
}
