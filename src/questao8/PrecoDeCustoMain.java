package questao8;

import java.util.Scanner;


public class PrecoDeCustoMain {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o preço de venda do produto:");
    double precoVenda = scanner.nextFloat();

    System.out.println("Digite o preço de custo do produto:");
    double precoCusto = scanner.nextFloat();

     PrecoDeCusto preco = new PrecoDeCusto();
     preco.calculoLucro(precoCusto, precoVenda);


    
}
}