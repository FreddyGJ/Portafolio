public class Main {

    public static void main(String[] args) {
	    int monedas = 5;
        double usd, eur;

        System.out.println("Convertidor de Monedas");
        System.out.println("Tienes " + monedas + "monedas.");

        usd = monedas / 100.0;
        eur = usd * 0.9;

        System.out.println("USD = $" + usd);
        System.out.println("EUR = €" + eur);
    }
}
