package questao3;

public class Fibonacci {
    private int a=0;    
    private int b =1;
    private int som=0;
    
    public Fibonacci() {
    }

    public Fibonacci(int a, int b, int som) {
        this.a = a;
        this.b = b;
        this.som = som;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSom() {
        return som;
    }

    public void setSom(int som) {
        this.som = som;
    }
    
    public int sequencia(int a, int b){

        while (a <= 100) {
            System.out.print(a + " ");
            som = a + b;
            a = b;
            b = som;
        }
        System.out.println(a);

        return b;
       
    }
}


