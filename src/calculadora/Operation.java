package calculadora;

import java.util.Scanner;

public class Operation {
    Scanner scanner = new Scanner(System.in);
    
    // Methods
    public int requestNumber(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
    
    public String requestOperation() {
        System.out.print("Digite a operação (+, -, *, /): ");
        return scanner.next();
    }
    
    public double executeOperation(int x, int y, String operation) {
        double result = 0;

        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                if (y != 0) result = x / y;
                else System.out.println("Não é possível realizar uma divisão por 0");
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        return result;
    }
}
