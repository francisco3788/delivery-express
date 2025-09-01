package main.java.colecciones;

import main.java.modelo.Pedido;
import java.util.*;

public class Ejercicios {

    public static void parteA() {
        System.out.println("=== Parte A: Listas ===");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Ana", "Pizza", 40));
        pedidos.add(new Pedido("Luis", "Hamburguesa", 25));
        pedidos.add(new Pedido("Marta", "Ensalada", 15));
        pedidos.add(new Pedido("Carlos", "Pizza", 55));
        pedidos.add(new Pedido("Elena", "Sushi", 70));

        System.out.println("ArrayList inicial: " + pedidos);

        pedidos.add(0, new Pedido("Pedro", "HotDog", 20));
        pedidos.add(0, new Pedido("Maria", "Pizza", 60));

        System.out.println("ArrayList con urgentes: " + pedidos);

        LinkedList<Pedido> pedidosLinked = new LinkedList<>(pedidos);
        System.out.println("LinkedList: " + pedidosLinked);
        System.out.println("Nota: Para 1000 pedidos urgentes, LinkedList es más eficiente (inserción O(1)).");
    }

    public static void parteB() {
        System.out.println("\n=== Parte B: HashSet ===");

        Set<Pedido> setPedidos = new HashSet<>();
        List<Pedido> lista = Arrays.asList(
                new Pedido("Ana", "Pizza", 40),
                new Pedido("Luis", "Hamburguesa", 25),
                new Pedido("Marta", "Ensalada", 15),
                new Pedido("Carlos", "Pizza", 55),
                new Pedido("Ana", "Pizza", 40) // duplicado
        );

        setPedidos.addAll(lista);
        System.out.println("HashSet: " + setPedidos);
        System.out.println("Nota: Los duplicados se eliminan automáticamente en un HashSet.");
    }

    public static void parteC() {
        System.out.println("\n=== Parte C: HashMap ===");

        Map<String, List<Pedido>> mapaPedidos = new HashMap<>();

        mapaPedidos.put("Ana", Arrays.asList(
                new Pedido("Ana", "Pizza", 40),
                new Pedido("Ana", "Sushi", 70)
        ));

        mapaPedidos.put("Luis", Arrays.asList(
                new Pedido("Luis", "Hamburguesa", 25),
                new Pedido("Luis", "Pizza", 50)
        ));

        mapaPedidos.put("Marta", Arrays.asList(
                new Pedido("Marta", "Ensalada", 15),
                new Pedido("Marta", "Pizza", 60)
        ));

        System.out.println("Pedidos de Ana: " + mapaPedidos.get("Ana"));

        for (String cliente : mapaPedidos.keySet()) {
            double total = 0;
            for (Pedido p : mapaPedidos.get(cliente)) {
                total += p.getPrecio();
            }
            System.out.println("Total gastado por " + cliente + ": $" + total);
        }
    }

    public static void parteD() {
        System.out.println("\n=== Parte D: Genéricos ===");

        List<Pedido> pedidos = Arrays.asList(
                new Pedido("Ana", "Pizza", 40),
                new Pedido("Luis", "Hamburguesa", 25),
                new Pedido("Marta", "Pizza", 70),
                new Pedido("Carlos", "Sushi", 80)
        );

        List<Pedido> pizzas = Utilidades.filtrar(pedidos, p -> p.getProducto().equals("Pizza"));
        System.out.println("Pedidos de Pizza: " + pizzas);

        List<Pedido> mayores50 = Utilidades.filtrar(pedidos, p -> p.getPrecio() > 50);
        System.out.println("Pedidos > $50: " + mayores50);
    }
}
