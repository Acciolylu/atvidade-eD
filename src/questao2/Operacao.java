package questao2;

public class Operacao {

    private int numa;
    private int numb;
    private int op;

public Operacao() {
    }

public Operacao(int numa, int numb, int op) {
    this.numa = numa;
    this.numb = numb;
    this.op = op;
}

public int getNuma() {
    return numa;
}

public void setNuma(int numa) {
    this.numa = numa;
}

public int getNumb() {
    return numb;
}

public void setNumb(int numb) {
    this.numb = numb;
}

public int getOp() {
    return op;
}

public void setOp(int op) {
    this.op = op;
}

public int  calcular(int numa, int numb, int op){
 int result=0;
    switch (op) {
        case 1:
            result = numa + numb;
            System.out.printf("O resultado é da expressão "+ numa + " + " + numb+ "é igual a: "+ result);
            break;
        case 2:
            result = numa - numb;
            System.out.printf("O resultado é da expressão "+ numa + " - " + numb+ "é igual a: "+ result);
            break;
        case 3:
            result = numa * numb;
            System.out.printf("O resultado é da expressão "+ numa + " * " + numb+ "é igual a: "+ result);
            break;
        case 4:
        result = numa / numb;
        System.out.printf("O resultado é da expressão "+ numa + " / " + numb+ " é igual a: "+ result);
        break;
        default:
        System.out.println("Numero para operador invalido. Por favor siga as instruções e repita o processo");
    
}

return result;

    
}
}
