import java.util.HashMap;
import java.util.Map;

public class hash {

    public static void main(String[] args) {
        
        // Crear un diccionario (HashMap) de cadenas (String) a enteros (Integer)
        Map<String, Integer> diccionario = new HashMap<>();
        diccionario.put("manzana", 1);
        diccionario.put("plátano", 2);
        diccionario.put("naranja", 3);
        System.out.println("Diccionario: " + diccionario);

        // Obtener el valor asociado a una clave
        int valorManzana = diccionario.get("manzana");
        System.out.println("Valor de manzana: " + valorManzana);

        // Verificar si una clave existe en el diccionario
        boolean contienePlatano = diccionario.containsKey("plátano");
        System.out.println("¿Contiene plátano? " + contienePlatano);

        // Eliminar un elemento del diccionario
        diccionario.remove("naranja");
        System.out.println("Diccionario actualizado: " + diccionario);

        // Obtener el tamaño del diccionario
        int tamaño = diccionario.size();
        System.out.println("Tamaño del diccionario: " + tamaño);

        // Iterar sobre las claves del diccionario
        System.out.println("Claves del diccionario:");
        for (String clave : diccionario.keySet()) {
            System.out.println(clave);
        }

        // Iterar sobre los valores del diccionario
        System.out.println("Valores del diccionario:");
        for (int valor : diccionario.values()) {
            System.out.println(valor);
        }

        // Iterar sobre las entradas (clave-valor) del diccionario
        System.out.println("Entradas del diccionario:");
        for (Map.Entry<String, Integer> entrada : diccionario.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}