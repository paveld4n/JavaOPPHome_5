
public class CalculatorModel {
private int result;

public void add(int number1, int number2) {
    result = number1 + number2;
}

public void subtrac(int number1, int number2) {
    result = number1 - number2;
}
public void multip(int number1, int number2) {
    result = number1 * number2;
}
public void divis(int number1, int number2) {
    result = number1 / number2;
}

public int getResult() {
    return result;
}
}