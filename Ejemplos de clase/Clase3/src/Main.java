public class Main {

    public static void main(String[] args) {
	    System.out.println("UIP PC2");

        // Declaracion
        int edad;
        // Inicializacion
        edad = 15;

        // Declaracion e Inicializacion
        int suma = 0;

        //Numeros Enteros
        byte a = 0; //Precision 8-bits
        short b = 0; //Precision 16-bits
        int c = 0; //Precision 32-bits -- Recomendado
        long d = 0; //Precision 64-bits

        // Numeros Decimales
        float e = 0.0f; //Precision de 32-bits
        double f = 0.0; //Precision de 64-bits -- Recomendado

        // Operadores Aritmeticos
        double resultado = 0;
        resultado = 5 + 70; //Suma
        resultado = 100 - 35; //Resta
        resultado = 5 * 5; //Multiplicacion
        resultado = 10 / 2; //Division
        resultado = 11 % 2; //Residuo

        // Caracteres
        char sexo = 'F';
        sexo = 'M';

        // Cadenas
        String nombre = "Ana";
        String frase = "El que madruga, encuentra todo cerrado";

        // Booleanos
        boolean condicion = true;
        condicion = false;

        // Operadores Relacionales
        condicion = 5 > 3;
        condicion = 5 < 3;
        condicion = 5 == 3;
        condicion = 5 != 3;
        condicion = 5 >= 3;
        condicion = 5 <= 3;

        // Operadores Logicos
        condicion = true && false;  // && = AND
        condicion = true || true;   // || = OR
        condicion = !true;          // ! = NOT

    }
}
