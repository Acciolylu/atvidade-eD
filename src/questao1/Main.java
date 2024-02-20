package questao1;
import java.util.Scanner;

public class Main {
    
public static void main(String[] args) {
    int num = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número para gerar a tabuada: ");
    num = scanner.nextInt();
 scanner.close();

    
    Tabuada tab = new Tabuada();
    tab.tabuada(num);

        
    }
}
