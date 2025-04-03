import java.util.Stack;

public class stack {

    public static void main(String[] args) {
       
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Pila: " + pila);

        // Obtener el elemento superior de la pila
        int elementoSuperior = pila.peek();
        System.out.println("Elemento superior: " + elementoSuperior);

        // Eliminar el elemento superior de la pila
        int elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado);
        System.out.println("Pila actualizada: " + pila);

        // Verificar si la pila está vacía
        boolean estaVacia = pila.isEmpty();
        System.out.println("¿La pila está vacía? " + estaVacia);

        // Obtener el tamaño de la pila
        int tamaño = pila.size();
        System.out.println("Tamaño de la pila: " + tamaño);
    }
}