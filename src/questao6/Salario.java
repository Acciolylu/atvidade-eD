package questao6;

public class Salario {
    
    
    int horas;
    double result;

    public void calculoSalario(double salario, int horas) {
      
        salario = salario *horas;
        System.out.println( "Salário do funcionário: R$ "+ salario);
        
    }
        


}
