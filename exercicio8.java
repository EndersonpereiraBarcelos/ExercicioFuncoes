import java.util.Scanner;

public class exercicio8{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Numero inteiro: ");
        String numeroInteiro = String.valueOf(sc.next());
        String[] quantidadeDeDigitos = numeroInteiro.split("");
        System.out.print("Quantidade de digitos do numero informado: " + quantidadeDeDigitos.length);
    }
}