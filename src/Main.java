import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                1. Raíz Cuadrada
                2. Valor Absoluto
                0. Salir 
                """;

        int opcion;
        System.out.print("Introduce un numero a analizar: ");
        double numero = sc.nextDouble();
        do {
            System.out.println(menu);

            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Raíz cuadrada de %.2f: %.2f%n", numero, MiniCalculadoraEjemplo.raizCuadrada(numero));
                case 2 -> System.out.printf("Valor Absoluto de %.2f: %.2f%n", numero, MiniCalculadoraEjemplo.valorAbsoluto(numero));
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion incorrecta");
            }
        } while (opcion != 0);
    }
}