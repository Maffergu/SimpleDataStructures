/* 3 de abril de 2025
 * stack.java
 * Clase que realiza un void en el que se hacen operaciones con una pila
 * Se utiliza la herramienta java util
 * Se crea una pila (Stack) de enteros (Integer)
 * Se añaden elementos a la pila
 * Se obtiene el elemento superior de la pila
 * Elimina el elemento superior de la pila
 * Verufica si la pila está vacía
 * Se obtiene el tamaño de la pila
 */

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