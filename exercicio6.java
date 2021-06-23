import java.util.Scanner;
public class exercicio6 {

    public static void main(String[]args){

        boolean denovo = false;
        do{
            System.out.print("Digite um Horario, no formato 24hs: ");
            Scanner sc = new Scanner(System.in);
            String horasDigitadas = sc.next();
            int[] horasInt = convertendoInt(horasDigitadas);
            String amPm = amOuPm(horasInt[2]);
            System.out.print(horasInt[0] + ":" + horasInt[1] + amPm);

            System.out.print("  Deseja repetir o codigo (N-Não, S-Sim)");
            char repetirDenovo = sc.next().charAt(0);
            if (repetirDenovo == 'n'){
                denovo = false;
            }else if(repetirDenovo == 's'){
                denovo = true;
            }
        }while (denovo);

    }

    private static String amOuPm(int amPm){
        if(amPm == 0){
            return "AM";
        }else if (amPm == 1){
            return "PM";
        }
        return null;
    }

    static int[] convertendoInt(String horasDigitada){
        String valorDigitado[] = horasDigitada.split(":");
        int[] valorDigitadoInt = new int[3];
        valorDigitadoInt[0] = Integer.parseInt(valorDigitado[0]);
        valorDigitadoInt[1] = Integer.parseInt(valorDigitado[1]);
        if (valorDigitadoInt[0] > 12) {
            valorDigitadoInt[0] = valorDigitadoInt[0] - 12;
            valorDigitadoInt[2] = 1;
        }else if (valorDigitadoInt[0] <= 12){
            valorDigitadoInt[2] = 0;
        }
        return valorDigitadoInt;
    }
}