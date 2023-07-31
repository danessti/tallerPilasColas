package TallerPilasColas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Clientes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int ciclo = 0;
        int i = 0;
        Random random = new Random();

        Queue<String> atencionClientes = new LinkedList<>();
        Queue<Integer> tickets = new LinkedList<>();

        do {

            menu();
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    solicitudCliente(sc, random, atencionClientes, tickets);
                    break;

                case 2:
                    atenderCliente(atencionClientes, tickets);
                    break;

                case 3:
                    clientesEnEspera(atencionClientes, tickets);
                    break;

                case 0:
                    System.out.println("Salir del programa");
                break;

                default:
                    System.out.println("Opcion no valida");
                break;

            }

        } while (ciclo == 0);

    }

    private static void clientesEnEspera(Queue<String> atencionClientes, Queue<Integer> tickets) {
        if (tickets.isEmpty() && atencionClientes.isEmpty()) {
            System.out.println("No hay clientes en espera");
        } else {
            System.out.println(tickets + " " + atencionClientes);
        }
    }

    private static void atenderCliente(Queue<String> atencionClientes, Queue<Integer> tickets) {
        if (tickets.isEmpty() && atencionClientes.isEmpty()) {
            System.out.println("No clientes para atender");
        } else {
            System.out.println("Cliente atendido");
            System.out.println("Ticket atendido: " + tickets.poll() + " Cliente atendido: " + atencionClientes.poll());
        }
    }

    private static void solicitudCliente(Scanner sc, Random random, Queue<String> atencionClientes, Queue<Integer> tickets) {
        int i;
        System.out.println("Solicitar Atencion al Cliente");

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.next();

        atencionClientes.offer(nombre);

        i = random.nextInt(100);
        tickets.offer(i);

        System.out.println("Tickets: " + tickets + " Cliente: " + atencionClientes);
    }

    public static void menu() {

        System.out.println(" Menu");
        System.out.println("1. Solicitar Atencion");
        System.out.println("2. Atender Cliente");
        System.out.println("3. Clientes en espera");
        System.out.println("0. Salir de programa");

    }

}