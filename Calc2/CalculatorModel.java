
public class CalculatorModel {
private double result;

public void add(double number1, double number2) {
    result = number1 + number2;
}

public void subtrac(double number1, double number2) {
    result = number1 - number2;
}
public void multip(double number1, double number2) {
    result = number1 * number2;
}
public void divis(double number1, double number2) {
    result = number1 / number2;
}

public double getResult() {
    return result;
}
}