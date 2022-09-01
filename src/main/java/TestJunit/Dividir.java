package TestJunit;

public class Dividir {

    int num1;
    int num2;

    public void dividisao() {
        if (num1 > 0 && num2 > 0 ){
       int resultado =  num1 / num2;
        } else {
            throw new ArithmeticException("Impossivel divisa por zero");
        }

    }
}
