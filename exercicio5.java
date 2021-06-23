import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do produto");
        Scanner sc = new Scanner(System.in);
        float produtoValor = sc.nextFloat();
        System.out.println("Digite a taxa a ser aplicado ao produto (Ex: 2.5, 11, 30 %)");
        float taxaProduto = sc.nextFloat();
        float valorTaxa = somaImposto(taxaProduto, produtoValor);//valor da taxa
        float valorFinalProduto =  alterar(valorTaxa, produtoValor);
        System.out.println("Valor final do produto: R$" + valorFinalProduto);
    }
    static float somaImposto(float taxaImposto, float custoProduto){
        return custoProduto * (taxaImposto/100);
    }
    static float alterar(float valorTaxaProduto, float custoProduto){

        return valorTaxaProduto + custoProduto;
    }
}