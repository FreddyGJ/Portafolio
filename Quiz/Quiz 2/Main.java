import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double usd = 0, eur;

        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Convertidor de Monedas");

        if (usd >= 0) {
            System.out.print("Por favor introduzca cantidad de dolares: ");
            usd = Double.parseDouble(x.readLine());

            eur = usd * 0.89;

            System.out.println("USD = $" + usd);
            System.out.println("EUR = €" + eur);
        } else {
            System.out.print("Por favor introduzca cantidad valida. Intentelo de nuevo: ");
        }
    }
}
