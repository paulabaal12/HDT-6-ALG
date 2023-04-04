import java.util.PriorityQueue;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Crear una cola de prioridad vacía
       
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del proceso:");
        String nombre = scanner.nextLine();

        // Agregar elementos a la cola de prioridad
        
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(4);

        // Imprimir los elementos de la cola de prioridad en orden
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
