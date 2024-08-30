package calculadora;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Calculadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        System.out.println("===== CALCULADORA =====");
        Operation calc = new Operation();
        int x, y;
        String op;
        double result;
        
        x = calc.requestNumber("Digite o primeiro número inteiro para a operação: ");
        op = calc.requestOperation();
        y = calc.requestNumber("Digite o segundo número inteiro para a operação: ");
        
        result = calc.executeOperation(x, y, op);
        
        if (result > 0) {
            System.out.println("O resultado da operação é: " + result);
        }
    }
}
