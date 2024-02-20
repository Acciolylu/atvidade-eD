package questao6;

import java.util.Scanner;

public class SalarioMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 12.25;
        System.out.println("Insira abaixo quantas horas foram trabalhadas: ");
        int horas = scanner.nextInt();

        Salario salarioTotal = new Salario();
        salarioTotal.calculoSalario(salario, horas);

        
    
}
}
