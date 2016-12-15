import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapA = new HashMap<String, Integer>();

        mapA.put("Abuelo", 100);
        mapA.put("Padre", 50);
        mapA.put("Hijo", 25);

        int elemento = mapA.get("Abuelo");
        System.out.println("Abuelo: " + elemento);

        mapA.remove("Padre");

        for (Object llave : mapA.keySet()) {
            Object valor = mapA.get(llave);
            System.out.println(llave + " : " + valor);
        }
    }
}
