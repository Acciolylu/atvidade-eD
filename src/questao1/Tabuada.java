package questao1;
public class Tabuada {
    private int num;
    private int a;

    
    public Tabuada() {
    }


    public Tabuada(int num, int a) {
        this.num = num;
        this.a = a;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public int getA() {
        return a;
    }


    public void setA(int a) {
        this.a = a;
    }

    public int tabuada(int num) {
        int a= 0;

        while (a <= 10) {
            int resultado = num * a;
            System.out.println(num + " x " + a + " = " + resultado);
            a++;
        }
        return a;
    }

}

