package questao4;

public class Impares {
 
    private int soma1=0;
    private int soma = 0;
    public int calcularSoma(int n){  //funcao que calcula a soma dos numeros impares de um intervalo  
        for (int i =1 ; i <=n ;i++){   //laco para percorrer o intervalo    
            if (i%2==1) {       //chama a funcao verificar se eh impar
                soma1 = i;
                soma= soma+ soma1;


            

}

        }
        System.out.println("A soma dos numeros impares no intervalo de 0 a 30 é: "+ soma);
        return soma;
    }
}
