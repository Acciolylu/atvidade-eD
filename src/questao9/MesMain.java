package questao9;

import java.util.Scanner;

public class MesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero  de 1 a 12 para saber qual o mês correspondente:");
        int dia = scanner.nextInt();

    Mes imprimir = new Mes();
    imprimir.qualMes(dia);  
}
}