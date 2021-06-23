import java.util.Scanner;

public class exercicio9{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sequencia de numero a ser invertidas: ");
        String numeroInteiro = String.valueOf(sc.nextInt());
        String[] separadosDigitos = numeroInteiro.split("");
        for(int i = (separadosDigitos.length-1); i>=0; i--){
            System.out.print(separadosDigitos[i]);

        }
    }
}