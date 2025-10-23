
import java.util.Scanner;

public class Exemplo_05 {
    public static void main(String[] args) {
        String str;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite uma letra A, B, C");
        str = ler.next();

        switch(str){
            case "A":
            System.out.println("Você digitou a letra A");
            break;
        }
        
    }
}
