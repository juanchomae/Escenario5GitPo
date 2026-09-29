
import java.util.Scanner;

public class SumaPrimos {

    public static long sumaDePrimos(int n) {
        if (n < 2) {
            return 0;
        }

        // Criba de Eratóstenes: esPrimo[i] indica si i es primo
        boolean[] esPrimo = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            esPrimo[i] = true;
        }

        for (long i = 2; i * i <= n; i++) {
            if (esPrimo[(int) i]) {
                for (long j = i * i; j <= n; j += i) {
                    esPrimo[(int) j] = false;
                }
            }
        }

        long suma = 0;
        System.out.println("primos:");
        for (int i = 2; i <= n; i++) {
            if (esPrimo[i]) {
                suma += i;
                System.out.println(i);
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un entero positivo n: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Error: n debe ser un entero positivo.");
            return;
        }

        System.out.println("La suma de los primos menores o iguales que " + n
                + " es: " + sumaDePrimos(n));
    }
}