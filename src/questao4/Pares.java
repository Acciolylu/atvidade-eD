package questao4;

public class Pares {

       
        private int mult1=0;
        private int mult = 1;
        private int n =0;
    
    
        public int calcularMult(int n){  //funcao que calcula a multiplicação dos pares 
            for (int i =1 ; i <=n ;i++){   //laco para percorrer o intervalo    
                if (i%2==0) {       //chama a funcao verificar se é par
                    mult1 = i;
                    mult= mult * mult1;
         
    }
    
            }
            System.out.println("O resultado da multiplicação entre os numeros pares do intervalo entre 1 e 30 é: "+ mult);
            return mult;
        }
    }
    
    

