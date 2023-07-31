package TallerPilasColas;

import java.util.Scanner;
import java.util.Stack;

public class Usuarios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> nombresUsuarios = new Stack<>();

        int chat = 0;

        System.out.println("INICIO EL CHAT");

        do {

            menu(sc);
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    agregarUsuario(sc, nombresUsuarios);
                    break;

                case 2:

                    if (nombresUsuarios.empty()) {
                        System.out.println("Sin usuarios");
                    } else {
                        System.out.println("Usuario desconectado el usuario " + nombresUsuarios.pop());
                    }

                break;

                case 3:
                    System.out.println(nombresUsuarios);
                break;

                case 0:
                    System.out.println("FINALIZO EL CHAT");
                    chat = 0;
                break;

                default:
                    System.out.println("Opcion no disponible");
                break;

            }

        } while (chat == 0);

    }

    private static void agregarUsuario(Scanner sc, Stack<String> nombresUsuarios) {
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next();

        nombresUsuarios.push(nombre);

        if (!nombresUsuarios.isEmpty()) {
            System.out.println("Se conecto " + nombre);
        }
    }

    public static void menu(Scanner sc) {

        System.out.println("            Menu\n");
        System.out.println("1. Conectar usuario");
        System.out.println("2. Desconectar usuario");
        System.out.println("3. Mostrar usuarios");
        System.out.println("0. Salir del chat");

    }

}
