package questao5;

public class ParImpar {

    int num=0;
    int i=0;
    int result=0;

    public void verificar(int num){
        if (num % 2 == 0){
            System.out.println("\nO número " + num + " é PAR.");
        } else{
            System.out.print("\nO número " + num + " é IMPAR.");
        }

        for(i=2; i<num;i++){
		
            if( num%i==0){
            result++;	
            }	
            }
            
            if (result == 0){
                
                System.out.print(" E o número " + num +" também é primo.");
                
            }
            
            else {
                System.out.print(" E o número " + num + " não é primo.");
            }
    
   
}
}
