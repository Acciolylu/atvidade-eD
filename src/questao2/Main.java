package questao2;


import java.util.Scanner;

import questao1.Tabuada;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int numa = scanner.nextInt();

        System.out.print("Insira o segundo numero: ");
      int numb = scanner.nextInt();

        System.out.print("Insira '1' para somar; '2' para subtrair; '3' para multiplicar;'4' para dividir : ");
        int op = scanner.nextInt();

       Operacao cal = new Operacao();
        cal.calcular(numa, numb,op); 


        
    }
    
}
