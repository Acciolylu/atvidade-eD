package questao8;

public class PrecoDeCusto {

    double custo=0;
    double venda=0;
    double valor=0;

    public  void calculoLucro(double custo,double venda){
        double valor= custo + (custo * 0.5);
        double lucro=venda-valor ;
        
        if (lucro > 0 ){
           System.out.println("Há lucro de "+ lucro+ " RS$ por produto vendido");
           }else{ 
               System.out.println("Há um prejuízo de "+lucro+" R$ por  produto vendido");
        }
    }
    
}
