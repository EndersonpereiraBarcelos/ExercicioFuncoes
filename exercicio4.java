// IMCOMPLETO


import java.util.Scanner;

public class exercicio4{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero");
        String  resposta = sc.next();

        argumento();
    }

    static void argumento(){

        if(1>=100){
            System.out.println("positivo");
        }else if(1 <= 0){
            System.out.println("negativo");
        }
        //System.out.println("a sua resposta foi " + resposta)
    }
}
