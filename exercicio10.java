import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("Jogo Craps");
        System.out.println("Digite 'L' para lançar os dados");
        Scanner sc = new Scanner(System.in);
        String lancarDados = sc.next();
        System.out.println("Dados Lançados");
        int resultadoDado;

        resultadoDado = (int) (Math.random()*(12-1))+2;
        System.out.println(resultadoDado);

        if (resultadoDado == 7 || resultadoDado == 11){
            System.out.println("Parabens vc ganhol");
        }else if (resultadoDado == 2 || resultadoDado == 3 || resultadoDado == 12){
            System.out.println("Craps, Você perdeu");
        }else {
            int primeiraRodada = resultadoDado;
            System.out.println("Ponto");
            while (!(resultadoDado == 7)){
                System.out.println("Digite 'L' para lançar os dados novamente");
                lancarDados = sc.next();
                resultadoDado = (int) (Math.random()*(12-1))+2;
                System.out.println(resultadoDado);
                if (resultadoDado == 7){
                    System.out.println("Você Perdeu");
                }else if (resultadoDado == primeiraRodada){
                    System.out.println("Você ganhou, parabens");
                    break;
                }
                System.out.println("Ainda tem chance");
            }
        }
    }
}