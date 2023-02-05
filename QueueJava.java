import java.util.LinkedList;
import java.util.Queue;

public class QueueJava{
    public static void main(String[] args) {
        
        Queue<String> carros = new LinkedList();

        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Tiggo 3X");

        System.out.println("Topo da fila: " + carros.peek()); //Apresenta o elemento no topo da lista

        System.out.println("Topo da fila: " + carros.poll()); //Apresenta e retira o elemento no topo da lista

        System.out.println(carros);

        System.out.println(carros.isEmpty() ? "Fila vazia" : "Fila com elementos");
 

         
    }
}