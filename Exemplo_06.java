
import java.util.Scanner;

public class Exemplo_06 {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n = ler.nextInt();

        switch (n) {
            case 1:
                System.out.println("Voce diggitou 1");
                break;

                case 2:
                System.out.println("Voce diggitou 2");
                break;
        }
    }
}
