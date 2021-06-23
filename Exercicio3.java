import java.util.Scanner;

public class Exercicio3{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe primeiro numero: ");
        float primeiroNumero = sc.nextFloat();

        System.out.print("Informe segundo numero: ");
        float segundoNumero = sc.nextFloat();

        System.out.print("informe terceiro numero: ");
        float terceiroNumero = sc.nextFloat();

        System.out.print(somaNumeros(primeiroNumero, segundoNumero, terceiroNumero));
    }

    static float somaNumeros(float primeiroNumero, float segundoNumero, float terceiroNumero){
        return (primeiroNumero + segundoNumero + terceiroNumero);
    }
}