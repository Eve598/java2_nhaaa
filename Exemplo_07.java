
import java.util.Scanner;

public class Exemplo_07 {
    public static void main(String[] args) {
        int n;
        int ano;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        n = ler.nextInt();
        System.err.println("Digite um ano: ");
         ano =  ler.nextInt();

         switch(n){
            case 1:
            if((2025 - ano) >= 20){
                System.out.println("vc é quarentão");
            }
            break;

            case 2:
            System.out.println("vc digitou 2");
            break;
            default:
            System.out.println("valor invalido");
         }
    }
}
