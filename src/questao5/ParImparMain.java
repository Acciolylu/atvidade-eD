package questao5;

import java.util.Scanner;

public class ParImparMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um número qualquer para saber se é par, impar e primo: ");
        int num = scanner.nextInt();

        ParImpar numero=new ParImpar();
        numero.verificar(num);
        
    
    }
    
}
