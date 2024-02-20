package questao7;

import java.util.Scanner;

public class Salario1Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 12.25;
        System.out.println("Insira abaixo quantas horas foram trabalhadas: ");
        int horas = scanner.nextInt();

        Salario1 salarioTotal = new Salario1();
        salarioTotal.calculoSalario(salario, horas);

        
    
}
}
