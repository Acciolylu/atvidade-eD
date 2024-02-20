package questao9;

public class Mes {

    int mes;

    public  int qualMes (int mes){
        
        switch (mes) {
            case 1:
               
                System.out.printf("O mês 1 é Janeiro");
                break;
            case 2:
               
                System.out.printf("O mês 2 é Fevereiro");
                break;
            case 3:
                
                System.out.printf("O mês 3 é Março" );
                break;
            case 4:
          
            System.out.printf("O mês 4 é Abril");
            break;

            case 5:

            System.out.printf("O mês 5 é Maio");
            break;

            case 6:
            System.out.printf("O mês 6 é Junho");
            break;

            case 7:
            System.out.printf("O mês 7 é Julho");
            break;

            case 8:
            System.out.printf("O mês 8 é Agosto");
            break;

            case 9:
            System.out.printf("O mês 9 é Setembro");
            break;

            case 10:
            System.out.printf("O mês 10 é Outubro");
            break;

            case 11:
            System.out.printf("O mês 11 é Novembro");
            break;

            case 12:
            System.out.printf("O mês 12 é Dezembro");
            break;
             default:
            System.out.println("Numero inválido, por favor insira um número entra 1 e 12");
        
    }
        return mes;
        
    }
}
