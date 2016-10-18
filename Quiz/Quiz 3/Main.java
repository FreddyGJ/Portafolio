import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	    int multa = 0, cantvel = 0, multotal = 0;
        double velocidad = 0, velprom = 0, veltotal = 0, velmax = 0;
        String nombre = "", y = "";
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat dec = new DecimalFormat("0.0");
        List<Double> listvel1 = new ArrayList<>();
        List<Double> listvel2 = new ArrayList<>();

        do {
                System.out.print("Introduzca su nombre y apellido: ");
                try {
                    nombre = x.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (nombre.matches(".*\\d+.*")) {
                    System.out.println("Nombre no aceptado. Trate de nuevo.");
                }
        } while (nombre.matches(".*\\d+.*"));

        do {
            do {
                System.out.print("Introduzca la velocidad en millas/hora: ");
                try {
                    velocidad = Double.parseDouble(x.readLine());
                } catch (Exception e) {
                    System.out.print("Valor incorrecto. ");
                    velocidad = -1;
                }

                if (velocidad < 0 || velocidad > 500) {
                    System.out.println("No es una velocidad valida");
                }
            } while (velocidad < 0 || velocidad > 500);

            listvel1.add(velocidad);

            velocidad = velocidad*1.60934;

            listvel2.add(velocidad);

            veltotal = veltotal + velocidad;

            cantvel = cantvel + 1;

            if (velocidad > velmax) {
                velmax = velocidad;
            }

            if (velocidad > 0 && velocidad <= 80) {
                multa = 0;
            } else if (velocidad > 80 && velocidad <=120) {
                multa = 50;
            } else if (velocidad > 120){
                multa = 150;
            }

            multotal = multotal + multa;

            System.out.print("¿Desea continuar?");
            System.out.println(" 'S' para continuar / Cuaquier otra tecla para salir");
            y = x.readLine();

        } while (y.equals("S") || y.equals("s"));

        velprom = veltotal/cantvel;

        System.out.println("Reporte de transito:");
        System.out.println("Nombre: " + nombre + ".");
        System.out.println("Velocidad maxima: " + (dec.format(velmax)) + " km/h.");
        System.out.println("Velocidad promedio: " + (dec.format(velprom)) + " km/h.");
        System.out.println("Multa total: " + multotal + ".");
    }
}