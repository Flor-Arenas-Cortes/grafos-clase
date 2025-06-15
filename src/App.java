import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Grafo dirigido: Agregar conexiones entre nodos");

        System.out.println("¿Cuántas aristas deseas agregar?");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Origen: ");
            String origen = sc.nextLine();
            System.out.println("Destino: ");
            String destino = sc.nextLine();

            grafo.agregarArista(origen, destino);
        }

        System.out.println("\n=== Resultado del grafo ===");
        grafo.mostrar();

        sc.close();
    }
}
