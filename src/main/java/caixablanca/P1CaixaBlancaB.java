package caixablanca;

public class P1CaixaBlancaB {
    public static double doOperation(double op1, double op2, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = op1 + op2;
                break;
            case "-":
                result = op1 - op2;
                break;
            case "*":
                result = op1 * op2;
                break;
            case "/":
                result = op1 / op2;
                break;
            case "^":
                result = (int) Math.pow(op1, op2);
                break;
            case "%":
                result = op1 % op2;
                break;
        }
        return result;
    }
}

