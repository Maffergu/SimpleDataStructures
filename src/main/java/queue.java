import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Agregar elementos a la cola (enqueue)
        cola.offer(10);
        cola.offer(20);
        cola.offer(30);
        System.out.println("Cola: " + cola);

        // Obtener el elemento frontal de la cola (peek)
        int elementoFrontal = cola.peek();
        System.out.println("Elemento frontal: " + elementoFrontal);

        // Eliminar el elemento frontal de la cola (dequeue)
        int elementoEliminado = cola.poll();
        System.out.println("Elemento eliminado: " + elementoEliminado);

        
        System.out.println("Cola actualizada: " + cola);

        // Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿La cola está vacía? " + estaVacia);

        // Obtener el tamaño de la cola
        int tamaño = cola.size();
        System.out.println("Tamaño de la cola: " + tamaño);
    }
}