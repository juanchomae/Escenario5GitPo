import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aprendiendo Comandos GIT");
        System.out.println("Comandos GIT - ADD");
        System.out.println("Comandos GIT - COMMIT");
        System.out.println("Comandos GIT - PUSH");

        Random aleatorio = new Random();
        int num;
        for (int i = 0; i < 20; i++) {
            num = aleatorio.nextInt(50);
            System.out.println("numero que se genera:" + num);
        }

    }
}